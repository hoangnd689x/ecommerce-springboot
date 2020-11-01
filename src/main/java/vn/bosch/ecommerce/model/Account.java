package vn.bosch.ecommerce.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")
public class Account {
	@Id
	@Column(name = "accountId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long accountId;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "permission")
	private Integer permission;
	
	@Column(name = "isDeleted")
	private boolean isDeleted;
	
	@Column(name = "createdDate")
	private Date createdDate;
	
	@Column(name = "modifiedDate")
	private Date modifiedDate;

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

	public Integer getPermission() {
		return this.permission;
	}

	public void setPermission(Integer permission) {
		this.permission = permission;
	}
}
