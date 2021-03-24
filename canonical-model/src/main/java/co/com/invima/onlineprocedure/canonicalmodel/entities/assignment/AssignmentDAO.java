package co.com.invima.onlineprocedure.canonicalmodel.entities.assignment;

import co.com.invima.onlineprocedure.canonicalmodel.entities.official.OfficialDAO;
import co.com.invima.onlineprocedure.canonicalmodel.entities.parameters.ParameterDAO;
import co.com.invima.onlineprocedure.canonicalmodel.entities.visit.VisitDAO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "assignment")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class AssignmentDAO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @JoinColumn(name = "type_assignment", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ParameterDAO typeAssignment;


    @JoinColumn(name = "process", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ParameterDAO process;

    @JoinColumn(name = "visit", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private VisitDAO visit;

    @Column(name = "date_assignment")
    private Date dateAssignment;

    @Column(name = "date_expiration")
    private Date dateExpiration;

    @JoinColumn(name = "task", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ParameterDAO task;


    @JoinColumn(name = "country", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ParameterDAO country;


    @JoinColumn(name = "department", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ParameterDAO department;


    @JoinColumn(name = "city", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ParameterDAO city;


    @JoinColumn(name = "auditor", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private OfficialDAO auditor;


    @JoinColumn(name = "gtt", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ParameterDAO gtt;

    @JoinColumn(name = "role", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ParameterDAO role;

    @JoinColumn(name = "transport", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ParameterDAO transport;

    @JoinColumn(name = "state", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ParameterDAO state;

    @Column(name = "active")
    private boolean active;

}
