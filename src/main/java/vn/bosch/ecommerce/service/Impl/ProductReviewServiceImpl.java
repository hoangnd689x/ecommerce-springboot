package vn.bosch.ecommerce.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.bosch.ecommerce.io.entities.Account;
import vn.bosch.ecommerce.io.entities.Product;
import vn.bosch.ecommerce.io.entities.ProductReview;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import vn.bosch.ecommerce.io.repositories.AccountRepository;
import vn.bosch.ecommerce.io.repositories.ProductRepository;
import vn.bosch.ecommerce.io.repositories.ProductReviewRepository;
import vn.bosch.ecommerce.model.request.CreateProductReviewRequest;
import vn.bosch.ecommerce.service.ProductReviewService;

@Service
public class ProductReviewServiceImpl implements ProductReviewService {
    @Autowired
    ProductReviewRepository productReviewRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    AccountRepository accountRepository;
    @Override
    public List<ProductReview> getAll(){
        return (List<ProductReview>) productReviewRepository.findAll();
    }
    @Override
    public ProductReview createProductReview(CreateProductReviewRequest request) throws ParseException {
        Product productId = productRepository.getProductByProductId(request.getProductId());
        Account createdBy = accountRepository.getAccountByAccountId(request.getCreatedBy());
        Account modifiedBy = accountRepository.getAccountByAccountId(request.getModifiedBy());
        Date createdDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(request.getCreatedDate());
        Date modifiedDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(request.getModifiedDate());
        ProductReview newProductReview = new ProductReview();
        newProductReview.setRatingStar(request.getRatingStar());
        newProductReview.setContent(request.getContent());
        newProductReview.setCreatedBy(createdBy);
        newProductReview.setCreatedDate(createdDate);
        newProductReview.setModifiedDate(modifiedDate);
        newProductReview.setModifiedBy(modifiedBy);
        newProductReview.setProductId(productId);
        return productReviewRepository.save(newProductReview);
    }
}
