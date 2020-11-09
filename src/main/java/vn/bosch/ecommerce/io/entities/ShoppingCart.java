package vn.bosch.ecommerce.io.entities;

import vn.bosch.ecommerce.io.entities.IdClass.ShoppingCartId;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "shoppingcarts")
@IdClass(ShoppingCartId.class)
public class ShoppingCart implements Serializable {
	private static final long serialVersionUID = -2833340166025876519L;
	@Id
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customerId;

	@Id
	@ManyToOne
	@JoinColumn(name = "productId")
	private Product productId;

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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}
}
