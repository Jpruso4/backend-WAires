package com.co.waires.wAires.domain.dto;


import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
public class ServiceInputDTO {

    private Integer idServicio;
    private Integer idEmpleado;
    private Integer idCliente;
    private Integer idActtividad;
    private Date fecha;
    private Character realizado;
    private Time tiempoEstimado;
    private Time tiempoUtilizado;

}
