package com.asmaa.ecommerce.dao;

import com.asmaa.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product,Long> {

    Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);
    //containing is similar to like in sql
    // behind the scenes, spring will be execute a query similar to this
    // select * from product p where p.name Like concat('%', :name ,'%')
    Page<Product> findByNameContaining(@RequestParam("name") String name, Pageable pageable);

}