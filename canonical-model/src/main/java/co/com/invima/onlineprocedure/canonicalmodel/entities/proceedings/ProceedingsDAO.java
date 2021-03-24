package co.com.invima.onlineprocedure.canonicalmodel.entities.proceedings;

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
@Table(name = "proceedings")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ProceedingsDAO  implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", unique = true)
    private Integer id;


    @Column(name = "proceedings_number", unique = true)
    private String proceedingsNumber;

    @Column(name = "id_ecm", unique = true)
    private String idEcm;

    @Column(name = "logical_status" )
    private boolean logicalStatus;

}
