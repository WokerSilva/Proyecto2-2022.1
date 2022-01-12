public class ModoEspera implements estadosMaquina{

    Maquina coin;

    public ModoEspera(Maquina coin){
        this.coin = coin;
    }

    public void activar() {
        System.out.println("***MODO SUSPENDIDO***\n Maquina Tuk ha sido activada.");        
    }
    
    public void mostrar() {        
        coin.escuchaOrden();
        coin.nuevoEstado(coin.getModoMostrar());
        System.out.println("*** Esperando ***\n Cargando... vuelve a presionar");
    }

    
    public void jugar() {
        coin.escuchaOrden();
        coin.nuevoEstado(coin.getModoJugar());        
        System.out.println("***MODO JUGAR***\n Listo, el juego ha comenzado");
    }

    
    public void apagar() {
        coin.escuchaOrden();
        coin.nuevoEstado(coin.getModoApagado());        
        System.out.println("***Maquina esperando intrucción ***\n Apagando maquina");
    }
    
}