package vn.bosch.ecommerce.io.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order implements Serializable {
	private static final long serialVersionUID = -3943251636211916074L;
	@Id
    @Column(name = "orderNumber")
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @Column(name = "invoiceId")
    private String invoiceId;
    
    @Column(name = "productId")
    private String productId;
    
    @Column(name = "orderedQuantity")
    private Integer orderedQuantity;

	@Column(name = "createdDate")
	private Date createdDate;

	@ManyToOne
	@JoinColumn(name = "paymentId")
	private Payment paymentId;
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Integer getOrderedQuantity() {
		return orderedQuantity;
	}

	public void setOrderedQuantity(Integer orderedQuantity) {
		this.orderedQuantity = orderedQuantity;
	}

}
