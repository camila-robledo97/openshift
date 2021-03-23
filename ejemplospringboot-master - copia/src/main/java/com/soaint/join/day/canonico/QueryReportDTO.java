package com.soaint.join.day.canonico;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryReportDTO implements Serializable {

    private Integer id;
    private String codequery;
    private String storedProcedure;
    private String input;
    private String nameProcedure;
    private String output;
}