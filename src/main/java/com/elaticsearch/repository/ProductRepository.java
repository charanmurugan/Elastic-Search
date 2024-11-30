package com.elaticsearch.repository;

import com.elaticsearch.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ProductRepository extends ElasticsearchRepository<Product, String> {
    // Custom queries can be added here
    List<Product> findByName(String name);
}
