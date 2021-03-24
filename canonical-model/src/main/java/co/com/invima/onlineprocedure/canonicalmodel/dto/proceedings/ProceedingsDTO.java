package co.com.invima.onlineprocedure.canonicalmodel.dto.proceedings;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;



@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProceedingsDTO {

    private Integer id;
    private String proceedingsNumber;
    private String idEcm;

}
