package viettel.vcs.testcontainer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import viettel.vcs.testcontainer.entities.Product;
import viettel.vcs.testcontainer.services.Impl.ProductServiceImpl;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @PostMapping("/add")
    public Product createAccount() {
        return productService.addProduct();
    }
}
