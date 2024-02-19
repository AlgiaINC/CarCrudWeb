package com.example.SnakeProject.dto;

import lombok.*;

@AllArgsConstructor
@Data
@ToString
public class CarDto {
    private String name;
    private Integer odometer;
    private Integer age;
}
