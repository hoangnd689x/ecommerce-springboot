package vn.bosch.ecommerce.io.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category implements Serializable {
	private static final long serialVersionUID = 3768447032702735744L;
	@Id
    @Column(name = "categoryId")
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long categoryId;

    @Column(name = "categoryName")
    private String categoryName;

    @Column(name = "description")
    private String description;

    @Column(name = "categoryImage")
    private String categoryImage;


	@Column(name = "isDeleted")
	private boolean isDeleted;

	@Column(name = "modifiedDate")
	private Date modifiedDate;

	@Column(name = "createdDate")
	private Date createdDate;

	@ManyToOne
    @JoinColumn(name = "createdBy", nullable = false)
	private Account createdBy;
	
    @ManyToOne
    @JoinColumn(name = "modifiedBy", nullable = false)
	private Account modifiedBy;

	@OneToMany(mappedBy = "category")
	private List<Product> product;

	public Account getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Account createdBy) {
		this.createdBy = createdBy;
	}

	public Account getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Account modifiedBy) {
		this.modifiedBy = modifiedBy;
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
    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategoryImage() {
        return this.categoryImage;
    }

    public void setCategoryImage(String categoryImage) {
        this.categoryImage = categoryImage;
    }

}
