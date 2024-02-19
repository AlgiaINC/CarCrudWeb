package com.example.SnakeProject.controller;


import com.example.SnakeProject.dto.CarDto;
import com.example.SnakeProject.service.CarService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class CarController {
    private final CarService carService;

    @GetMapping("/cars")
    public List<CarDto> getCars(){
        return carService.getAll();
    }

    @PostMapping("/addCar/{id}")
    public void addCar(@RequestBody CarDto carDto, @PathVariable Integer id){
        carService.add(id, carDto);
    }

    @DeleteMapping("/deleteCar/{id}")
    public void deleteCar(@PathVariable Integer id){
        carService.delete(id);
    }
}