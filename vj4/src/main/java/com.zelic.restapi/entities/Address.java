package com.zelic.restapi.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
//@NoArgsConstructor
public class Address {

    private long id;
    private String street;
    private String number;
    private String city;
    private String zipCode;




}
