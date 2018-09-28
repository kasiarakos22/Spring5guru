package com.kasiarakos.recipe.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long  id;
    String description;

    public String getUom() {
        return description;
    }

    public void setUom(String uom) {
        this.description = uom;
    }

    @Override
    public String toString() {
        return "UnitOfMeasure{" +
            "id=" + id +
            ", description='" + description + '\'' +
            '}';
    }
}
