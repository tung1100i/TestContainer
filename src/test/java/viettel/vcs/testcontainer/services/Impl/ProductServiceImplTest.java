//package viettel.vcs.testcontainer.services.Impl;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.ArrayList;
//import java.util.List;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import viettel.vcs.testcontainer.conffg.ContainersEnvironment;
//import viettel.vcs.testcontainer.entities.Product;
//import viettel.vcs.testcontainer.repo.ProductRepository;
//
//@Service
//class ProductServiceImplTest extends ContainersEnvironment {
//    @Autowired
//    private ProductRepository productRepository;
//
//    @Test
//    void findAllProducts() {
//        List<Product> list = new ArrayList<>();
//        list = productRepository.findAll();
//        assertEquals(4, list.size());
//    }
//}