package ua.goit.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "customers_projects")
public class CustomerProject implements BaseEntity<Long>, Serializable {

    private static final long serialVersionUID = 8342789636351329051L;

    @Id
    @Column(name = "id_customer")
    private Long customer_id;

    @Column(name = "id_project")
    private Long project_id;

    @Override
    public Long getId() {
        return customer_id;
    }
}
