package vn.bosch.ecommerce.io.entities;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "orderDetails")
public class OrderDetail implements Serializable {
    private static final long serialVersionUID = 286148288561484324L;
    @Id
    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order orderId;

    @Id
    @ManyToOne
    @JoinColumn(name = "productId")
    private Product productId;

    @Column(name = "orderQuantity")
    private int orderQuantity;

    @Column(name = "createdDate")
    private Date createdDate;

    public Order getOrderId() {
        return orderId;
    }

    public void setOrderId(Order orderId) {
        this.orderId = orderId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productIdId) {
        this.productId = productIdId;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
