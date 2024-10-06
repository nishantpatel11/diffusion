package com.fdc.diffusion.model;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Builder
public class Person implements Serializable {
    private String name;
    private int age;
    private double salary;
}
