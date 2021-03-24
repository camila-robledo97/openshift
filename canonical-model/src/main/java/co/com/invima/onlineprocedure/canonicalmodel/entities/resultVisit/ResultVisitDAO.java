package co.com.invima.onlineprocedure.canonicalmodel.entities.resultVisit;


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
@Table(name = "result_visit", uniqueConstraints = {@UniqueConstraint(columnNames = {"visit"})})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ResultVisitDAO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @JoinColumn(name = "visit", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private VisitDAO visit;

    @Column(name = "real_date")
    private Date realDate;

    @JoinColumn(name = "id_meat_goal", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ParameterDAO idMeatGoal;

    @JoinColumn(name = "id_result_diligence", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ParameterDAO idResultDiligence;

    @Column(name = "novelties")
    private String novelties;

    @Column(name = "logical_status" )
    private boolean logicalStatus;
}
