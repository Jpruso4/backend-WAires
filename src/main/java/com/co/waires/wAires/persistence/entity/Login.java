package com.co.waires.wAires.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "empleados")
public class Login {

    @Id
    @Column(name = "cedula")
    private String usuario;

    @Column(name = "contraseña")
    private String contraseña;
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
