package com.example.SnakeProject.service;

import com.example.SnakeProject.dto.CarDto;
import com.example.SnakeProject.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepository carRepository;

    public CarDto get(Integer id){
        return carRepository.get(id);
    }


    public void add(Integer id, CarDto carDto){
        carRepository.add(id, carDto);
    }

    public void delete(Integer id){
        carRepository.delete(id);
    }

    public List<CarDto> getAll(){
        return carRepository.getAll();
    }
}