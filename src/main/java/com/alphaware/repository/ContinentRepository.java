package com.alphaware.repository;

import org.springframework.data.repository.CrudRepository;

import com.alphaware.entity.Continent;

public interface ContinentRepository extends CrudRepository<Continent, Long> {

}
