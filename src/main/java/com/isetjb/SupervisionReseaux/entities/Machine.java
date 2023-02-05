package com.isetjb.SupervisionReseaux.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Machine {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ipAddress;

    @ManyToOne()
    private Plage plage;
    @OneToOne
    private User user;
}
