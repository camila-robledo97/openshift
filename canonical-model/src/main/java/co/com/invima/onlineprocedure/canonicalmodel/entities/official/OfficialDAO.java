package co.com.invima.onlineprocedure.canonicalmodel.entities.official;

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
@Table(name = "official")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class OfficialDAO  implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @JoinColumn(name = "type_document", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ParameterDAO typeDocument;

    @Column(name = "document_number", length = 5000)
    private String documentNumber;

    @Column(name = "names", length = 100, unique = true,nullable = false)
    private String names;


    @Column(name = "surnames", length = 100,nullable = false)
    private String surnames;

    @Column(name = "address", length = 5000)
    private String address;


    @Column(name = "email_address", length = 5000,unique = true,nullable = false)
    private String emailAddress;


    @Column(name = "username", length = 100, unique = true,nullable = false)
    private String userName;

    @Column(name = "credential", length = 5000,unique = true,nullable = false)
    private String credential;

    @JoinColumn(name ="state", referencedColumnName = "id",nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private ParameterDAO state;

    @Column(name = "logical_status" )
    private boolean logicalStatus;

}
