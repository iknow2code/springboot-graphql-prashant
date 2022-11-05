package com.example.springgraphql.controllers;
import com.example.springgraphql.entities.Bank;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.springgraphql.services.BankServices;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
public class BankController {
    @Autowired
    private BankServices bankServices;
    //Create
    @MutationMapping("setDetails")
    public Bank create(@Argument BankInput bank){
        Bank b=new Bank();
        b.setName(bank.getName());
        b.setPhone(bank.getPhone());
        b.setEmail(bank.getEmail());
        b.setAddress(bank.getAddress());


        return this.bankServices.create(b);
    }

    //get all
    @QueryMapping("getAllDetails")
    public List<Bank> getAll(){
        return this.bankServices.getAll();

    }
   @QueryMapping("getDetails")
   public Bank get(@Argument int id){
            return this.bankServices.get(id);
    }

}
@Getter
@Setter
class BankInput{
    private String name;
    private String phone;
    private String email;
    private String address;
}
