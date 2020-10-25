package vn.bosch.ecommerce.io.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employees implements Serializable {

    private static final long serialVersionUID = 5818348705950427422L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "employeeId")
    private Long employeeId;

    @OneToOne
    @JoinColumn(name = "contactId", referencedColumnName = "contactId")
    private Contacts contactId;

    @Column(name = "accountId", length = 255)
    private Long accountId;
    
    @Column(name = "manageId", length = 255)
    private Long manageId;

    @Column(name = "jobTitle", length = 255)
    private String jobTitle;

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Contacts getContactId() {
        return contactId;
    }

    public void setContactId(Contacts contactId) {
        this.contactId = contactId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getManageId() {
        return manageId;
    }

    public void setManageId(Long manageId) {
        this.manageId = manageId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
