package com.kasiarakos.recipe.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.kasiarakos.recipe.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
