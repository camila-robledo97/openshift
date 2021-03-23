package com.soaint.join.day.canonico;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VisitDTO implements Serializable {

    private Integer id;
    private String code;
    private ParameterDTO country;
    private ParameterDTO department;
    private ParameterDTO city;
    private ParameterDTO typeVisit;
    private ParameterDTO prioridad;
    private ParameterDTO estado;
    private boolean logicalStatus;

    /*
    private ParameterDTO type_department;
    private ParameterDTO type_municipality;
    private ParameterDTO type_viewReason;
    private ParameterDTO type_view;
    private ParameterDTO type_riskLevel;
    private ParameterDTO type_sourceInformation;
    private ParameterDTO type_product;
    private ParameterDTO antecedent;
    private ParameterDTO type_gtt;
    private ParameterDTO reasonivc;
    private ParameterDTO type_priority;
    private ParameterDTO type_sanitaryConcept;
    private String establishment,branch_number;
    private ParameterDTO type_establishment;
    private ParameterDTO type_identification;
    private String identification_number;
    private String address;
    private String phone;
    private String product_name;
    private String lot_number;
    private String numberRS;
    private String observations;
    private String referenciaAntecedent;
    private String filingNumber;
    private String alteration_possible;
*/

}
