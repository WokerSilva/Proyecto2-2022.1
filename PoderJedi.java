public class PoderJedi extends Poderes{

    public PoderJedi(Personaje poder){
        super(poder);
    }
    
    public String nombre(){
        return poder.nombre() + "ahora es un Cheems Jedi";
    }

    public int vida(){
        return poder.vida() + 55;
    }

    public int ataque(){
        return poder.ataque() + 75;
    }
}