package vn.bosch.ecommerce.model.response;

public class GetProductsByViewModel {
    private String productImage;
    private String productName;
    private Double price;
    private String category;
    private String numOfView;

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNumOfView() {
        return numOfView;
    }

    public void setNumOfView(String numOfView) {
        this.numOfView = numOfView;
    }
}
