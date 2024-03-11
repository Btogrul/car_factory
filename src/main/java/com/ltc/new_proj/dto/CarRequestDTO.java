package com.ltc.new_proj.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CarRequestDTO {
    private String brand;
    private String model;
    private Integer year;
}
