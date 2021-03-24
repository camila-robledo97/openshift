package co.com.invima.onlineprocedure.canonicalmodel.dto.resultVisit;


import co.com.invima.onlineprocedure.canonicalmodel.dto.parameter.ParameterDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import co.com.invima.onlineprocedure.canonicalmodel.dto.visit.VisitDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVisitDTO {

    private Integer id;
    private VisitDTO visit;
    private Date realDate;
    private ParameterDTO meatGoalId;
    private ParameterDTO resultDiligenceId;
    private String novelties;

}
