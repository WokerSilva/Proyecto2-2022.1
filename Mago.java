// Clase que moldea al personaje <Mago>

public class Mago implements Personaje {

    // Variables privadas para el personaje
    private String nombre;
    private int vida;
    private int ataque;

    // Metodo constructor    
    public Mago(){
        nombre = "Mago de las montañas";
        vida = 110;
        ataque = 130;
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