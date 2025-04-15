package com.fiveguys.fivelogbackend.domain.image.controller;

import com.fiveguys.fivelogbackend.domain.image.dto.ImageRequestDto;
import com.fiveguys.fivelogbackend.domain.image.dto.ImageResponseDto;
import com.fiveguys.fivelogbackend.domain.image.entity.Image;
import com.fiveguys.fivelogbackend.domain.image.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping()
public class ImageController {

    private final ImageService imageService;

    //  이미지 업로드
    @PostMapping()
    public ImageResponseDto uploadImage(@RequestPart("file") MultipartFile file) {
        ImageRequestDto dto = new ImageRequestDto();
        dto.setFile(file);
        return imageService.saveImage(dto);
    }

    //  이미지 단건 조회
    @GetMapping()
    public Optional<Image> getImage(@PathVariable Long id) {
        return imageService.getImageById(id);
    }

    //  이미지 전체 조회
    @GetMapping
    public List<Image> getAllImages() {
        return imageService.getAllImages();
    }

    //  이미지 수정
    @PutMapping()
    public Image updateImage(@PathVariable Long id, @RequestBody Image updatedImage) {
        return imageService.updateImage(id, updatedImage);
    }

    //  이미지 삭제
    @DeleteMapping()
    public String deleteImage(@PathVariable Long id) {
        return imageService.deleteImage(id);
    }
}
