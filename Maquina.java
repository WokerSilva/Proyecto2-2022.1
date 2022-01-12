// Clase Maquina 
// Modela el mecanismo de la maquina de juego con el patrón State

public class Maquina{

    // Variable privada de tipo estadoMaquina para saber en que estado nos encontramos
    private estadosMaquina estadoActual;
    // Variable de tipo estadosMaquina para el modo Espera
    private estadosMaquina modoEspera;
    // Variable de tipo estadosMaquina para el modo Apagado
    private estadosMaquina modoApagado;
    // Variable de tipo estadosMaquina para el modo Jugar
    private estadosMaquina modoJugar;
    // Variable de tipo estadosMaquina para el modo Jugar
    private estadosMaquina modoJugarDos;
    // Variable de tipo estadosMaquina para el modo Mostrar
    private estadosMaquina modoMostrar;

    // Contructor de la Maquina 
    //  iniciandola con :
    //                  Sin orden recibida
    //                  Objetos con los 4 estados de la maquina
    //                  Estado inicial: apagada
    public Maquina(){                
        modoEspera = new ModoEspera(this);
        modoApagado = new ModoApagado(this);
        modoJugar = new ModoJugar(this);
        modoJugarDos = new ModoJugarDos(this);
        modoMostrar = new ModoMostrar(this);

        estadoActual = modoApagado;
    }

    // Método que solo sirve para saber donde "estamos"
    // dentro de la ejecición 
    public void escuchaOrden(){
        System.out.println("Recibiendo orden...");
    }

    // Método para activar la maquina
    public void activar(){
        estadoActual.activar();
    }

    // Método para activar modo de juego
    public void jugar(){
        estadoActual.jugar();
    }

    // Método para activar el segundo modo de juego
    public void jugarDos(){
        estadoActual.jugarDos();
    }
    // Método para activar modo mostrar información
    public void mostrar(){
        estadoActual.mostrar();
    }

    // Método para apagar la maquina
    public void apagar(){
        estadoActual.apagar();
    }

    // Método para cambiar el estado en el que se encuentra la maquina
    public void nuevoEstado(estadosMaquina nuevoEstado){
        estadoActual = nuevoEstado;
    }

    /**
     * Método que obtiene el estado "ModoEspera"
     * @return estadosMaquina
     */
    public estadosMaquina getModoEspera(){
        return modoEspera;
    }

    /**
     * Método que obtiene el estado "ModoApagado"
     * @return estadosMaquina
     */
    public estadosMaquina getModoApagado(){
        return modoApagado;
    }

    /**
     * Método que obtiene el estado "ModoJugar"
     * @return estadosMaquina
     */
    public estadosMaquina getModoJugar(){
        return modoJugar;
    }

    /**
     * Método que obtiene el segundo estado "ModoJugar"
     * @return modoJugarDos
     */
    public estadosMaquina getModoJugarDos(){
        return modoJugarDos;
    }

    /**
     * Método que obtiene el estado "ModoMostrar"
     * @return estadosMaquina
     */
    public estadosMaquina getModoMostrar(){
        return modoMostrar;
    }    
}