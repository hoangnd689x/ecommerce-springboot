package vn.bosch.ecommerce.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @Column(name = "employeeId")
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;

    @Column(name = "contactId")
    private Long contactId;

    @Column(name = "accountId")
    private Long accountId;

    @Column(name = "jobTitle")
    private String jobTitle;

	@Column(name = "isDeleted")
	private boolean isDeleted;
	
	@Column(name = "createdDate")
	private Date createdDate;
	
	@Column(name = "modifiedDate")
	private Date modifiedDate;
	
	@OneToMany(mappedBy = "createdBy")
	private List<Article> createdArticles;

	@OneToMany(mappedBy = "modifiedBy")
	private List<Article> modifiedArticles;
	
	@OneToMany(mappedBy = "createdBy")
	private List<Category> createdCategories;

	@OneToMany(mappedBy = "modifiedBy")
	private List<Category> modifiedCategories;
	
	@OneToMany(mappedBy = "createdBy")
	private List<Product> createdProducts;

	@OneToMany(mappedBy = "modifiedBy")
	private List<Product> modifiedProducts;

	public List<Product> getCreatedProducts() {
		return createdProducts;
	}

	public void setCreatedProducts(List<Product> createdProducts) {
		this.createdProducts = createdProducts;
	}

	public List<Product> getModifiedProducts() {
		return modifiedProducts;
	}

	public void setModifiedProducts(List<Product> modifiedProducts) {
		this.modifiedProducts = modifiedProducts;
	}
	
	public List<Category> getCreatedCategories() {
		return createdCategories;
	}

	public void setCreatedCategories(List<Category> createdCategories) {
		this.createdCategories = createdCategories;
	}

	public List<Category> getModifiedCategories() {
		return modifiedCategories;
	}

	public void setModifiedCategories(List<Category> modifiedCategories) {
		this.modifiedCategories = modifiedCategories;
	}

	public List<Article> getCreatedArticles() {
		return createdArticles;
	}

	public void setCreatedArticles(List<Article> createdArticles) {
		this.createdArticles = createdArticles;
	}

	public List<Article> getModifiedArticles() {
		return modifiedArticles;
	}

	public void setModifiedArticles(List<Article> modifiedArticles) {
		this.modifiedArticles = modifiedArticles;
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

    public Long getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
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

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
