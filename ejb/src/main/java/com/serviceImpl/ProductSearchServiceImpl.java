/*
 *
 *
 * Copyright (c) 2018, Menad Tawfiq.
 */
package com.serviceImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.FullTextQuery;
import org.hibernate.search.jpa.Search;
import org.hibernate.search.query.dsl.QueryBuilder;

import com.services.ProductSearchService;

import org.apache.lucene.search.Query;

import org.springframework.stereotype.Service;

import core.com.entities.jpaentities.ProductEntity;

/**
 * @author T.Menad
 */
@Service
public class ProductSearchServiceImpl implements ProductSearchService<ProductEntity>{
    
    
    @PersistenceContext
    private EntityManager entityManager;
    

    /**
     * @param barCode
     * @return
     */
    @Override
    public List<ProductEntity> searchProductByBarCode(String barCode) {
        final FullTextEntityManager fullTextEntityManager = Search.getFullTextEntityManager(entityManager);
        final QueryBuilder queryBuilder = fullTextEntityManager.getSearchFactory() 
                .buildQueryBuilder()
                .forEntity(ProductEntity.class)
                .get();
        
        final Query queryByBarCode = queryBuilder
                .keyword()
                .onField("code")
                .matching(barCode)
                .createQuery();
        
        final FullTextQuery jpaQuery = fullTextEntityManager.createFullTextQuery(queryByBarCode, ProductEntity.class);
        return jpaQuery.getResultList();
    }


    /**
     * @param ingredient
     * @return
     */
    @Override
    public List<ProductEntity> searchIngredientByProduct(final String barCode) {
        
        //TODO implement details later on
        final FullTextEntityManager fullTextEntityManager = Search.getFullTextEntityManager(entityManager);
        final QueryBuilder queryBuilder = fullTextEntityManager.getSearchFactory() 
                .buildQueryBuilder()
                .forEntity(ProductEntity.class)
                .get();
        
        final Query combinedQuery = queryBuilder.bool()
                .must(queryBuilder.keyword()
                        .onField("code").matching(barCode)
                        .createQuery())
                      .must(queryBuilder.keyword()
                        .onField("ingredients_text.text").matching("porc")
                        .createQuery())
                      .createQuery();
        
        final FullTextQuery jpaQuery
        = fullTextEntityManager.createFullTextQuery(combinedQuery, ProductEntity.class);
        
        final List<ProductEntity> results = jpaQuery.getResultList();
        return results;
    }

}
