package com.yskts.integration.service;

import com.yskts.integration.ProductManager;
import com.yskts.integration.model.Product;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * Created by Nick on 6/21/2014.
 */
public class ProductSoapService {
    
    @Resource(name = "productManager")
    private ProductManager productManager;

    public Product getProduct() {
        return productManager.getProduct("test");
    }
}
