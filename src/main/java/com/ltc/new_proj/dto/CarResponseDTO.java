package com.ltc.new_proj.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CarResponseDTO {
    private String brand;
    private String model;
    private Integer year;
    private Long id;
}
