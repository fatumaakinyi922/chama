package com.example.chama.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "tbl_calamity")
public class calamity {
    @Id
    @SequenceGenerator(

            name = "calamity_sequence",
            sequenceName = "calamity_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "calamity_sequence"
    )

    private  Long id;
    private String reason;
    private  Integer calamityAmount;


}
