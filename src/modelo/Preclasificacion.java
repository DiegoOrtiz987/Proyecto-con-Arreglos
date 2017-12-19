/**
 * -------------------------
 * Fecha: 13/12/2017
 * @author: Diego Alexander Ortiz Diaz
 * -------------------------
 */

package modelo;

import baseDatos.DataBase;

/**
 *
 * @Diego Ortiz Diaz
 */
public class Preclasificacion {
    
 //**** Método que imprime el arreglo. ************
    
    public void imprimir(Voto [] arreglo){
        
        for (int i = 0; i < arreglo.length; i++) {
            
            System.out.println (arreglo[i].getNombEmpresa()+ " " +
                                arreglo[i].getCategoria() + " " +
                                arreglo[i].getCantVotos());
            
        }
    }
    
  //**** Método de preclasificación. ************
    
     public void contarVotos(Voto [] arreglo){
        
    //**** Llamada a la Función para ordenar el método por categoría. ************
         
         OrdenarCategoria(arreglo);
        
    //**** Llamada al método Imprimir() verificando el arreglo ordenado por categoría. ************
     
        //imprimir(arreglo);

    //**** Se ordena el arreglo decrecientemente por la cantidad de votos según cada categoría y se suman dichos votos.
        
        int contador=0;
        
        for (int i=0; i<arreglo.length; i++){
            
            int indice=i;
            
            if ((i+1)!= arreglo.length){

                if (arreglo[i].getCategoria() != arreglo[i+1].getCategoria()){  
                    
           /*****Llamada a la función de ordenarVotos() logrando ordenar el arreglo decrecientemente basado en el 
                 atributo CantVotos y mostrar su porcentaje de participación segun los votos y categoría.*********/
           
                    ordenarVotos(arreglo, i, indice, contador);
                    contador=0;
                    
                }else{
                    
                    contador+=1; 
                }                
            }else {                
             /*****Llamada a la función de ordenarVotos() logrando ordenar el arreglo decrecientemente basado en el 
                   atributo CantVotos y mostrar su porcentaje de participación segun los votos y categoría.*********/
             
                    ordenarVotos(arreglo, i, indice, contador);
            }
        }         
    } 
     
 // ****** Función para Ordenar el arreglo por categoría.  ********************
     
     public Voto[] OrdenarCategoria(Voto[] arreglo){
        
        for (int i=0; i<arreglo.length; i++){
            
            for (int j=i+1; j<arreglo.length; j++){
                
                if (arreglo[i].getCategoria() > arreglo[j].getCategoria()){
                   
                    String aux1="";
                    int aux2=0;
                    int aux3=0;
                             
                    aux1=arreglo[j].getNombEmpresa();
                    aux2=arreglo[j].getCategoria();
                    aux3=arreglo[j].getCantVotos();
                    
                    arreglo[j].setNombEmpresa(arreglo[i].getNombEmpresa());
                    arreglo[j].setCategoria(arreglo[i].getCategoria());
                    arreglo[j].setCantVotos(arreglo[i].getCantVotos());
                    
                    arreglo[i].setNombEmpresa(aux1);
                    arreglo[i].setCategoria(aux2);
                    arreglo[i].setCantVotos(aux3);   
                }
            }
        }
        return arreglo;
    }

/****** Función para Ordenar el arreglo por votos y la suma de estos según su categoría, Finalmente se imprimen 
        las tres primeras empresas de cada categoría por su porcentaje de participación segun los votos de manera decreciente. */
     
  public void ordenarVotos(Voto[] arreglo,int i,int indice, int contador){
      
      float totalVotosCategoria=0;
      
      for (int j=i-contador; j<=indice; j++){
          for (int n=j+1; n<=indice; n++){
              if (arreglo[j].getCantVotos() < arreglo[n].getCantVotos()){
                  String aux1="";
                  int aux2=0;
                  int aux3=0;

                  aux1=arreglo[n].getNombEmpresa();
                  aux2=arreglo[n].getCategoria();
                  aux3=arreglo[n].getCantVotos();

                  arreglo[n].setNombEmpresa(arreglo[j].getNombEmpresa());
                  arreglo[n].setCategoria(arreglo[j].getCategoria());
                  arreglo[n].setCantVotos(arreglo[j].getCantVotos());

                  arreglo[j].setNombEmpresa(aux1);
                  arreglo[j].setCategoria(aux2);
                  arreglo[j].setCantVotos(aux3);
               }

            }
        }
      
    /**** Llamada a la función Imprimir verificando el arreglo ordenado por categoría
          y cantidad de votos.************/
         
            // imprimir(arreglo);
    
    //**** Se recorre el arrreglo sumando la cantidad de votos segun cada categoría.
    
        for (int j=i-contador; j<=indice; j++){

            totalVotosCategoria+=arreglo[j].getCantVotos();
       }
                    
    //***** Imprimir el resultado de las tres primeras empresas por categoría y porcentaje de votacion de manera decreciente.
    
        for (int j=i-contador;j<(i-contador)+3;j++){

          System.out.println ("La empresa " + arreglo[j].getNombEmpresa() + 
                                " pertenece a la categoría " + arreglo[j].getCategoria() + 
                                " obtuvo una cantidad de " + arreglo[j].getCantVotos() + " votos "+ 
                                "y su respectivo porcentaje de participación es del: " + 
                                ((arreglo[j].getCantVotos()/totalVotosCategoria)*100) + "%");
        }              
  } 
}

