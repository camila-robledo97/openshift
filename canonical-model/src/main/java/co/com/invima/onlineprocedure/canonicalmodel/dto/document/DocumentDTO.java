package co.com.invima.onlineprocedure.canonicalmodel.dto.document;


import co.com.invima.onlineprocedure.canonicalmodel.dto.parameter.ParameterDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.proceedings.ProceedingsDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.resultVisit.ResultVisitDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocumentDTO implements Serializable {
    private ProceedingsDTO idProceeding;
    private String idEcm;
    private ParameterDTO idDocumentaryType;
    private String name;
    private Date documentDate;
    private Date createDate;
    private Integer numberFolios;
    private ResultVisitDTO idResultVisit;
    private String codeDocument;

}
