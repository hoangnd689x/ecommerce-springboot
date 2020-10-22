package vn.bosch.ecommerce.io.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name ="contacts")
public class ContactEntity implements Serializable {
    private static final long serialVersionUID = -1809002674804766692L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long contactId;

    @OneToOne(mappedBy = "customers", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private CustomerEntity cutomer;

    @Column(nullable = false)
    private String email;
    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }
}
