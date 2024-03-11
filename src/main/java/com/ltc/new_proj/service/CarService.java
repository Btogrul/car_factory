package com.ltc.new_proj.service;

import com.ltc.new_proj.dto.CarResponseDTO;
import com.ltc.new_proj.entity.Car;
import com.ltc.new_proj.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepository carRep;
    private final ModelMapper modelMapper;
    public List<CarResponseDTO> getAll() {
        ArrayList<Car> all = carRep.findAll();
        List<CarResponseDTO> responseList = all.stream()
                .map(this::mapToCarResponseDto)
                .collect(Collectors.toList());

        return responseList;
    }
    private CarResponseDTO mapToCarResponseDto(Car car) {
        return modelMapper.map(car, CarResponseDTO.class);
    }

    public void addCar(CarResponseDTO newCar) {
        Car car = modelMapper.map(newCar, Car.class);
        carRep.save(car);
    }

    public void delete(Long id) {
        Car car = carRep.findById(id).orElseThrow();
        carRep.delete(car);
    }

    public void update(Long id, CarResponseDTO carDTO) {
        Car car = carRep.findById(id).orElseThrow();
        modelMapper.map(carDTO, car);
        carRep.save(car);
    }

}
