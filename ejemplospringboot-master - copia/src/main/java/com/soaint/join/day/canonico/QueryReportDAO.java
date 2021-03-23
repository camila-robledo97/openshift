package com.soaint.join.day.canonico;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRawValue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@Entity
@Table(name = "stored_procedure")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class QueryReportDAO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", unique = true)
    private Integer id;

    @Column(name = "code_query", unique = true)
    private String codequery;

    @Column(name = "stored_procedure")
    private String storedProcedure;

    @Column(name = "name_procedure")
    private String nameProcedure;

    @JsonRawValue
    @Column(name = "input")
    private String input;

    @JsonRawValue
    @Column(name = "output")
    private String output;

}
