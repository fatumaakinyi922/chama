package com.example.chama.Controller;

import com.example.chama.Entity.monthlyPayments;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = "api/v1/monthlyPayments")

public class monthlyPaymentsController {

    private final com.example.chama.Service.monthlyPaymentsService monthlyPaymentsService;
@Autowired
    public monthlyPaymentsController(com.example.chama.Service.monthlyPaymentsService monthlyPaymentsService) {
        this.monthlyPaymentsService = monthlyPaymentsService;
    }

    @PostMapping("/payments")
    public void addNewMonthlyPayments(@RequestBody monthlyPayments monthlyPayments){
//                                      @RequestParam int amount,@RequestParam int latenessFine,@RequestParam int totalBalance) {
        monthlyPaymentsService.addNewMonthlyPayments(monthlyPayments);
    }

    @GetMapping("/individualPayments")
    public List<monthlyPayments> getAllMonthlyPaymentByIdNoOrAmount(@RequestParam String idNo,
                                                            @RequestParam int amount
    ) {
        return monthlyPaymentsService.findAllMonthlyPaymentsByIdNoOrAmount(idNo, amount);
    }

    @GetMapping("/allMonthlyPayments")
    public List<monthlyPayments> findAll() {
        return monthlyPaymentsService.findAll();

    }

}
