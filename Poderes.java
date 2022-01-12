public class Poderes implements Personaje{

    protected Personaje poder;

    public Poderes(Personaje poder){
        this.poder = poder;
    }

    public String nombre() {
        return poder.nombre();
    }

    @Override
    public int vida() {
        return poder.vida();
    }

    @Override
    public int ataque() {        
        return poder.ataque();
    }    
}