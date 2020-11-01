package vn.bosch.ecommerce.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category {
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
	
	@Column(name = "createdDate")
	private Date createdDate;
	
	@Column(name = "modifiedDate")
	private Date modifiedDate;

	@ManyToOne
    @JoinColumn(name = "createdBy", nullable = false)
	private Employee createdBy;
	
    @ManyToOne
    @JoinColumn(name = "modifiedBy", nullable = false)
	private Employee modifiedBy;

	public Employee getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Employee createdBy) {
		this.createdBy = createdBy;
	}

	public Employee getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Employee modifiedBy) {
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
