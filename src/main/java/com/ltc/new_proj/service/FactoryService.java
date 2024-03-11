package com.ltc.new_proj.service;

import com.ltc.new_proj.dto.FactoryResponseDTO;
import com.ltc.new_proj.entity.Factory;
import com.ltc.new_proj.repository.FactoryRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FactoryService {
    private final FactoryRepository factoryRep;
    private final ModelMapper modelMapper;

    public List<FactoryResponseDTO> getAll() {
        ArrayList<Factory> all = factoryRep.findAll();
        List<FactoryResponseDTO> responseList = all.stream()
                .map(this::mapToFactoryResponseDto)
                .collect(Collectors.toList());

        return responseList;
    }
    private FactoryResponseDTO mapToFactoryResponseDto(Factory factory) {
        return modelMapper.map(factory, FactoryResponseDTO.class);
    }

    public void addFactory(FactoryResponseDTO newFac) {
        Factory factory = modelMapper.map(newFac, Factory.class);
        factoryRep.save(factory);
    }

    public void delete(Long id) {
        Factory fac = factoryRep.findById(id).orElseThrow();
        factoryRep.delete(fac);
    }

    public void update(Long id, FactoryResponseDTO facDTO) {
        Factory fac = factoryRep.findById(id).orElseThrow();
        modelMapper.map(facDTO, fac);
        factoryRep.save(fac);
    }

}
