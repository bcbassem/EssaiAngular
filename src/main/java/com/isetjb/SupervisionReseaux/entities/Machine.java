package com.isetjb.SupervisionReseaux.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Machine {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ipAddress;
    private LocalDateTime dateDebutConnexion;
    @SuppressWarnings("JpaAttributeTypeInspection")
    private List<String> listeUdp;
    @SuppressWarnings("JpaAttributeTypeInspection")
    private List<String> listeTcp;

    @ManyToOne()
    private Plage plage;
    @OneToOne
    private User user;
}
