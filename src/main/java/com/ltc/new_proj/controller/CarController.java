package com.ltc.new_proj.controller;

import com.ltc.new_proj.dto.CarResponseDTO;
import com.ltc.new_proj.dto.FactoryResponseDTO;
import com.ltc.new_proj.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/car")
public class CarController {
    private final CarService carService;
    @GetMapping("/all")
    public List<CarResponseDTO> getAllCar() {
        return carService.getAll();
    }
    @PostMapping
    public ResponseEntity<String> addCar(@RequestBody CarResponseDTO newCar) {
        carService.addCar(newCar);
        return ResponseEntity.ok("Car added");
    }

    @PutMapping
    public void updateCar(@RequestParam Long id, @RequestBody CarResponseDTO upCar) {
        carService.update(id, upCar);
    }

    @DeleteMapping
    public void deleteCar(@RequestParam Long id) {
        carService.delete(id);
    }

}
