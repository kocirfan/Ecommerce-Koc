package com.kocirfan.library.service;

import com.kocirfan.library.dto.ProductDto;
import com.kocirfan.library.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ProductService {

    List<ProductDto> findAll();
    Product save(MultipartFile imageProduct, ProductDto productDto);
    Product update(MultipartFile imageProduct, ProductDto productDto);
    void deleteById(Long id);
    void enableById(Long id);
    ProductDto getById(Long id);

    //pageable
    Page<Product> pageProducts(int pageNo);

    //search
    Page<Product> searchProducts(int pageNo, String keyword);

}
