package vn.bosch.ecommerce.io.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "roles")
public class Role implements Serializable {
    private static final long serialVersionUID = 7237586574813490104L;
    @Id
    @Column(name = "roleId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long roleId;

    @Column(name = "roleName")
    private String roleName;

    @OneToMany(mappedBy = "roleId")
    private List<Account> accountId;
}
