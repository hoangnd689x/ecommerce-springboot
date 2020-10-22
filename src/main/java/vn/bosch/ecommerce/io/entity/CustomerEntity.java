package vn.bosch.ecommerce.io.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "customers")
public class CustomerEntity implements Serializable {

    private static final long serialVersionUID = 2316150747301556080L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer customerId;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contactId")
    @Column(nullable = false)
    private ContactEntity contactId;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public ContactEntity getContactId() {
        return contactId;
    }

    public void setContactId(ContactEntity contactId) {
        this.contactId = contactId;
    }
}
