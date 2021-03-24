package co.com.invima.onlineprocedure.canonicalmodel.dto.observations;

import co.com.invima.onlineprocedure.canonicalmodel.dto.official.OfficialDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.parameter.ParameterDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.visit.VisitDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ObservationsDTO {

    private Integer id;
    private String code;
    private VisitDTO idVisit;
    private OfficialDTO idOfficial;
    private Date date;
    private String observation;
    private ParameterDTO idParameter;
    private ParameterDTO idTask;

}
