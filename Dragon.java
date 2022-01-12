// Clase que moldea al personaje <Dragon>

public class Dragon implements Personaje{

    // Variables privadas para el personaje
    private String nombre;
    private int vida;
    private int ataque;

    // Metodo constructor    
    public Dragon(){
        nombre = "Dragon";
        vida = 190;
        ataque = 85;
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