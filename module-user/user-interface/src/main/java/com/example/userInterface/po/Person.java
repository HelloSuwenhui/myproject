package com.example.userInterface.po;

import lombok.Data;

import java.io.Serializable;

@Data
public class Person implements Serializable {
    private int id;
    private String name;
}
