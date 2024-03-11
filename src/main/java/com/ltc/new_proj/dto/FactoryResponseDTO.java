package com.ltc.new_proj.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class FactoryResponseDTO {
    private String name;
    private String location;
    private Long id;
}
