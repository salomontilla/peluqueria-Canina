/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LOGIC;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author thebi
 */
@Entity
public class Mascota implements Serializable {
     @Id
     @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int idMascota;
    private String nbrMascota;
    private String raza;
    private String color;
    private String alergia;
    private String especial;
    private String observaciones;
    
    @OneToOne
    private Dueno dueno;

     public Mascota(int idMascota, String nbrMascota, String raza, String color, String alergia, String especial, String observaciones, Dueno dueno) {
          this.idMascota = idMascota;
          this.nbrMascota = nbrMascota;
          this.raza = raza;
          this.color = color;
          this.alergia = alergia;
          this.especial = especial;
          this.observaciones = observaciones;
          this.dueno = dueno;
     }

     public Mascota() {
     }

     public int getIdMascota() {
          return idMascota;
     }

     public void setIdMascota(int idMascota) {
          this.idMascota = idMascota;
     }

     public String getNbrMascota() {
          return nbrMascota;
     }

     public void setNbrMascota(String nbrMascota) {
          this.nbrMascota = nbrMascota;
     }

     public String getRaza() {
          return raza;
     }

     public void setRaza(String raza) {
          this.raza = raza;
     }

     public String getColor() {
          return color;
     }

     public void setColor(String color) {
          this.color = color;
     }

     public String getAlergia() {
          return alergia;
     }

     public void setAlergia(String alergia) {
          this.alergia = alergia;
     }

     public String getEspecial() {
          return especial;
     }

     public void setEspecial(String especial) {
          this.especial = especial;
     }

     public String getObservaciones() {
          return observaciones;
     }

     public void setObservaciones(String observaciones) {
          this.observaciones = observaciones;
     }

     public Dueno getDueno() {
          return dueno;
     }

     public void setDueno(Dueno dueno) {
          this.dueno = dueno;
     }
     
     
}
