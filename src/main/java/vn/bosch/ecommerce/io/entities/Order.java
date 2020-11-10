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

	@ManyToOne
	@JoinColumn(name = "paymentId")
	private Payment paymentId;

	@Column(name = "paymentDate")
	private Date paymentDate;
    
    @Column(name = "orderedQuantity")
    private Integer orderedQuantity;

    @Column(name = "paymentMethod")
	private String paymentMethod;

	@Column(name = "createdDate")
	private Date createdDate;

	@Column(name = "status")
	private String status;

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

	public Integer getOrderedQuantity() {
		return orderedQuantity;
	}

	public void setOrderedQuantity(Integer orderedQuantity) {
		this.orderedQuantity = orderedQuantity;
	}

	public Payment getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Payment paymentId) {
		this.paymentId = paymentId;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
