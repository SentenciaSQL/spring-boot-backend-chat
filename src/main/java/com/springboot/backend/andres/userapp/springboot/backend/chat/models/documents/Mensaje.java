package com.springboot.backend.andres.userapp.springboot.backend.chat.models.documents;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Mensaje implements Serializable {

    private String texto;
    private Long fecha;

}
