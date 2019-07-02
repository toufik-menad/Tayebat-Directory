/*
 *
 *
 * Copyright (c) 2018, Menad Tawfiq.
 */
package core.com.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import core.com.entity.FileEntity;

/**
 * @author T.Menad
 */
@Service
public interface FileRepository extends JpaRepository<FileEntity, UUID>{
}
