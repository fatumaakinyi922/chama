package com.example.chama.Entity;



import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Data
@Table(name = "members")
public class members {
    @Id
    @SequenceGenerator(

            name = "members_sequence",
            sequenceName = "members_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "members_sequence"
    )

    private Long Id;
    private String name;
    private String idNo;
    private String telNo;
    private String spouseName;
    private String spouseContact;
    private String residence;
    private String natureOfWork;

    public members() {
    }

    public members(String name, String idNo, String telNo, String spouseName,
                   String spouseContact, String residence, String natureOfWork) {
        this.name = name;
        this.idNo = idNo;
        this.telNo = telNo;
        this.spouseName = spouseName;
        this.spouseContact = spouseContact;
        this.residence = residence;
        this.natureOfWork = natureOfWork;
    }
}



