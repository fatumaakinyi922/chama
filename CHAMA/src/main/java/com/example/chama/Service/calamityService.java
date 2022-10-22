package com.example.chama.Service;

import com.example.chama.Entity.calamity;
import com.example.chama.Entity.monthlyPayments;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class calamityService {
    @Autowired
private final com.example.chama.Repository.calamityRepository calamityRepository;
//private final com.example.chama.Repository.monthlyPaymentsRepository monthlyPaymentsRepository;
//    private monthlyPayments monthlyPayments;

    public void addNewCalamity(calamity calamity) {
        calamityRepository.save(calamity);

    }
}
