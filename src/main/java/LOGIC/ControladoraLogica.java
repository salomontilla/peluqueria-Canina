/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LOGIC;

import PERSISTENCE.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author thebi
 */
public class ControladoraLogica {
     ControladoraPersistencia controlPersis = new ControladoraPersistencia();
     
     public void crearMasco(Mascota masco){
          controlPersis.crearMascota(masco);
     }
     public void editarMasco(Mascota masco){
          controlPersis.editarMascota(masco);
     }
     public void eliminarMasco(int idMasco){
          controlPersis.eliminarMascota(idMasco);
     }
     
     //dueno
     public void crearDueno(Dueno dueno){
          controlPersis.crearDueno(dueno);
     }
     public void editarDueno(Dueno dueno){
          controlPersis.editarDueno(dueno);
     }
     public void eliminarDueno(int idDueno){
          controlPersis.eliminarDueno(idDueno);
     }
     
     //este metodo guarda todos los datos obtenidos en la base de datos
     public void guardar(String color, String nbrMascota, String raza, String observacion, 
                                        String alergico, String atencion, String celular, String nbrDueno) {
          
          //crear dueno
          Dueno miDueno = new Dueno();
          miDueno.setCelular(celular);
          miDueno.setNbrDueno(nbrDueno);
          //crear mascota
          Mascota miMasco = new Mascota ();
          miMasco.setNbrMascota(nbrMascota);
          miMasco.setColor(color);
          miMasco.setRaza(raza);
          miMasco.setAlergia(alergico);
          miMasco.setEspecial(atencion);
          miMasco.setDueno(miDueno);
          miMasco.setObservaciones(observacion);
          
          
          controlPersis.guardarBS(miDueno, miMasco);
     }//fin metodo guardar
     
     //metodo para traer todos los datos de los clientes
     public List<Mascota> traerDatosMascota(){
         
         return controlPersis.traerDatosMascotas();
         
     } 

    //borra el cliente de la lista 
    public void borrarCliente(int numCliente) {
        
        controlPersis.eliminarMascota(numCliente);
        
    }
    //devuelve la mascota dependiendo de su id 
    public Mascota traerMascota(int numCliente) {
        return controlPersis.traerMascota(numCliente);
    }
    // A los datos de la antigua mascota les establece los nuevos valores
    public void editarMascota(Mascota masco, String color, String nbrMascota, 
                            String raza, String observacion, String alergico, 
                            String atencion, String celular, String nbrDueno) {
        
        masco.setAlergia(alergico);
        masco.setColor(color);
        masco.setEspecial(atencion);
        masco.setNbrMascota(nbrMascota);
        masco.setObservaciones(observacion);
        masco.setRaza(raza);
        
        controlPersis.modificarMasco(masco);//Llama el metodo de la persis para modificar o editar los datos
        
        Dueno dueno = this.buscarDueno(masco.getDueno().getIdDueno());// crea un nuevo dueno dpendiendo del id que tenga la mascota
        dueno.setCelular(celular);//setea los datos
        dueno.setNbrDueno(nbrDueno);
        this.modificarDueno(dueno); // llama al metodo global modidificar datos
    }
    
    // Este metodo devuelve el dueno que se desea buscar por su id
    public Dueno buscarDueno(int idDueno) {//(se invoca en la linea 91)
        
        return controlPersis.traerDueno(idDueno);
    }
    
    //Este metodo modifica o edita los datos del dueno 
    private void modificarDueno(Dueno dueno) {//(se invoca en la linea 94)
        controlPersis.modificarDueno(dueno);
    }
     
}//fin clase
