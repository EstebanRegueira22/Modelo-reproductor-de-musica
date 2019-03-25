package musica;

import java.util.ArrayList;
import java.util.Random;

public class ListaDeReproduccion {

    private ArrayList<Cancion> canciones;
    private int indice;    
    private Random aleatorio;
    
    public ListaDeReproduccion() {
        this.canciones = new ArrayList<Cancion>();
    }
    
    
    public void agregar(Cancion cancion) {
        this.canciones.add(cancion);
    }
    
        
    public Cancion primeraCancion() {
        if(this.canciones.size() == 0) {
            return null;
        }
        else {
            this.indice = 0;
            return this.canciones.get(0);
        }
    }
    
    public Cancion siguienteCancion() {
        if(this.indice+1 >= this.canciones.size()) {
            return null;
        }
        else {
            this.indice = this.indice + 1;
            return this.canciones.get(this.indice);
        }
    }
    
    public Cancion cancionAleatoria(){        
        aleatorio = new Random();
        this.indice = aleatorio.nextInt(this.canciones.size());
        if(this.indice >= this.canciones.size()) {
            return null;
        }
        else {           
            return this.canciones.get(this.indice);
        }            
    }      
    
    public Cancion activarRepeticion(){
        this.indice = this.indice + 1;
        if(this.indice >= this.canciones.size()){
            this.indice = 0;            
        }        
        return this.canciones.get(this.indice);
    }

    void agregar(ArrayList<Cancion> cancion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
