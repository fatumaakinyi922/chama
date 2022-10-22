package com.example.chama.Repository;

import com.example.chama.Entity.calamity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface calamityRepository extends JpaRepository<calamity,Long> {


}
