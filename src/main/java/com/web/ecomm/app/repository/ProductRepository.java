package com.web.ecomm.app.repository;

import com.web.ecomm.app.pojo.Products;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@PropertySources({
        @PropertySource("classpath:sql.properties")
})
public interface ProductRepository extends JpaRepository<Products, Integer> {

    @Value("${PRODUCT.FIND_ALL_PRODUCTS:}")
    String FIND_ALL_PRODUCTS = "";

    @Value("${PRODUCT.COUNT_ALL_PRODUCTS:}")
    String COUNT_ALL_PRODUCTS = "";

    @Query(value = FIND_ALL_PRODUCTS, nativeQuery = true)
    List<Products> findAllProducts();

    @Query(value = COUNT_ALL_PRODUCTS, nativeQuery = true)
    Integer countAllProduct();

}
