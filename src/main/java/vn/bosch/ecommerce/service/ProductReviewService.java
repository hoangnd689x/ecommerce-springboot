package vn.bosch.ecommerce.service;
import java.text.ParseException;
import java.util.List;
import vn.bosch.ecommerce.io.entities.ProductReview;
import vn.bosch.ecommerce.model.request.CreateProductReviewRequest;

public interface ProductReviewService {
    List<ProductReview> getAll();
    ProductReview createProductReview(CreateProductReviewRequest productReview) throws ParseException;
}
