package com.example.chama.Repository;


import com.example.chama.Entity.members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface membersRepository extends JpaRepository<members,Long> {


    List<members> findByIdNoOrName(String idNo, String name);

}
