package com.example.prueba4.objeto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Visitas implements Serializable {
    String id;
    Integer prioridad;
    InfoVisita info_Visita;
    List <DocVisita> doc_Visita;

}
