public class ModoMostrar implements estadosMaquina{
    
    Maquina coin;

    public ModoMostrar(Maquina coin){
        this.coin = coin;
    }
    
    public void activar() {
        System.out.println("***Maquina Activa***\n Ya esta activada");
        
    }
    
    public void mostrar() {
        coin.escuchaOrden();
		coin.nuevoEstado(coin.getModoMostrar());
        System.out.println("***Maquina Activa***\n AQUI ESTAMOS MOSTRANDO INFORMACIÓN ");
        
    }
    
    public void jugar() {
        coin.escuchaOrden();
		coin.nuevoEstado(coin.getModoJugar());
        System.out.println("***Maquina Activa***\n Cargando... Listo.");
        
    }
    
    public void apagar() {
        System.out.println("***MODO APAGADO***\n ");
        
    }
}