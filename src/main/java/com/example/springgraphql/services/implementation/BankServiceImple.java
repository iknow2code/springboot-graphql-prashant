package com.example.springgraphql.services.implementation;

import com.example.springgraphql.entities.Bank;
import com.example.springgraphql.repositories.BankRepo;
import com.example.springgraphql.services.BankServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImple implements BankServices {
    private BankRepo bankRepo;

    @Autowired
    public BankServiceImple(BankRepo bankRepo){this.bankRepo=bankRepo;
    }
    @Override
    public Bank create(Bank banks) {
        return this.bankRepo.save(banks);
    }

    @Override
    public List<Bank> getAll() {
        return this.bankRepo.findAll();
    }

    @Override
    public Bank get(int id) {
        return this.bankRepo.findById(id).orElseThrow(() -> new RuntimeException("Account Details you are looking for not found in server. "));
    }
}
