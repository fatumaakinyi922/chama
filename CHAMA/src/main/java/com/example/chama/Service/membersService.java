package com.example.chama.Service;



import com.example.chama.Entity.members;
import com.example.chama.Repository.membersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class membersService {
private final membersRepository membersRepository;

    public void addNewMembers(members members) {
    membersRepository.save(members);
    }

    public List<members> findAll() {
        return membersRepository.findAll();
    }


    public List<members> findByIdNoOrName(String idNo, String name) {
        List<members> membersOptional = membersRepository.findByIdNoOrName(idNo,name);
        if (membersOptional.isEmpty()){
            throw new IllegalStateException("the member dont exist");
        }
       return membersRepository.findByIdNoOrName(idNo,name);
    }


}
