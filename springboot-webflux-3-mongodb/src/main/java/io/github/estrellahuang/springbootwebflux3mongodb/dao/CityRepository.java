package io.github.estrellahuang.springbootwebflux3mongodb.dao;

import io.github.estrellahuang.springbootwebflux3mongodb.domain.City;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Huang Yuxin
 * @date 2019-07-18
 */
@Repository
public interface CityRepository extends ReactiveMongoRepository<City, Long> {

}
