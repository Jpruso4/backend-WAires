package com.co.waires.wAires.domain.dto;

import lombok.Data;

@Data
public class EmployeeDTO {

    private int cedula;
    private String nombre;
    private String celular;
    private String correo;
    private String contrasena;
    private Character activo;
    private int perfil;

}
