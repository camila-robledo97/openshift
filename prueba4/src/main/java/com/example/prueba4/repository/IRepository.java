package com.example.prueba4.repository;


import co.com.invima.onlineprocedure.canonicalmodel.entities.visit.GVisitDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IRepository extends JpaRepository <GVisitDAO, Integer> {



}
