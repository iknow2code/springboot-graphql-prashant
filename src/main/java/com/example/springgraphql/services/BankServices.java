package com.example.springgraphql.services;

import com.example.springgraphql.entities.Bank;
import java.util.List;

public interface BankServices {
    //Create
     Bank create(Bank banks);
     // get all bankaccountdetails
    List<Bank> getAll();

    //get singke bankaccount details
    Bank get(int id);


}
