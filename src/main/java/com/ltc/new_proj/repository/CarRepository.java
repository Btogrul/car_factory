package com.ltc.new_proj.repository;

import com.ltc.new_proj.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    ArrayList<Car> findAll();
}
