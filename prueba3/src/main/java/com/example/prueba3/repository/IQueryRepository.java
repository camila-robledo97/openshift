package com.example.prueba3.repository;


import co.com.invima.onlineprocedure.canonicalmodel.entities.query.QueryReportDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IQueryRepository extends JpaRepository <QueryReportDAO, Integer> {

    @Query(value ="exec :#{#stored_procedure} :params, :pageSize , :page, :orderBy, :order", nativeQuery = true)
    List <Object[]> proc_parameter_code(String stored_procedure, String params, int pageSize, int page, String orderBy, String order);

    @Query ("select stored from QueryReportDAO stored where stored.codequery=:code")
    QueryReportDAO find_stored_procedure(String code);

}
