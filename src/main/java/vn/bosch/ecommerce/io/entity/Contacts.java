package vn.bosch.ecommerce.io.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Contacts implements Serializable {
    private static final long serialVersionUID = -8199017043616298363L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "contactId", nullable = false, unique = true)
    private Long contactId;

    @Column(name = "firstName",length = 255, nullable = false)
    private String firstName;

    @Column(name = "lastname", length = 255, nullable = false)
    private String lastName;

    @Column(name = "phone", length = 255, nullable = false, unique = true)
    private String phone;

    @Column(name = "email", length = 255, nullable = false, unique = true)
    private String email;

    @Column(name = "addressLine", length = 255)
    private String addressLine;

    @Column(name = "ward", length = 255, nullable = false)
    private String ward;

    @Column(name = "city", length = 255, nullable = false)
    private String city;

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
