public class ModoJugarDos implements estadosMaquina{

    Maquina coin;

    public ModoJugarDos(Maquina coin){
        this.coin = coin;
    }

    public void activar() {
        System.out.println("***MODO JUGAR***\n Ya esta activa.");        
    }
    
    public void mostrar() {
        System.out.println("***MODO JUGAR***\n Informacion mostrada ");
        
    }
    
    public void jugar() {
        System.out.println("***Jugando Juego Dos***\n Pulse Activar");        
    }

    public void jugarDos(){
        coin.escuchaOrden();
		coin.nuevoEstado(coin.getModoJugarDos());
        System.out.println("***MODO JUGAR***\n Iniciando juego...");                                
    }
    
    public void apagar() {
        coin.escuchaOrden();
		coin.nuevoEstado(coin.getModoApagado());
        System.out.println("***MODO JUGAR***\n Cerrando programa, vuelva a pulsar en apagar.");        
    }    

}
