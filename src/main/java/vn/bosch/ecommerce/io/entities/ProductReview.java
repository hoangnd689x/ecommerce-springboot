package vn.bosch.ecommerce.io.entities;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name  = "productReviews")
public class ProductReview implements Serializable {
    private static final long serialVersionUID = -843946806075671279L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "reviewId")
    private Long reviewId;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product productId;

    @Column(name = "content", length = 1000)
    private String content;

    @Min(0)
    @Max(5)
    @Column(name= "ratingStar",columnDefinition = "integer default 0")
    private int ratingStar;

    @Column(name = "isDeleted", columnDefinition = "bit default false", nullable = false)
    private Boolean isDeleted;

    @Column(name = "createdDate")
    private Date createdDate;

    @Column(name = "modifiedDate")
    private Date modifiedDate;

    @ManyToOne
    @JoinColumn(name = "createdBy", nullable = false)
    private Account createdBy;

    @ManyToOne
    @JoinColumn(name = "modifiedBy", nullable = false)
    private Account modifiedBy;

    public Long getReviewId() {
        return reviewId;
    }

    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
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

    public int getRatingStar() {
        return ratingStar;
    }

    public void setRatingStar(int ratingStar) {
        this.ratingStar = ratingStar;
    }
}
