/*
 *
 *
 * Copyright (c) 2018, Menad Tawfiq.
 */
package core.com.repositories.jparepositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import core.com.entities.jpaentities.ProductEntity;

/**
 * @author T.Menad
 */
@Repository
public interface ProductEntityRepository extends JpaRepository<ProductEntity, UUID>{

}
