/*
 *
 *
 * Copyright (c) 2018, Menad Tawfiq.
 */
package core.com.entities.mongoentities;

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
    
    private String product_name;
    private String product_name_en;
    private String product_name_fr;
    private String product_name_it;
    private String product_name_es;
    private String product_name_de;
    
    private String ingredients_text;
    private String ingredients_text_en;
    private String ingredients_text_fr;
    private String ingredients_text_it;
    private String ingredients_text_es;
    private String ingredients_text_de;
    /**
     * Getter for _id.
     * @return the _id
     */
    public String get_id() {
        return _id;
    }
    /**
     * Setter for _id.
     * @param _id the _id to set
     */
    public void set_id(String _id) {
        this._id = _id;
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
    public String getIngredients_text() {
        return ingredients_text;
    }
    /**
     * Setter for ingredients_text.
     * @param ingredients_text the ingredients_text to set
     */
    public void setIngredients_text(String ingredients_text) {
        this.ingredients_text = ingredients_text;
    }
    /**
     * Getter for ingredients_text_en.
     * @return the ingredients_text_en
     */
    public String getIngredients_text_en() {
        return ingredients_text_en;
    }
    /**
     * Setter for ingredients_text_en.
     * @param ingredients_text_en the ingredients_text_en to set
     */
    public void setIngredients_text_en(String ingredients_text_en) {
        this.ingredients_text_en = ingredients_text_en;
    }
    /**
     * Getter for ingredients_text_fr.
     * @return the ingredients_text_fr
     */
    public String getIngredients_text_fr() {
        return ingredients_text_fr;
    }
    /**
     * Setter for ingredients_text_fr.
     * @param ingredients_text_fr the ingredients_text_fr to set
     */
    public void setIngredients_text_fr(String ingredients_text_fr) {
        this.ingredients_text_fr = ingredients_text_fr;
    }
    /**
     * Getter for ingredients_text_it.
     * @return the ingredients_text_it
     */
    public String getIngredients_text_it() {
        return ingredients_text_it;
    }
    /**
     * Setter for ingredients_text_it.
     * @param ingredients_text_it the ingredients_text_it to set
     */
    public void setIngredients_text_it(String ingredients_text_it) {
        this.ingredients_text_it = ingredients_text_it;
    }
    /**
     * Getter for ingredients_text_es.
     * @return the ingredients_text_es
     */
    public String getIngredients_text_es() {
        return ingredients_text_es;
    }
    /**
     * Setter for ingredients_text_es.
     * @param ingredients_text_es the ingredients_text_es to set
     */
    public void setIngredients_text_es(String ingredients_text_es) {
        this.ingredients_text_es = ingredients_text_es;
    }
    /**
     * Getter for ingredients_text_de.
     * @return the ingredients_text_de
     */
    public String getIngredients_text_de() {
        return ingredients_text_de;
    }
    /**
     * Setter for ingredients_text_de.
     * @param ingredients_text_de the ingredients_text_de to set
     */
    public void setIngredients_text_de(String ingredients_text_de) {
        this.ingredients_text_de = ingredients_text_de;
    }
    
}
