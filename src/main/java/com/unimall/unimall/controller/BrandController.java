package com.unimall.unimall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unimall.unimall.entity.Brand;
import com.unimall.unimall.entity.Category;
import com.unimall.unimall.service.BrandService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/brand")
@Tag(name = "Brand", description = "the Brand api")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @Operation(summary = "get all Brand", description = "there you can get all brand", tags = { "Brand" })
    @GetMapping
    public List<Brand> getBrands() {
        List<Brand> brandList = brandService.getBrands();
        return brandList;
    }

}
