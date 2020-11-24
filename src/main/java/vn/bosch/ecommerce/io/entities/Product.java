package vn.bosch.ecommerce.io.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "products")
public class Product implements Serializable {
	private static final long serialVersionUID = -9007989024254029981L;
	@Id
    @Column(name = "productId")
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;

    @Column(name = "productName")
    private String productName;

	@ManyToOne
    @JoinColumn(name = "category")
    private Category category;

    @Column(name = "productDescription")
    private String productDescription;

    @Column(name = "quantityInStock")
    private Integer quantityInStock;

    @Column(name = "buyPrice")
    private Double buyPrice;

    @Column(name = "productImage")
    private String productImage;

    @Column(name = "discount")
    private Double discount;

	@Column(name = "viewCount")
	private String viewCount;

	@Min(1)
	@Max(5)
	@Column(name = "averageRating")
	private Double averageRating;

	@Column(name = "isDeleted")
	private boolean isDeleted;
	
	@Column(name = "createdDate")
	private Date createdDate;
	
	@Column(name = "modifiedDate")
	private Date modifiedDate;
	
	@ManyToOne
    @JoinColumn(name = "createdBy", nullable = false)
	private Account createdBy;
	
    @ManyToOne
    @JoinColumn(name = "modifiedBy", nullable = false)
	private Account modifiedBy;

    @OneToMany(mappedBy = "productId")
	private List<ShoppingCart> shoppingCart;

    @OneToMany(mappedBy = "orderId")
	private List<OrderDetail> orderDetail;

    @OneToMany(mappedBy = "productId")
	private List<ProductReview> reviews;


	public Category getCategory() {
		return category;
	}

	public void setCategory(Category categoryId) {
		this.category = categoryId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Integer getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(Integer quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public Double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Account getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Account createdBy) {
		this.createdBy = createdBy;
	}

	public Account getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Account modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getViewCount() {
		return viewCount;
	}

	public void setViewCount(String viewCount) {
		this.viewCount = viewCount;
	}

	public Double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(Double averageRating) {
		this.averageRating = averageRating;
	}

	public List<ProductReview> getReviews() {
		return reviews;
	}

	public void setReviews(List<ProductReview> review) {
		this.reviews = review;
	}
}
