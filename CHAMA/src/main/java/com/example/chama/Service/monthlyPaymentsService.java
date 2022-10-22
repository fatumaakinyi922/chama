package com.example.chama.Service;

import com.example.chama.Entity.calamity;
import com.example.chama.Entity.monthlyPayments;
import com.example.chama.Repository.calamityRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class monthlyPaymentsService {
    @Autowired
    private final com.example.chama.Repository.monthlyPaymentsRepository monthlyPaymentsRepository;


    public void addNewMonthlyPayments(monthlyPayments monthlyPayments) {
        int c;

        int a = monthlyPayments.getAmount();

        int b =monthlyPayments.getLatenessFine();
        int d=monthlyPayments.getAbsentFine();
        int e = monthlyPayments.getPhoneRingingFine();
        int f = monthlyPayments.getOtherFines();
        int z = monthlyPayments.getCalamityAmount();

        int h;
        h = b+d+e+f;
        c = a-h;

System.out.println("Total Balance is: "+c);
        System.out.println("Total fine is:"+h);
        monthlyPayments.setTotalFine(h);


if (z !=0){
    monthlyPayments.setTotalBalance(c-z);
}else if (z ==0){
    monthlyPayments.setTotalBalance(c);
}
 monthlyPaymentsRepository.save(monthlyPayments);

    }

    public List<monthlyPayments> findAllMonthlyPaymentsByIdNoOrAmount(String idNo, int amount) {

        return monthlyPaymentsRepository.findAll();
    }

    public List<monthlyPayments> findAll() {
        return monthlyPaymentsRepository.findAll();
    }




}

