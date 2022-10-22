package com.example.chama.Controller;

import com.example.chama.Entity.members;
import com.example.chama.Service.membersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000" )
@RequestMapping(path = "api/v1/registeringMembers")
public class membersController {

private final membersService membersService;
@Autowired
    public membersController(com.example.chama.Service.membersService membersService) {
        this.membersService = membersService;
    }

    @PostMapping("/addingMembers")
    public void addNewMembers(@RequestBody members members){
        membersService.addNewMembers(members);
    }



    @GetMapping("/getAllMembers")
    public List<members> findAllMembers(){
        return membersService.findAll();
    }
    @GetMapping("/searchingMember/{idNo}")
    public List<members> getMemberByIdNoOrName(@PathVariable(name = "idNo") String idNo,
                                               @PathVariable(required = false) String name){
    return membersService.findByIdNoOrName(idNo,name);
    }
    }

