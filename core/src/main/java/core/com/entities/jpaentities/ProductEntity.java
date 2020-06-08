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
import org.hibernate.search.annotations.Indexed;

/**
 * @author T.Menad
 */
@Entity
@Indexed
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
    
    @Column(length=200)
    private String product_name;
    
    @Column(length=200)
    private String product_name_en;
    
    @Column(length=200)
    private String product_name_fr;
    
    @Column(length=200)
    private String product_name_it;
    
    @Column(length=200)
    private String product_name_es;
    
    @Column(length=200)
    private String product_name_de;
    
    @Column()
    @OneToMany(mappedBy = "productEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<IngredientEntity> ingredients_text = new ArrayList<>();
    
    @Column()
    @OneToMany(mappedBy = "productEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<IngredientEntity> ingredients_text_en = new ArrayList<>();
    
    @Column()
    @OneToMany(mappedBy = "productEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<IngredientEntity> ingredients_text_fr = new ArrayList<>();
    
    @Column()
    @OneToMany(mappedBy = "productEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<IngredientEntity> ingredients_text_it = new ArrayList<>();
    
    @Column()
    @OneToMany(mappedBy = "productEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<IngredientEntity> ingredients_text_es = new ArrayList<>();
    
    @Column()
    @OneToMany(mappedBy = "productEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<IngredientEntity> ingredients_text_de = new ArrayList<>();
    

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
        this.ingredients_text = ingredients;
    }

    /** adds ingredientEntity
     * @param ingredientEntity
     */
    public void addIngredientTextEntity(final IngredientEntity ingredientEntity) {
        this.ingredients_text.add(ingredientEntity);
        ingredientEntity.setProductEntity(this);
    }

    /** removes ingredientEntity
     * @param ingredientEntity
     */
    public void removeIngredientTextEntity(final IngredientEntity ingredientEntity) {
        this.ingredients_text.remove(ingredientEntity);
        ingredientEntity.setProductEntity(null);
    }
    
    /** adds ingredientEntity
     * @param ingredientEntity
     */
    public void addIngredientTextEnEntity(final IngredientEntity ingredientEntity) {
        this.ingredients_text_en.add(ingredientEntity);
        ingredientEntity.setProductEntity(this);
    }

    /** removes ingredientEntity
     * @param ingredientEntity
     */
    public void removeIngredientTextEnEntity(final IngredientEntity ingredientEntity) {
        this.ingredients_text_en.remove(ingredientEntity);
        ingredientEntity.setProductEntity(null);
    }
    
    /** adds ingredientEntity
     * @param ingredientEntity
     */
    public void addIngredientTextFrEntity(final IngredientEntity ingredientEntity) {
        this.ingredients_text_fr.add(ingredientEntity);
        ingredientEntity.setProductEntity(this);
    }

    /** removes ingredientEntity
     * @param ingredientEntity
     */
    public void removeIngredientTextFrEntity(final IngredientEntity ingredientEntity) {
        this.ingredients_text_fr.remove(ingredientEntity);
        ingredientEntity.setProductEntity(null);
    }
    
    /** adds ingredientEntity
     * @param ingredientEntity
     */
    public void addIngredientTextItEntity(final IngredientEntity ingredientEntity) {
        this.ingredients_text_it.add(ingredientEntity);
        ingredientEntity.setProductEntity(this);
    }

    /** removes ingredientEntity
     * @param ingredientEntity
     */
    public void removeIngredientTextItEntity(final IngredientEntity ingredientEntity) {
        this.ingredients_text_it.remove(ingredientEntity);
        ingredientEntity.setProductEntity(null);
    }
    
    /** adds ingredientEntity
     * @param ingredientEntity
     */
    public void addIngredientTextEsEntity(final IngredientEntity ingredientEntity) {
        this.ingredients_text_es.add(ingredientEntity);
        ingredientEntity.setProductEntity(this);
    }

    /** removes ingredientEntity
     * @param ingredientEntity
     */
    public void removeIngredientTextEsEntity(final IngredientEntity ingredientEntity) {
        this.ingredients_text_es.remove(ingredientEntity);
        ingredientEntity.setProductEntity(null);
    }
    
    /** adds ingredientEntity
     * @param ingredientEntity
     */
    public void addIngredientTextDeEntity(final IngredientEntity ingredientEntity) {
        this.ingredients_text_de.add(ingredientEntity);
        ingredientEntity.setProductEntity(this);
    }

    /** removes ingredientEntity
     * @param ingredientEntity
     */
    public void removeIngredientTextDeEntity(final IngredientEntity ingredientEntity) {
        this.ingredients_text_de.remove(ingredientEntity);
        ingredientEntity.setProductEntity(null);
    }

    /**
     * Getter for id.
     * @return the id
     */
    public UUID getId() {
        return id;
    }

    /**
     * Setter for id.
     * @param id the id to set
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Getter for code.
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter for code.
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
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

    /**
     * Getter for product_name_en.
     * @return the product_name_en
     */
    public String getProduct_name_en() {
        return product_name_en;
    }

    /**
     * Setter for product_name_en.
     * @param product_name_en the product_name_en to set
     */
    public void setProduct_name_en(String product_name_en) {
        this.product_name_en = product_name_en;
    }

    /**
     * Getter for product_name_fr.
     * @return the product_name_fr
     */
    public String getProduct_name_fr() {
        return product_name_fr;
    }

    /**
     * Setter for product_name_fr.
     * @param product_name_fr the product_name_fr to set
     */
    public void setProduct_name_fr(String product_name_fr) {
        this.product_name_fr = product_name_fr;
    }

    /**
     * Getter for product_name_it.
     * @return the product_name_it
     */
    public String getProduct_name_it() {
        return product_name_it;
    }

    /**
     * Setter for product_name_it.
     * @param product_name_it the product_name_it to set
     */
    public void setProduct_name_it(String product_name_it) {
        this.product_name_it = product_name_it;
    }

    /**
     * Getter for product_name_es.
     * @return the product_name_es
     */
    public String getProduct_name_es() {
        return product_name_es;
    }

    /**
     * Setter for product_name_es.
     * @param product_name_es the product_name_es to set
     */
    public void setProduct_name_es(String product_name_es) {
        this.product_name_es = product_name_es;
    }

    /**
     * Getter for product_name_de.
     * @return the product_name_de
     */
    public String getProduct_name_de() {
        return product_name_de;
    }

    /**
     * Setter for product_name_de.
     * @param product_name_de the product_name_de to set
     */
    public void setProduct_name_de(String product_name_de) {
        this.product_name_de = product_name_de;
    }

    /**
     * Getter for ingredients_text.
     * @return the ingredients_text
     */
    public List<IngredientEntity> getIngredients_text() {
        return ingredients_text;
    }

    /**
     * Setter for ingredients_text.
     * @param ingredients_text the ingredients_text to set
     */
    public void setIngredients_text(List<IngredientEntity> ingredients_text) {
        this.ingredients_text = ingredients_text;
    }

    /**
     * Getter for ingredients_text_en.
     * @return the ingredients_text_en
     */
    public List<IngredientEntity> getIngredients_text_en() {
        return ingredients_text_en;
    }

    /**
     * Setter for ingredients_text_en.
     * @param ingredients_text_en the ingredients_text_en to set
     */
    public void setIngredients_text_en(List<IngredientEntity> ingredients_text_en) {
        this.ingredients_text_en = ingredients_text_en;
    }

    /**
     * Getter for ingredients_text_fr.
     * @return the ingredients_text_fr
     */
    public List<IngredientEntity> getIngredients_text_fr() {
        return ingredients_text_fr;
    }

    /**
     * Setter for ingredients_text_fr.
     * @param ingredients_text_fr the ingredients_text_fr to set
     */
    public void setIngredients_text_fr(List<IngredientEntity> ingredients_text_fr) {
        this.ingredients_text_fr = ingredients_text_fr;
    }

    /**
     * Getter for ingredients_text_it.
     * @return the ingredients_text_it
     */
    public List<IngredientEntity> getIngredients_text_it() {
        return ingredients_text_it;
    }

    /**
     * Setter for ingredients_text_it.
     * @param ingredients_text_it the ingredients_text_it to set
     */
    public void setIngredients_text_it(List<IngredientEntity> ingredients_text_it) {
        this.ingredients_text_it = ingredients_text_it;
    }

    /**
     * Getter for ingredients_text_es.
     * @return the ingredients_text_es
     */
    public List<IngredientEntity> getIngredients_text_es() {
        return ingredients_text_es;
    }

    /**
     * Setter for ingredients_text_es.
     * @param ingredients_text_es the ingredients_text_es to set
     */
    public void setIngredients_text_es(List<IngredientEntity> ingredients_text_es) {
        this.ingredients_text_es = ingredients_text_es;
    }

    /**
     * Getter for ingredients_text_de.
     * @return the ingredients_text_de
     */
    public List<IngredientEntity> getIngredients_text_de() {
        return ingredients_text_de;
    }

    /**
     * Setter for ingredients_text_de.
     * @param ingredients_text_de the ingredients_text_de to set
     */
    public void setIngredients_text_de(List<IngredientEntity> ingredients_text_de) {
        this.ingredients_text_de = ingredients_text_de;
    }

    @PrePersist
    public void prePersist() {
        if (this.id == null) {
            this.id = UUID.randomUUID();
        }
    }
}
