/**
 * -------------------------
 * Fecha: 13/12/2017
 * @author: Diego Alexander Ortiz Diaz
 * -------------------------
 */

package modelo;

public class Voto {
    
    private String nombEmpresa="";
    private int categoria=0;
    private int cantVotos=0;
    
    public void setNombEmpresa(String nombEmpresa){
        this.nombEmpresa = nombEmpresa;
    }
    
    public String getNombEmpresa(){
        return nombEmpresa;
    }
     
    public void setCategoria(int categoria){
        this.categoria=categoria;
    }
    
    public int getCategoria(){
        return categoria;
    }
    
    public void setCantVotos(int cantVotos){
        this.cantVotos=cantVotos;
    }
    
    public int getCantVotos(){
        return cantVotos;
    }
}
