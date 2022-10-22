package com.example.chama.Repository;

import com.example.chama.Entity.monthlyPayments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface monthlyPaymentsRepository extends JpaRepository<monthlyPayments,Long> {

//    void findAllTotalBalance(int totalBalance);
}
