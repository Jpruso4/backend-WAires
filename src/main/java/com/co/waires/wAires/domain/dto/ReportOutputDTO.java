package com.co.waires.wAires.domain.dto;

import lombok.Data;

import java.util.List;

@Data
public class ReportOutputDTO {

    private Integer idReporte;
    private Integer idServicio;
    private Integer idEmpleado;
    private String nombreEmpleado;
    private String celularEmpleado;
    private Integer idCliente;
    private String nombreCliente;
    private String celularCliente;
    private List<ActivitiesTypeDTO> activitiesTypeList;
    private Integer idEquipo;
    private String ubicacion;
    private Integer idTipoEquipo;
    private String tipoEquipo;
    private Integer idMarca;
    private String nombreMarca;
    private Integer idTipoRefrigerante;
    private String refrigerante;
    private Integer idCapacidadEquipo;
    private String capacidad;
    private String voltaje;
    private String ammperaje;
    private String tempAmbiente;
    private String tempSalida;
    private String ammperajel1;
    private String ammperajel2;
    private String ammperajel3;
    private String voltajel1_l2;
    private String voltajel2_l3;
    private String voltajel1_l3;
    private String presionCondesadora;
    private String observaciones;

}
