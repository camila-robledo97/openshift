package com.soaint.join.day.canonico;


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
public class ParameterDTO implements Serializable {

    private Integer id;
    private String description;
    private String code;
    private String name;
    private String parent;
    private boolean state;
    private String value;


}
