// Interfaz para el patrón State 
// Modela los estados de la Maquina de Juego

public interface estadosMaquina {
    // Modela el comportamiento de activación de la maquina 
    public void activar();
    // Modela el comportamiento de mostrar info de la maquina
    public void mostrar();
    // Modela el comportamiento de jugar dentro de la maquina
    public void jugar();
    // Modela el comportamiento de jugar dentro de la maquina
    public void jugarDos();
    // Modela el comportamiento de apagar la maquina
    public void apagar();
}