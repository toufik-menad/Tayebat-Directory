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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * @author T.Menad
 */
@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @Type(type="uuid-binary")
    @GeneratedValue(generator = "uuid2", strategy=GenerationType.IDENTITY)
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;
    
    @Column()
    private String code;
    
    @Column()
    @OneToMany(mappedBy = "productEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<IngredientEntity> ingredients = new ArrayList<>();
    
    
    @Column(columnDefinition = "TEXT")
    private String ingredients_text;
    
    @Column(length=200)
    private String product_name;

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

    /**
     * Getter for ingredients_text.
     * @return the ingredients_text
     */
    public String getIngredients_text() {
        return ingredients_text;
    }

    /**
     * Setter for ingredients_text.
     * @param ingredients_text the ingredients_text to set
     */
    public void setIngredients_text(String ingredients_text_en) {
        this.ingredients_text = ingredients_text_en;
    }

    /**
     * Getter for product_name.
     * @return the product_name
     */
    public String getProduct_name() {
        return product_name;
    }

    /**
     * Setter for product_name.
     * @param product_name the product_name to set
     */
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    @PrePersist
    public void prePersist() {
        if (this.id == null) {
            this.id = UUID.randomUUID();
        }
    }
}
