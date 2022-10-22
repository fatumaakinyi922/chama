package com.example.chama.Controller;

import com.example.chama.Entity.calamity;
import com.example.chama.Service.calamityService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping(path = "api/v1/calamity")

public class calamityController {
    @Autowired
    private final calamityService calamityService;

    @PostMapping("/addingCalamity")
    public void addNewCalamity(@RequestBody calamity calamity){
        calamityService.addNewCalamity(calamity);
    }
}
