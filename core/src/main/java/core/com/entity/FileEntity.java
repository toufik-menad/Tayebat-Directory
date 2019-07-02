/*
 * Copyright (c) 2018, Menad Tawfiq.
 */
package core.com.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.PrePersist;
import javax.persistence.Table;

/**
 * @author T.Menad
 */
@Entity
@Table(name = "file_entity")
public class FileEntity {

    @Id
    private UUID id;
    
    @Column(columnDefinition="BLOB")
    @Lob
    private byte[] fileBytes;
    
    /**
     * 
     */
    public FileEntity() {
        // TODO Auto-generated constructor stub
    }

    /**
     * 
     */
    public FileEntity(final UUID id, final byte[] fileBytes) {
        this.id = id;
        this.fileBytes = fileBytes;
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
     * Getter for fileBytes.
     * 
     * @return the fileBytes
     */
    public byte[] getFileBytes() {
        return fileBytes;
    }

    /**
     * Setter for fileBytes.
     * 
     * @param fileBytes the fileBytes to set
     */
    public void setFileBytes(byte[] fileBytes) {
        this.fileBytes = fileBytes;
    }

    @PrePersist
    private void addId() {
        if (this.id == null) {
            this.id = UUID.randomUUID();
        }
    }
}
