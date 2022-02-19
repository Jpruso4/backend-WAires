package com.co.waires.wAires.persistence.entity;

import javax.persistence.*;


@Entity
@Table(name = "capacidad_equipo")
public class EquipementCapacity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_capacidad")
    private Integer idCapacidad;

    @Column(name = "capacidad")
    private String capacidad;

    public Integer getIdCapacidad() {
        return idCapacidad;
    }

    public void setIdMarcadMarca(Integer idTipoDocumento) {
        this.idCapacidad = idCapacidad;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
}
