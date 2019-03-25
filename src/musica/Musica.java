package musica;

public class Musica {

    public static void main(String[] args) {
        
        ReproductorMusical reproductor = new ReproductorMusical();
        
        Cancion moonchild = new Cancion("Moonchild", 340);
        Cancion theEvilThatMenDo = new Cancion("The Evil That Men Do", 275);
        Cancion runToTheHills = new Cancion ("Run to the Hills", 233);
        
        reproductor.agregarCancion(moonchild);
        reproductor.agregarCancion(theEvilThatMenDo);
        reproductor.agregarCancion(runToTheHills);
        
        //reproductor.agregarCanciones(theEvilThatMenDo, runToTheHills, moonchild);
        
        //reproductor.reproducir();
        //reproductor.duracionTotalDeReproduccion();
        reproductor.activarRepoduccionAleatoria();//Limitado a 10 reproducciones aleatorias para que no sea un loop infinito
        //reproductor.repetirLista();  //Tambien limitada la repeticion 
    }
    
}

