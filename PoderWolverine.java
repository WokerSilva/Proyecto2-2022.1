public class PoderWolverine extends Poderes{

    public PoderWolverine(Personaje poder){
        super(poder);
    }
    
    public String nombre(){
        return poder.nombre() + "ahora es un Cheems X-men";
    }

    public int vida(){
        return poder.vida() + 100;
    }

    public int ataque(){
        return poder.ataque() + 15;
    }
}