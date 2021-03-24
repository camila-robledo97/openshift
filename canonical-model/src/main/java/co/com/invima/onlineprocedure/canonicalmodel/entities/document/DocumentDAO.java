package co.com.invima.onlineprocedure.canonicalmodel.entities.document;


import co.com.invima.onlineprocedure.canonicalmodel.entities.parameters.ParameterDAO;
import co.com.invima.onlineprocedure.canonicalmodel.entities.proceedings.ProceedingsDAO;
import co.com.invima.onlineprocedure.canonicalmodel.entities.resultVisit.ResultVisitDAO;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "document")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class DocumentDAO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", unique = true)
    private Integer id;

    @JoinColumn(name = "id_proceedings", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ProceedingsDAO idProceeding;

    @Column(name = "id_ecm", unique = true)
    private String idEcm;

    @JoinColumn(name = "id_documentary_type", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ParameterDAO idDocumentaryType;

    @JoinColumn(name = "name")
    private String name;

    @JoinColumn(name = "document_date")
    private Date documentDate;

    @JoinColumn(name = "create_date")
    private Date createDate;

    @Column(name = "number_folios")
    private Integer numberFolios;

    @JoinColumn(name = "id_result_visit", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private ResultVisitDAO idResultVisit;


    @JoinColumn(name = "codigo_document")
    private String codeDocument;



    @Column(name = "logical_status" )
    private boolean logicalStatus;


}
