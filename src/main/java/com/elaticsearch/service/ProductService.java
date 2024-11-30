package com.elaticsearch.service;

import com.elaticsearch.entity.Product;
import com.elaticsearch.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> findAllProducts() {
        List<Product> productList =  new ArrayList<>();
        Iterable<Product> productListIterator  = productRepository.findAll();
        for(Product product : productListIterator){
            productList.add(product);
        }
       return productList;
    }

    public List<Product> findProductsByName(String name) {
        return productRepository.findByName(name);
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
