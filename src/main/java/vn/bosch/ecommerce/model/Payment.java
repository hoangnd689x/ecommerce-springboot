package vn.bosch.ecommerce.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @Column(name = "paymentId")
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long paymentId;

    @Column(name = "customerId")
    private Long customerId;

    @Column(name = "paymentDate")
    private Date paymentDate;

    @Column(name = "amount")
    private Double amount;

	@Column(name = "paymentMethods")
	private Integer paymentMethods;
	
	@Column(name = "createdDate")
	private Date createdDate;

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

    public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Integer getPaymentMethods() {
		return paymentMethods;
	}

	public void setPaymentMethods(Integer paymentMethods) {
		this.paymentMethods = paymentMethods;
	}

	public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
