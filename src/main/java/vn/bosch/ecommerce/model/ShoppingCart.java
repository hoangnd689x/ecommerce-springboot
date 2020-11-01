package vn.bosch.ecommerce.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shoppingcarts")
public class ShoppingCart {@Id
    @Column(name = "shoppingCartId")
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long cartId;

    @Column(name = "productId")
    private Long productId;

    @Column(name = "customerId")
    private Long customerId;

	@Column(name = "quantity")
	private Integer quantity;
	
	@Column(name = "createdDate")
	private Date createdDate;
	
	@Column(name = "modifiedDate")
	private Date modifiedDate;

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

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
