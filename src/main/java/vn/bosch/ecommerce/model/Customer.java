package vn.bosch.ecommerce.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @Column(name = "customerId")
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;

    @Column(name = "contactId")
    private Long contactId;

    @Column(name = "accountId")
    private Long accountId;

    @Column(name = "gender")
    private String gender;

	@Column(name = "isDeleted")
	private boolean isDeleted;
	
	@Column(name = "createdDate")
	private Date createdDate;
	
	@Column(name = "modifiedDate")
	private Date modifiedDate;

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

    public Long getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getContactId() {
        return this.contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public Long getAccountId() {
        return this.accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
