package co.com.invima.onlineprocedure.canonicalmodel.dto.role;

import co.com.invima.onlineprocedure.canonicalmodel.dto.official.OfficialDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.parameter.ParameterDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoleDTO {

    private Integer id;
    private ParameterDTO idRole;
    private OfficialDTO idOfficial;

}
