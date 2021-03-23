package com.soaint.join.day.canonico;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Entity
@Table(name = "test_visit")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class TestVisitDAO implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Column(name = "code", length = 100, unique = true, nullable = false)
    @Basic(optional = false)
    private String code;

    @Column(name = "direction", length = 100, nullable = false)
    @Basic(optional = false)
    private String direction;

    @Column(name = "city", length = 100, nullable = false)
    @Basic(optional = false)
    private String city;

    @Column(name = "country", length = 100, nullable = false)
    @Basic(optional = false)
    private String country;

    @Column(name = "establishment_name", length = 100, nullable = false)
    @Basic(optional = false)
    private String establishmentName;

    @Column(name = "inspector", length = 100, nullable = false)
    @Basic(optional = false)
    private String inspector;

    @Column(name = "product_visit", length = 100, nullable = false)
    @Basic(optional = false)
    private String productVisit;

    @Column(name = "real_date")
    private Date realDate;

}
