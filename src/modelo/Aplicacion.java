
/**
 * -------------------------
 * Fecha: 13/12/2017
 * @author: Diego Alexander Ortiz Diaz
 * -------------------------
 */

package modelo;

import baseDatos.DataBase;

public class Aplicacion {

    public static void main (String [] args){

       DataBase db= new DataBase();
       Preclasificacion objPre = new Preclasificacion(); 

       //objPre.imprimir(db.getArregloCessi());
       objPre.contarVotos(db.getArregloCessi());
        
    }
    
    
}




