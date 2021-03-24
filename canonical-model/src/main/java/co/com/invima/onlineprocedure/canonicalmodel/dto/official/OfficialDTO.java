package co.com.invima.onlineprocedure.canonicalmodel.dto.official;

import co.com.invima.onlineprocedure.canonicalmodel.dto.parameter.ParameterDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfficialDTO implements Serializable {

    private Integer id;
    private ParameterDTO typeDocument;
    private String documentNumber;
    private String names;
    private String surnames;
    private String address;
    private String emailAddress;
    private String userName;
    private String credential;
    private ParameterDTO state;

}
