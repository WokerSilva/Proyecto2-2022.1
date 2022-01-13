// Clase que moldea al personaje <Cheems Heroe>

public class CheemsHeroe implements Personaje {

    // Variables privadas para el personaje
    private String nombre;
    private int vida;
    private int ataque;

    // Metodo constructor    
    public CheemsHeroe(){
        nombre = "Cheems Heroe  ";
        vida = 200;
        ataque = 65;
    }
    
    public String nombre(){        
        return nombre;
    }
    
    public int vida(){        
        return vida;
    }
    
    public int ataque(){
        return ataque;
    }   
}