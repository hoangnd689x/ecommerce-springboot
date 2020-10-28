package vn.bosch.ecommerce.dto;

import vn.bosch.ecommerce.io.entities.Contacts;

public class EmployeeDto {
    private Long employeeId;
    private Contacts contactId;
    private Long accountId;
    private Long manageId;
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
