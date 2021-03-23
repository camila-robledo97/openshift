package com.invima.onlineprocedure.service.srvQuery.canonico;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestVisitDTO implements Serializable {

    private Integer id;
    private String code;
    private String direction;
    private String city;
    private String country;
    private String establishmentName;
    private String inspector;
    private String productVisit;
    private Date realDate;
}
