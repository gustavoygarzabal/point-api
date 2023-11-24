package com.mym.point.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class ClientDto {
    private Integer id;
    private String name;
}
