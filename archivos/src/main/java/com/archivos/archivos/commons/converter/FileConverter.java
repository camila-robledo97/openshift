package com.archivos.archivos.commons.converter;

import co.com.invima.onlineprocedure.canonicalmodel.dto.visit.GVisitDTO;
import co.com.invima.onlineprocedure.canonicalmodel.entities.visit.GVisitDAO;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class FileConverter {

    public GVisitDAO GVisitDTOtoGVisitDao(GVisitDTO gVisitDTO){
        java.util.Date fecha = new Date();
        return GVisitDAO.builder()
               .code(gVisitDTO.getCode())
                .prioridad(gVisitDTO.getPrioridad())
                .estado(gVisitDTO.getEstado())
                .observaciones(gVisitDTO.getObservaciones())
                .realDate(fecha)
                .build();

    }
}
