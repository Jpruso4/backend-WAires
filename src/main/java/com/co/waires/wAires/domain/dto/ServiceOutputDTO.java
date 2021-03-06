package com.co.waires.wAires.domain.dto;


import lombok.Data;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Data
public class ServiceOutputDTO {

    private Integer idServicio;
    private Integer idEmpleado;
    private String nombreEmpleado;
    private String celularEmpleado;
    private Integer idCliente;
    private String nombreCliente;
    private String celularCliente;
    private List<ActivitiesTypeDTO> activitiesTypeList;
    private Date fecha;
    private Character realizado;
    private Time tiempoEstimado;
    private Time tiempoUtilizado;

}
