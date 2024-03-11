package com.ltc.new_proj.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class FactoryRequestDTO {
    private String name;
    private String location;
}
