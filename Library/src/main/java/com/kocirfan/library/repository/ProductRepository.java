package com.kocirfan.library.repository;

import com.kocirfan.library.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    //pageable
    @Query("select p from Product p")
    Page<Product> pageProduct(Pageable pageable);

    //search
    @Query("select p from Product p where p.description like %?1% or p.name like %?1%")
    Page<Product> searchProducts(String keyword, Pageable pageable);

    //
    @Query("select p from Product p where p.description like %?1% or p.name like %?1%")
    List<Product> searchProductList(String keyword);
}
