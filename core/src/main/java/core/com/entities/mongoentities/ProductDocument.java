/*
 *
 *
 * Copyright (c) 2018, Menad Tawfiq.
 */
package core.com.entities.mongoentities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author T.Menad
 */
@Document(collection="PRODUCTS")
public class ProductDocument {
    
    @Id
    private String _id;
    private String code;
    private String states ;
    private String ingredients_text;
    private List<String>informers_tags = new ArrayList<>();
    private List<String>ingredients = new ArrayList<>();
    private String product_name;
    
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
     * Setter for _id.
     * @param _id the _id to set
     */
    public void set_id(String _id) {
        this._id = _id;
    }
    /**
     * Setter for states.
     * @param states the states to set
     */
    public void setStates(String states) {
        this.states = states;
    }
    /**
     * Setter for informers_tags.
     * @param informers_tags the informers_tags to set
     */
    public void setInformers_tags(List<String> informers_tags) {
        this.informers_tags = informers_tags;
    }
    /**
     * Setter for ingredients.
     * @param ingredients the ingredients to set
     */
    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
    /**
     * Getter for ingredients.
     * @return the ingredients
     */
    public List<String> getIngredients() {
        return ingredients;
    }
    /**
     * Getter for _id.
     * @return the _id
     */
    public String get_id() {
        return _id;
    }
    /**
     * Getter for ingredients.
     * @return the ingredients
     */
    public String getStates() {
        return states;
    }
    /**
     * Getter for informers_tags.
     * @return the informers_tags
     */
    public List<String> getInformers_tags() {
        return informers_tags;
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
    
}
