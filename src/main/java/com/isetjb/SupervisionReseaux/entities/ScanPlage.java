package com.isetjb.SupervisionReseaux.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScanPlage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Plage plage;
    @ManyToOne
    private User user;
    @OneToMany
    private List<Machine> machineList;
    private LocalDateTime dateScan;
}
