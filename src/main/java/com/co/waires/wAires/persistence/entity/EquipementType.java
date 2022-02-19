package com.co.waires.wAires.persistence.entity;

import javax.persistence.*;


@Entity
@Table(name = "tipo_equipo")
public class EquipementType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_equipo")
    private Integer idTipoEquipo;

    @Column(name = "tipo_equipo")
    private String tipoEquipo;

    public Integer getIdTipoEquipo() {
        return idTipoEquipo;
    }

    public void setIdTipoEquipo(Integer idTipoEquipo) {
        this.idTipoEquipo = idTipoEquipo;
    }

    public String getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(String tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }
}
