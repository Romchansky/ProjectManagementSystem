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
@Entity(name = "developers_projects")
public class DeveloperProject implements BaseEntity<Long>, Serializable {

    private static final long serialVersionUID = 1701564154270402389L;

    @Id
    @Column(name = "id_developer")
    private Long developerId;

    @Column(name = "id_project")
    private Long projectId;

    @Override
    public Long getId() {
        return developerId;
    }
}
