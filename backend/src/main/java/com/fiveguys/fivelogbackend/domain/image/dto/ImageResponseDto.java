package com.fiveguys.fivelogbackend.domain.image.dto;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ImageResponseDto {
    private String originalName;
    private String path;


    }

