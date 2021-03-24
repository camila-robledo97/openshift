package co.com.invima.onlineprocedure.canonicalmodel.dto.keycloak.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class KeycloakUserDTO implements Serializable {
    private String id;
    private Long createdTimestamp;
    private String username;
    private Boolean enabled;
    private Boolean totp;
    private Boolean emailVerified;
    private String firstName;
    private String lastName;
    private String email;
    private List<Object> disableableCredentialTypes;
    private List<Object> requiredActions;
    private Integer notBefore;
    private AccessDTO access;
    private List<CredentialsDTO> credentials;
}
