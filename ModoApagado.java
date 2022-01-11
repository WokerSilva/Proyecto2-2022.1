public class ModoApagado implements estadosMaquina{
    
    Maquina coin;

    public ModoApagado(Maquina coin){
        this.coin = coin;
    }
    
    public void activar() {
        System.out.println("***MAQUINA APAGADA***\n");
        coin.escuchaOrden();
		coin.nuevoEstado(coin.getModoEspera());
        System.out.println("*** C A R G A N D O...***\n");
        System.out.println("***MAQUINA Encendida***\n");
    }
    
    public void mostrar() {
        System.out.println("***Maquina Apagada***\n No se puede mostrar ");
        
    }
    
    public void jugar() {
        System.out.println("***Maquina Apagada***\n No se puede jugar");
        
    }
    
    public void apagar() {
        System.out.println("***Maquina Apagada***\n Ya estoy apagada");
        
    } 
}