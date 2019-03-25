package musica;

public class ReproductorMusical {

    private ListaDeReproduccion lista;
    
    public ReproductorMusical() {
        this.lista = new ListaDeReproduccion();        
    }
    
    public void agregarCancion(Cancion cancion) {
        this.lista.agregar(cancion);
    }
    
     
    public void agregarCanciones(Cancion cancion1,Cancion cancion2,Cancion cancion3){
        this.lista.agregar(cancion1);
        this.lista.agregar(cancion2);
        this.lista.agregar(cancion3);
    }
    
    
    public void reproducir() {    
        Cancion cancion = this.lista.primeraCancion();
        while(cancion != null)
        {
            reproducir(cancion);
            cancion = this.lista.siguienteCancion();
        }        
    }
            
   
    
    public void duracionTotalDeReproduccion(){
        int duracionTotal = 0;
        Cancion cancion= this.lista.primeraCancion();
        while (cancion != null){
            duracionTotal = duracionTotal + cancion.getDuracion();
            cancion = this.lista.siguienteCancion();
        }
        System.out.println("Duracion Total: "+duracionTotal);
    }
    
    public void activarRepoduccionAleatoria(){        
        Cancion cancion = this.lista.cancionAleatoria();            
        for (int i = 10; i > 0; i--){             
            reproducir(cancion);
            cancion = this.lista.cancionAleatoria();
        }                     
    }
    
    public void repetirLista(){        
        Cancion cancion = this.lista.primeraCancion();
        for (int i = 10; i >0; i--){            
            reproducir(cancion);
            cancion = this.lista.activarRepeticion();
        }
    }
    
     private void reproducir(Cancion cancion) {
        System.out.println(cancion.getNombre() + " - " + cancion.getDuracion());
    }
    
}
