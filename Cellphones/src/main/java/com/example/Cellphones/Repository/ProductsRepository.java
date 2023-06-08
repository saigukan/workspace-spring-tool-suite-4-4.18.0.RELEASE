package com.example.Cellphones.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Cellphones.db.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products,Integer> {

}
