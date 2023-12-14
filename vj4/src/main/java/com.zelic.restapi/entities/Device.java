package com.zelic.restapi.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
//@NoArgsConstructor
public class Device {

    private long id;
    private Set<com.zelic.restapi.entites.Consumption> consumptions;

}
