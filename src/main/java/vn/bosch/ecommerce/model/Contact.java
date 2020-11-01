package vn.bosch.ecommerce.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "contacts")
public class Contact {
    @Id
    @Column(name = "contactId")
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long contactId;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "addressLine")
    private String addressLine;

    @Column(name = "ward")
    private String ward;

    @Column(name = "city")
    private String city;

	@Column(name = "isDeleted")
	private boolean isDeleted;
	
	@Column(name = "createdDate")
	private Date createdDate;
	
	@Column(name = "modifiedDate")
	private Date modifiedDate;

	public boolean isDeleted() {
		return this.isDeleted;
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

    public Long getContactId() {
        return this.contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddressLine() {
        return this.addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getWard() {
        return this.ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
