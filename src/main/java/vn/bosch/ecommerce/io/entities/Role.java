package vn.bosch.ecommerce.io.entities;

import javax.persistence.*;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Entity
@Component
@Table(name = "roles")
public class Role implements Serializable {
    private static final long serialVersionUID = 7237586574813490104L;
    @Id
    @Column(name = "roleId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long roleId;

    @Column(name = "roleName")
    private String name;

    @OneToMany(mappedBy = "role")
    private List<Account> accounts;

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
