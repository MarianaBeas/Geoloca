/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.geoloca;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import org.springframework.data.annotation.Id;

/**
 *
 * @author SE
 */
@JsonIgnoreProperties(ignoreUnknown = true)//puedes guardar y omitir las columnas que no te interesan y que mongo db no lo vea como un error
public class Usuario {
    @Id
    private String id;
    private String nombre;
    private Double lat;
    private Double lon;
    private List<Materia> materias;

    public Usuario() {
    }

    @Override
    public String toString() {
                return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", lat=" + lat + ", lon=" + lon + '}';
    }
     /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the lat
     */
    public Double getLat() {
        return lat;
    }

    /**
     * @param lat the lat to set
     */
    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     * @return the lon
     */
    public Double getLon() {
        return lon;
    }

    /**
     * @param lon the lon to set
     */
    public void setLon(Double lon) {
        this.lon = lon;
    }
    /**
     * @param Id
     */
    public void setId(String Id) {
        this.id = Id;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
}
