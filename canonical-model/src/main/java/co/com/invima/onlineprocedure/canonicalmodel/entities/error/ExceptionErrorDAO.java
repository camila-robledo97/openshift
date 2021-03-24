package co.com.invima.onlineprocedure.canonicalmodel.entities.error;

import co.com.invima.onlineprocedure.canonicalmodel.entities.parameters.ParameterDAO;
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
@Table(name = "exception_error")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ExceptionErrorDAO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Column(name = "er_code", length = 100)
    private String code;

    @Column(name = "er_message", length = 10485760)
    private String message;

    @JoinColumn(name = "er_module", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ParameterDAO module;

    @Column(name = "logical_status" )
    private boolean logicalStatus;

}
