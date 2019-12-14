/*
 *
 *
 * Copyright (c) 2018, Menad Tawfiq.
 */
package entities.mongoentities;

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
    private String states ;
    private List<String>informers_tags = new ArrayList<>();
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
}
