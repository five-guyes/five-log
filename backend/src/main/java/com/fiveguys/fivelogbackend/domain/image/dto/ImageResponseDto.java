package com.fiveguys.fivelogbackend.domain.image.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ImageResponseDto {
    private String originalName;
    private String path;
}