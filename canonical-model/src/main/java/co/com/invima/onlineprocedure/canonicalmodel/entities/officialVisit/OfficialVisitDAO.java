package co.com.invima.onlineprocedure.canonicalmodel.entities.officialVisit;

import co.com.invima.onlineprocedure.canonicalmodel.entities.official.OfficialDAO;
import co.com.invima.onlineprocedure.canonicalmodel.entities.visit.VisitDAO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "official_visit")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class OfficialVisitDAO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", unique = true)
    private Integer id;

    @JoinColumn(name = "id_visit", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private VisitDAO idVisit;


    @JoinColumn(name = "id_official", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private OfficialDAO idOfficial;

    @Column(name = "logical_status" )
    private boolean logicalStatus;

}
