// Clase que moldea al personaje <Spectre>

public class Spectre implements Personaje {

    // Variables privadas para el personaje
    private String nombre;
    private int vida;
    private int ataque;

    // Metodo constructor    
    public Spectre(){
        nombre = "Enemigo desconocido";
        vida = 210;
        ataque = 90;
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