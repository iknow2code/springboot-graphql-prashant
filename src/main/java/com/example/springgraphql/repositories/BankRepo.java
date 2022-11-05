package com.example.springgraphql.repositories;

import com.example.springgraphql.entities.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepo  extends JpaRepository <Bank, Integer> {
}
