package vn.bosch.ecommerce.io.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "comments")
public class Comment implements Serializable {
    private static final long serialVersionUID = 1239776813883738688L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "commentId")
    private Long commentId;

    @ManyToOne
    @JoinColumn(name ="email", referencedColumnName = "email")
    private Account email;

    @ManyToOne
    @JoinColumn(name ="articleId")
    private Article articleId;

    @Column(name = "commentContent")
    private String commentContent;

    @Column(name = "createAt")
    private Date createdAt;

    @Column(name = "modifiedAt")
    private Date modifiedAt;


    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Account getEmail() {
        return email;
    }

    public void setEmail(Account email) {
        this.email = email;
    }

    public Article getArticleId() {
        return articleId;
    }

    public void setArticleId(Article articleId) {
        this.articleId = articleId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
