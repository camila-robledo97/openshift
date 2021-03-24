package co.com.invima.onlineprocedure.canonicalmodel.dto.officialassignment;

import co.com.invima.onlineprocedure.canonicalmodel.dto.assignment.AssignmentDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.official.OfficialDTO;
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
public class OfficialAssignmentDTO implements Serializable {

    private OfficialDTO official;
    private AssignmentDTO assignment;


}
