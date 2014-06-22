package com.yskts.integration.config;

import com.yskts.integration.ProductManager;
import com.yskts.integration.ProductManagerImpl;
import com.yskts.integration.service.ProductSoapService;
import org.springframework.context.annotation.Bean;

/**
 * Created by Nick on 6/21/2014.
 */
public class IntegrationConfig {
    
    @Bean(name = "productManager")
    public ProductManager productManager() {
        return new ProductManagerImpl();
    }
    
    @Bean(name = "productController")
    public ProductSoapService productSoapService() {
        return new ProductSoapService();
    }
}
