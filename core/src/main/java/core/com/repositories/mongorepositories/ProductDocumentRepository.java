/*
 *
 *
 * Copyright (c) 2018, Menad Tawfiq.
 */
package core.com.repositories.mongorepositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import core.com.entities.mongoentities.ProductDocument;

/**
 * @author T.Menad
 */
@Service
public interface ProductDocumentRepository extends MongoRepository<ProductDocument, String>{

}
