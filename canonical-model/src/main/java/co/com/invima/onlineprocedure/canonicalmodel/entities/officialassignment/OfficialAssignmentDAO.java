package co.com.invima.onlineprocedure.canonicalmodel.entities.officialassignment;

import co.com.invima.onlineprocedure.canonicalmodel.entities.assignment.AssignmentDAO;
import co.com.invima.onlineprocedure.canonicalmodel.entities.official.OfficialDAO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "official_assignment")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class OfficialAssignmentDAO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", unique = true)
    private Integer id;

    @JoinColumn(name = "official", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private OfficialDAO official;

    @JoinColumn(name = "assignment", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private AssignmentDAO assignment;

    @Column(name = "logical_status" )
    private boolean logicalStatus;


}
