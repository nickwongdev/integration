package com.yskts.integration;

import com.yskts.integration.model.Product;

/**
 * Created by Nick on 6/21/2014.
 */
public class ProductManagerImpl implements ProductManager {
    public Product getProduct(final String productId) {
        final Product product = new Product();
        product.setProductId(productId);
        return product;
    }
}
