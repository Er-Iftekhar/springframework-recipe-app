package com.app.utb.springframeworkrecipeapp.repositories;

import com.app.utb.springframeworkrecipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
