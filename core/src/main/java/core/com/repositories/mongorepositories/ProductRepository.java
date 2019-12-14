/*
 *
 *
 * Copyright (c) 2018, Menad Tawfiq.
 */
package core.com.repositories.mongorepositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import entities.mongoentities.ProductDocument;

/**
 * @author T.Menad
 */
@Service
public interface ProductRepository extends MongoRepository<ProductDocument, String>{

}
