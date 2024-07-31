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

/**
 *
 * @author thebi
 */
@Entity
public class Dueno implements Serializable {
     @Id
     @GeneratedValue(strategy=GenerationType.SEQUENCE )
     private int idDueno;
     
     private String celular;
     private String nbrDueno;
     
     public Dueno() {
     }
     
     public Dueno(int idDueno, String nbrDueno, String celular) {
          this.idDueno = idDueno;
          this.celular = celular;
          this.nbrDueno = nbrDueno;
     }

     public int getIdDueno() {
          return idDueno;
     }

     public void setIdDueno(int idDueno) {
          this.idDueno = idDueno;
     }

     public String getCelular() {
          return celular;
     }

     public void setCelular(String celular) {
          this.celular = celular;
     }

     public String getNbrDueno() {
          return nbrDueno;
     }

     public void setNbrDueno(String nbrDueno) {
          this.nbrDueno = nbrDueno;
     }

        
    

     
     
     
     
     
}
