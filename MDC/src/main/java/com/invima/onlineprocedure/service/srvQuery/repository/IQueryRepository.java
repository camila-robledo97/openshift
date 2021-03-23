package com.invima.onlineprocedure.service.srvQuery.repository;

import java.util.List;

import com.invima.onlineprocedure.service.srvQuery.canonico.QueryReportDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IQueryRepository extends JpaRepository <QueryReportDAO, Integer> {


    @Query (value ="exec :#{#stored_procedure} :params, :pageSize , :page, :orderBy, :order", nativeQuery = true)
    List <Object[]> proc_parameter_code(String stored_procedure, String params, int pageSize, int page, String orderBy, String order);

    @Query ("select stored from QueryReportDAO stored where stored.codequery=:code")
    QueryReportDAO find_stored_procedure(String code);


}
