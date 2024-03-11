package com.ltc.new_proj.controller;

import com.ltc.new_proj.dto.FactoryResponseDTO;
import com.ltc.new_proj.service.FactoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/factory")
public class FactoryController {
    private final FactoryService factoryService;
    @GetMapping("/all")
    public List<FactoryResponseDTO> getAllFactories() {
        return factoryService.getAll();
    }
    @PostMapping
    public ResponseEntity<String> addFac(@RequestBody FactoryResponseDTO newFactory) {
        factoryService.addFactory(newFactory);
        return ResponseEntity.ok("Factory added");
    }

    @PutMapping
    public void updateFac(@RequestParam Long id, @RequestBody FactoryResponseDTO updatedFactory) {
        factoryService.update(id, updatedFactory);
    }

    @DeleteMapping
    public void deleteFac(@RequestParam Long id) {
        factoryService.delete(id);
    }


}
