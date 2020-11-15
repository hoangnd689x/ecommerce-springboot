package vn.bosch.ecommerce.io.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "accounts")
public class Account implements Serializable {
	private static final long serialVersionUID = 7669702433203855426L;
	@Id
	@Column(name = "accountId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long accountId;

	@Column(name = "email")
	private String email;

	@Column(name = "userName")
	private String userName;

	@Column(name = "password")
	private String password;

	@ManyToOne
	@JoinColumn(name = "roleId")
	private Role roleId;
	
	@Column(name = "isDeleted")
	private boolean isDeleted;
	
	@Column(name = "createdDate")
	private Date createdDate;
	
	@Column(name = "modifiedDate")
	private Date modifiedDate;

	@OneToMany(mappedBy ="createdBy")
	private List<Article> createArticleBy;

	@OneToMany(mappedBy ="modifiedBy")
	private List<Article> modifiedArticleBy;

	@OneToMany(mappedBy ="createdBy")
	private List<Category> createCategoryBy;

	@OneToMany(mappedBy ="modifiedBy")
	private List<Category> modifiedCategoryBy;

	@OneToMany(mappedBy ="createdBy")
	private List<Product> createProductBy;

	@OneToMany(mappedBy ="modifiedBy")
	private List<Category> modifiedProductBy;

	@OneToMany(mappedBy ="accountId")
	private List<Customer> customer;

	@OneToMany(mappedBy = "email")
	private List<Comment> comments;

	@OneToMany(mappedBy ="modifiedBy")
	private List<ProductReview> modifiedProductReviewBy;

	@OneToMany(mappedBy ="createdBy")
	private List<ProductReview> createProductReviewBy;

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Long getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Long id) {
		this.accountId = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public Role getRoleId() {
		return roleId;
	}

	public void setRoleId(Role roleId) {
		this.roleId = roleId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
