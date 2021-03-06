package co.com.invima.onlineprocedure.canonicalmodel.dto.keycloak.userNative;

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
public class Credentials implements Serializable {
    private String type;
    private String value;
    private Boolean temporary;
}
