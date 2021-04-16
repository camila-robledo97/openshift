package com.example.prueba4.commons.converter;


import co.com.invima.onlineprocedure.canonicalmodel.dto.visit.GVisitDTO;
import co.com.invima.onlineprocedure.canonicalmodel.entities.visit.GVisitDAO;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class FileConverter {
    public GVisitDAO GVisitDTOtoGVisitDao(GVisitDTO gVisitDTO)  {
        Date dateActual = new Date();
        java.sql.Timestamp date2 = new java.sql.Timestamp(dateActual.getTime());
        return GVisitDAO.builder()
                .code(gVisitDTO.getCode())
                .estado(gVisitDTO.getEstado())
                .observaciones(gVisitDTO.getObservaciones())
                .prioridad(gVisitDTO.getPrioridad())
                .realDate(date2)
                .build();

    }
}
