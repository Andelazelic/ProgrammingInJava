package com.zelic.restapi.entities;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
//@NoArgsConstructor
public class Client {

    private long id;
    private String name;
    private String surname;
    private Address address;
    private long deviceId;

}
