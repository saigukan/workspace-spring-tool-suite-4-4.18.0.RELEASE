package com.example.Cellphones.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Cellphones.db.Cart;

@Repository
public interface CartRepository  extends JpaRepository<Cart, Integer> {

}
