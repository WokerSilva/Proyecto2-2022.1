public class PoderVikingo extends Poderes{

    public PoderVikingo(Personaje poder){
        super(poder);
    }
    
    public String nombre(){
        return poder.nombre() + "ahora es un Cheems Vikingo";
    }

    public int vida(){
        return poder.vida() + 20;
    }

    public int ataque(){
        return poder.ataque() + 90;
    }
}