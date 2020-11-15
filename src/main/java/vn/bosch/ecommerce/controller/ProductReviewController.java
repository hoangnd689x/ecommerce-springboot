package vn.bosch.ecommerce.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.bosch.ecommerce.model.request.CreateProductReviewRequest;
import vn.bosch.ecommerce.service.ProductReviewService;

import java.text.ParseException;

@Controller
@RequestMapping("/api/productReview")
public class ProductReviewController {
    @Autowired
    ProductReviewService productReviewService;
    @GetMapping
    public ResponseEntity<Object> getAll() {
        return new ResponseEntity<>(productReviewService.getAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Object> createProductReview(@RequestBody CreateProductReviewRequest productReview) throws ParseException {
        productReviewService.createProductReview(productReview);
        return new ResponseEntity<>("Create review success", HttpStatus.CREATED);
    }
}
