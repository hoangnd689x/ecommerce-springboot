package vn.bosch.ecommerce.io.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "articles")
public class Article implements Serializable {
	private static final long serialVersionUID = 7444198965609289010L;
	@Id
    @Column(name = "articleId")
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long articleId;

    @Column(name = "articleTitle")
    private String articleTitle;

    @Column(name = "content", length = 10000)
    private String content;

	@Column(name = "isDeleted")
	private boolean isDeleted;
	
	@Column(name = "createdDate")
	private Date createdDate;
	
	@Column(name = "modifiedDate")
	private Date modifiedDate;

    @ManyToOne
    @JoinColumn(name = "createdBy")
	private Account createdBy;

    @ManyToOne
    @JoinColumn(name = "modifiedBy")
	private Account modifiedBy;

    @OneToMany(mappedBy = "articleId")
	private List<Comment> comments;


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

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
}
