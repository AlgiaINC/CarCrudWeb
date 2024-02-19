package com.example.SnakeProject.repository;

import com.example.SnakeProject.dto.CarDto;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CarRepository {
    private final Map<Integer, CarDto> database = new HashMap<>();

    public CarDto get(Integer id){
        return database.get(id);
    }

    public void add(Integer id, CarDto carDto){
        database.put(id,carDto);
    }

    public void delete(Integer id){
        database.remove(id);
    }


    public List <CarDto> getAll(){
        return database.values().stream().toList();
    }
}
