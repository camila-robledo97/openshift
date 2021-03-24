package co.com.invima.onlineprocedure.canonicalmodel.entities.observations;

import co.com.invima.onlineprocedure.canonicalmodel.entities.official.OfficialDAO;
import co.com.invima.onlineprocedure.canonicalmodel.entities.parameters.ParameterDAO;
import co.com.invima.onlineprocedure.canonicalmodel.entities.visit.VisitDAO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "observations")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ObservationsDAO implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", unique = true)
    private Integer id;

    @Column(name = "code", length = 100, unique = true, nullable = false)
    @Basic(optional = false)
    private String code;

    @JoinColumn(name = "id_visit", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private VisitDAO idVisit;

    @JoinColumn(name = "id_official", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private OfficialDAO idOfficial;

    @Column(name = "date")
    private Date date;

    @Column(name = "observation")
    private String observation;

    @JoinColumn(name = "id_parameter", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ParameterDAO idParameter;

    @JoinColumn(name = "id_task", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ParameterDAO idTask;

    @Column(name = "logical_status" )
    private boolean logicalStatus;

}
