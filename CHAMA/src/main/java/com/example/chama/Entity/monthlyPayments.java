package com.example.chama.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.yaml.snakeyaml.events.Event;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
//@SuppressWarnings("unused")

@Table(name = "monthlyPayments")

public class monthlyPayments {


    @Id
    @SequenceGenerator(

            name = "monthlyPayments_sequence",
            sequenceName = "monthlyPayments_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "monthlyPayments_sequence"
    )


    private Long Id;
    private String idNo;

    private String name;

    private String paymentDate;
    private Integer amount;
    private Integer latenessFine;
    private Integer phoneRingingFine;
    private Integer absentFine;
    private Integer otherFines;
    @Column(nullable = true)
    private Integer totalFine=0;

    private Integer totalBalance=0;
    @Column(nullable = true)
    private Integer calamityAmount;




//    @ManyToOne(cascade = CascadeType.ALL)
//@JoinColumn(name = "calamityAmount",insertable = false,updatable = false)
//private  calamity calamity;

}




