package com.fiveguys.fivelogbackend.domain.image.dto;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ImageRequestDto {

     private MultipartFile file;  // 클라이언트가 업로드한 이미지 파일
}

