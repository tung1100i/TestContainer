package viettel.vcs.testcontainer.services.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import viettel.vcs.testcontainer.entities.Product;
import viettel.vcs.testcontainer.repo.ProductRepository;
import viettel.vcs.testcontainer.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product addProduct() {
        return productRepository.save(new Product("hehe"));
    }
}
