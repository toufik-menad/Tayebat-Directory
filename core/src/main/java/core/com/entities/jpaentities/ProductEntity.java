/*
 * Copyright (c) 2018, Menad Tawfiq.
 */
package core.com.entities.jpaentities;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;

/**
 * @author T.Menad
 */
@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    private UUID id;
    @Column()
    private String code;
    @Column()
    @OneToMany(mappedBy = "productEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<IngredientEntity> ingredients = new ArrayList<>();

    /**
     * No args constructor.
     */
    public ProductEntity() {
    }

    /**
     * All args constructor.
     * 
     * @param id
     * @param code
     */
    public ProductEntity(final UUID id, final String code, List<IngredientEntity> ingredients) {
        this.id = id;
        this.code = code;
        this.ingredients = ingredients;
    }

    /** adds ingredientEntity
     * @param ingredientEntity
     */
    public void addIngredientEntity(final IngredientEntity ingredientEntity) {
        this.ingredients.add(ingredientEntity);
        ingredientEntity.setProductEntity(this);
    }

    /** removes ingredientEntity
     * @param ingredientEntity
     */
    public void removeIngredientEntity(final IngredientEntity ingredientEntity) {
        this.ingredients.remove(ingredientEntity);
        ingredientEntity.setProductEntity(null);
    }

    /**
     * Getter for id.
     * 
     * @return the id
     */
    public UUID getId() {
        return id;
    }

    /**
     * Setter for id.
     * 
     * @param id the id to set
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Getter for code.
     * 
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter for code.
     * 
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for ingredients.
     * 
     * @return the ingredients
     */
    public List<IngredientEntity> getIngredients() {
        return ingredients;
    }

    /**
     * Setter for ingredients.
     * 
     * @param ingredients the ingredients to set
     */
    public void setIngredients(List<IngredientEntity> ingredients) {
        this.ingredients = ingredients;
    }

    @PrePersist
    public void prePersist() {
        if (this.id == null) {
            this.id = UUID.randomUUID();
        }
    }
}
