package vn.bosch.ecommerce.io.entities.IdClass;

import vn.bosch.ecommerce.io.entities.Customer;
import vn.bosch.ecommerce.io.entities.Product;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

public class ShoppingCartId implements Serializable {
    private static final long serialVersionUID = -8788819646231685035L;

    private Customer customerId;

    private Product productId;

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }
}
