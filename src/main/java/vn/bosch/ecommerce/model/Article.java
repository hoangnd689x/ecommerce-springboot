package vn.bosch.ecommerce.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "articles")
public class Article {
    @Id
    @Column(name = "articleId")
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long articleId;

    @Column(name = "articleTitle")
    private String articleTitle;

    @Column(name = "content")
    private String content;

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
    public Long getArticleId() {
        return this.articleId;
    }

    public void setArticleId(Long id) {
        this.articleId = id;
    }

    public String getArticleTitle() {
        return this.articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
