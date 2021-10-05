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
@Entity(name = "companies_projects")
public class CompanyProject implements BaseEntity<Long>, Serializable {

    private static final long serialVersionUID = 7865864705067385362L;

    @Id
    @Column(name = "id_company")
    private Long companyId;

    @Column(name = "id_project")
    private Long projectId;

    @Override
    public Long getId() {
        return companyId;
    }
}
