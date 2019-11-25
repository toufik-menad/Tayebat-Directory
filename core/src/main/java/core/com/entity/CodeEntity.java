/*
 * Copyright (c) 2018, Menad Tawfiq.
 */
package core.com.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

/**
 * @author T.Menad
 */
@Entity
@Table(name = "codes")
public class CodeEntity {

    @Id
    private UUID id;
    @Column()
    private String code;

    /**
     * No args constructor.
     */
    public CodeEntity() {
    }

    /**
     * All args constructor.
     * 
     * @param id
     * @param code
     */
    public CodeEntity(final UUID id, final String code) {
        this.id = id;
        this.code = code;
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

    @PrePersist
    public void prePersist() {
        if (this.id == null) {
            this.id = UUID.randomUUID();
        }
    }
}