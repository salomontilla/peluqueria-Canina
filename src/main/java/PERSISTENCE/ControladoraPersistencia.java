/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERSISTENCE;

import LOGIC.Dueno;
import LOGIC.Mascota;
import PERSISTENCE.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thebi
 */
public class ControladoraPersistencia {
     DuenoJpaController duenoJpa = new DuenoJpaController();
     MascotaJpaController mascoJpa = new MascotaJpaController();
     
     //crear
     public void crearMascota(Mascota masco){
          mascoJpa.create( masco);
     }
     
     //editar
     public void editarMascota(Mascota masco){
          try {
               mascoJpa.edit( masco);
          } catch (Exception ex) {
               Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
          }
     }
     
     //eliminar
     public void eliminarMascota(int idMasco){
          try {
               mascoJpa.destroy(idMasco);
          } catch (NonexistentEntityException ex) {
               Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
          }
     }
     
     //DUENO
     //crear
     public void crearDueno(Dueno duenio){
          duenoJpa.create( duenio);
     }
     
     //editar
     public void editarDueno(Dueno duenio){
          try {
               duenoJpa.edit( duenio);
          } catch (Exception ex) {
               Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
          }
     }
     
     //eliminar
     public void eliminarDueno(int idDueno){
          try {
               duenoJpa.destroy(idDueno);
          } catch (NonexistentEntityException ex) {
               Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
          }
     }
     //Guarda los datos en la base de datos creando nuevos registros
     public void guardarBS(Dueno miDueno, Mascota miMasco) {
          
          duenoJpa.create(miDueno);
          mascoJpa.create(miMasco);
          
     }
     // devuelva una lista de todas las mascotas
     
    public List<Mascota> traerDatosMascotas() {
        return  mascoJpa.findMascotaEntities();
    }
    // devuelve los datos de una sola mascota
    public Mascota traerMascota(int numCliente) {
        return mascoJpa.findMascota(numCliente);
    }
    // modifica o edita los datos de la mascota seleccionada
    public void modificarMasco(Mascota masco) {
         try {
             mascoJpa.edit(masco);
         } catch (Exception ex) {
             Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    // trae los datos del dueno 
    public Dueno traerDueno(int idDueno) {
        return duenoJpa.findDueno(idDueno);
    }
    //modifica o edita los datos del dueno
    public void modificarDueno(Dueno dueno) {
         try {
             duenoJpa.edit(dueno);
         } catch (Exception ex) {
             Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

     
          
}
     
     
     

