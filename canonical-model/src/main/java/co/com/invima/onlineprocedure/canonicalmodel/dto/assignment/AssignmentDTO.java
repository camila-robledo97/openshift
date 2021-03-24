package co.com.invima.onlineprocedure.canonicalmodel.dto.assignment;

import co.com.invima.onlineprocedure.canonicalmodel.dto.official.OfficialDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.parameter.ParameterDTO;
import co.com.invima.onlineprocedure.canonicalmodel.dto.visit.VisitDTO;
import co.com.invima.onlineprocedure.canonicalmodel.entities.official.OfficialDAO;
import co.com.invima.onlineprocedure.canonicalmodel.entities.parameters.ParameterDAO;
import co.com.invima.onlineprocedure.canonicalmodel.entities.visit.VisitDAO;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssignmentDTO implements Serializable {


    private Integer id;
    private ParameterDTO typeAssignment;
    private ParameterDTO process;
    private VisitDTO visit;
    private Date dateAssignment;
    private Date dateExpiration;
    private ParameterDTO task;
    private ParameterDTO country;
    private ParameterDTO department;
    private ParameterDTO city;
    private OfficialDTO auditor;
    private ParameterDTO gtt;
    private ParameterDTO role;
    private ParameterDTO transport;
    private ParameterDTO state;
    private boolean active;
}
