/*
 *
 *
 * Copyright (c) 2018, Menad Tawfiq.
 */
package core.com.entities.jpaentities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

/**
 * @author T.Menad
 */
@Entity
@Table(name="ingredient")
public class IngredientEntity {
    @Id
    private UUID uuid;
    @Column()
    private String id;
    @Column(name = "`rank`")
    private int rank;
    @Column()
    private String text;
    @ManyToOne(fetch = FetchType.LAZY)
    private ProductEntity productEntity;
    
    /**
     * Getter for uuid.
     * @return the uuid
     */
    public UUID getUuid() {
        return uuid;
    }

    /**
     * Setter for uuid.
     * @param uuid the uuid to set
     */
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    /**
     * Getter for id.
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter for id.
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * Getter for rank.
     * @return the rank
     */
    public int getRank() {
        return rank;
    }


    /**
     * Setter for rank.
     * @param rank the rank to set
     */
    public void setRank(int rank) {
        this.rank = rank;
    }

    /**
     * Getter for text.
     * @return the text
     */
    public String getText() {
        return text;
    }


    /**
     * Setter for text.
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }
    


    /**
     * Getter for productEntity.
     * @return the productEntity
     */
    public ProductEntity getProductEntity() {
        return productEntity;
    }

    /**
     * Setter for productEntity.
     * @param productEntity the productEntity to set
     */
    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    @PrePersist
    public void prePersist() {
        if (this.uuid == null) {
            this.uuid = UUID.randomUUID();
        }
    }

}
