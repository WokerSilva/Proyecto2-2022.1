public class ModoJugar implements estadosMaquina{

    Maquina coin;

    public ModoJugar(Maquina coin){
        this.coin = coin;
    }

    public void activar() {
        System.out.println("***MODO JUGAR***\n Ya esta activa.");        
    }
    
    public void mostrar() {
        System.out.println("***MODO JUGAR***\n Informacion mostrada ");        
    }
    
    public void jugar() {
        coin.escuchaOrden();
		coin.nuevoEstado(coin.getModoJugar());
        System.out.println("***MODO JUGAR***\n Iniciando juego...");                        
    }

    public void jugarDos(){
        System.out.println("***Jugando Juego Uno***\n Pulse Activar");        
    }
    
    public void apagar() {
        coin.escuchaOrden();
		coin.nuevoEstado(coin.getModoApagado());
        System.out.println("***MODO JUGAR***\n Cerrando programa, vuelva a pulsar en apagar.");        
    }    
}