package com.web.ecomm.app.repository;

import com.web.ecomm.app.pojo.Cart;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@PropertySources({
        @PropertySource("classpath:sql.properties")
})
public interface CartRepository extends JpaRepository<Cart, Integer> {

    @Value("${CART.FIND_ALL_BY_USER_USER_ID:}")
    String FIND_ALL_BY_USER_USER_ID = "";

    @Query(value = FIND_ALL_BY_USER_USER_ID)
    List<Cart> findAllByUserUserId(@Param("userId") int userId);

    void deleteAllByUserUserId( int userId);
}
