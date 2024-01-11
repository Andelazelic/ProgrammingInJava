package com.andelazelic.vjezba6_1.entitites;


import lombok.Data;

import javax.persistence.*;

@Data @Entity
@Table(name = "device")
public class Device {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    private String name;

    @OneToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn (
            referencedColumnName = "id", unique = true
    )
    private Client client;
}
