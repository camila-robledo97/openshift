package co.com.invima.onlineprocedure.canonicalmodel.dto.officialVisit;

import co.com.invima.onlineprocedure.canonicalmodel.dto.official.OfficialDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.visit.VisitDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfficialVisitDTO {

    private VisitDTO idVisit;
    private OfficialDTO idOfficial;
    private boolean logicalStatus;

}
