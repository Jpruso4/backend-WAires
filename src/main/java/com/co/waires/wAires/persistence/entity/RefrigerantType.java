package com.co.waires.wAires.persistence.entity;

import javax.persistence.*;


@Entity
@Table(name = "tipo_refrigerante")
public class RefrigerantType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_refrigerante")
    private Integer idTipoRefrigerante;

    @Column(name = "refrigerante")
    private String refrigerante;

    public Integer getIdTipoRefrigerante() {
        return idTipoRefrigerante;
    }

    public void setIdMarcadMarca(Integer idTipoDocumento) {
        this.idTipoRefrigerante = idTipoRefrigerante;
    }

    public String getRefrigerante() {
        return refrigerante;
    }

    public void setRefrigerante(String refrigerante) {
        this.refrigerante = refrigerante;
    }
}
