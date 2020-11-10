package vn.bosch.ecommerce.io.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "payments")
public class Payment implements Serializable {
	private static final long serialVersionUID = -19135041638409732L;
	@Id
    @Column(name = "paymentId")
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long paymentId;

	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customerId;

    @Column(name = "paymentDate")
    private Date paymentDate;

    @Column(name = "amount")
    private Double amount;

	@Column(name = "paymentMethods")
	private String paymentMethods;
	
	@Column(name = "createdDate")
	private Date createdDate;

	@OneToMany(mappedBy = "paymentId")
	private List<Order> orderId;


	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

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

	public String getPaymentMethods() {
		return paymentMethods;
	}

	public void setPaymentMethods(String paymentMethods) {
		this.paymentMethods = paymentMethods;
	}

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
