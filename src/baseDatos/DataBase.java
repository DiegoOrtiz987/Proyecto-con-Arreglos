    
/**
 * -------------------------
 * Fecha: 13/12/2017
 * @author: Diego Alexander Ortiz Diaz
 * -------------------------
 */

package baseDatos;

import modelo.Voto;

public class DataBase {
   
   /* Creación de un arreglo de Objetos de tipo Voto y generamos la base en el Constructor
      de la clase Database*/
    
   private Voto [] arregloCessi = new Voto[15];
    
    public DataBase(){
        
        Voto empresa1 = new Voto();
        empresa1.setNombEmpresa("A");
        empresa1.setCategoria(3);
        empresa1.setCantVotos(32);
        arregloCessi[0]=empresa1;
        
        Voto empresa2 = new Voto();
        empresa2.setNombEmpresa("B");
        empresa2.setCategoria(4);
        empresa2.setCantVotos(54);
        arregloCessi[1]=empresa2;
        
        Voto empresa3 = new Voto();
        empresa3.setNombEmpresa("C");
        empresa3.setCategoria(3);
        empresa3.setCantVotos(85);
        arregloCessi[2]=empresa3;
        
        Voto empresa4 = new Voto();
        empresa4.setNombEmpresa("D");
        empresa4.setCategoria(2);
        empresa4.setCantVotos(23);
        arregloCessi[3]=empresa4;
        
        Voto empresa5 = new Voto();
        empresa5.setNombEmpresa("E");
        empresa5.setCategoria(1);
        empresa5.setCantVotos(42);
        arregloCessi[4]=empresa5;
        
        Voto empresa6 = new Voto();
        empresa6.setNombEmpresa("A");
        empresa6.setCategoria(1);
        empresa6.setCantVotos(65);
        arregloCessi[5]=empresa6;
        
        Voto empresa7 = new Voto();
        empresa7.setNombEmpresa("G");
        empresa7.setCategoria(4);
        empresa7.setCantVotos(96);
        arregloCessi[6]=empresa7;
        
        Voto empresa8 = new Voto();
        empresa8.setNombEmpresa("H");
        empresa8.setCategoria(3);
        empresa8.setCantVotos(14);
        arregloCessi[7]=empresa8;
        
        Voto empresa9 = new Voto();
        empresa9.setNombEmpresa("I");
        empresa9.setCategoria(4);
        empresa9.setCantVotos(12);
        arregloCessi[8]=empresa9;
        
        Voto empresa10 = new Voto();
        empresa10.setNombEmpresa("J");
        empresa10.setCategoria(2);
        empresa10.setCantVotos(47);
        arregloCessi[9]=empresa10;
        
        Voto empresa11 = new Voto();
        empresa11.setNombEmpresa("M");
        empresa11.setCategoria(2);
        empresa11.setCantVotos(15);
        arregloCessi[10]=empresa11;
        
        Voto empresa12 = new Voto();
        empresa12.setNombEmpresa("L");
        empresa12.setCategoria(1);
        empresa12.setCantVotos(32);
        arregloCessi[11]=empresa12;
        
        Voto empresa13 = new Voto();
        empresa13.setNombEmpresa("M");
        empresa13.setCategoria(1);
        empresa13.setCantVotos(61);
        arregloCessi[12]=empresa13;
        
        Voto empresa14 = new Voto();
        empresa14.setNombEmpresa("N");
        empresa14.setCategoria(4);
        empresa14.setCantVotos(10);
        arregloCessi[13]=empresa14;
        
        Voto empresa15 = new Voto();
        empresa15.setNombEmpresa("O");
        empresa15.setCategoria(2);
        empresa15.setCantVotos(45);
        arregloCessi[14]=empresa15;        
    }

    public Voto[] getArregloCessi() {
        return arregloCessi;
    }
}




