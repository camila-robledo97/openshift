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
public class Access implements Serializable {
    private Boolean manageGroupMembership;
    private Boolean view;
    private Boolean mapRoles;
    private Boolean impersonate;
    private Boolean manage;
}
