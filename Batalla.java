import java.util.Scanner;     // Escaner para el ususario

public class Batalla{

    Personaje cheems = new CheemsHeroe();
    Personaje mago = new Mago();
    PersonajesProxy enemigo = new PersonajesProxy();

    public void batallaCheems(){
        
        System.out.println("/////////////////////////////////////////////////");
        System.out.println("////////////// DUELO DE DESTINOS ////////////////");
        System.out.println("/////////////////////////////////////////////////\n");
        while (true){
			try {
            Scanner sc = new Scanner(System.in);
            int opcion;                                
			
            System.out.println( cheems.nombre() + " comienza así: vida  " + cheems.vida() + 
                                                            "   ataque  " + cheems.ataque());
			System.out.println("**********\n" + 
			                "\nEs momento de escoger el camino de Cheems para defender al valle.\n" +
                            "[1] Poder Jedi\n" +
                            "[2] Poder Vikingo\n" +
                            "[3] Porder Wolverine\n \n" +
                            "[0] Salir del juego");

				while (true){
					try {
						String opcionUsuario = sc.nextLine();
						opcion = Integer.parseInt(opcionUsuario);
						break;
					}catch (NumberFormatException ex){
							System.out.println("*****DUELO DE DESTINOS***** Seleccione una opcion valida\n" + 
			                        "\nEs momento de saber que camino tomara Cheems para defender al valle.\n" +
                                    "[1] Poder Jedi\n" +
                                    "[2] Poder Vikingo\n" + 
                                    "[3] Porder Wolverine\n \n" + 
                                    "[0] Salir del juego");
						}
					}
                                    					
					switch(opcion){
						case 1:
							cheems = new PoderJedi(cheems);
							break;
	
						case 2:
                            cheems = new PoderVikingo(cheems);
							break;
	
						case 3:							
							cheems = new PoderWolverine(cheems);
							break;						
						
						case 0:
							break;
	
						default:
							System.out.println("\nPor favor elige la opcion que deseas ejecutar.");
							break;
					}

        System.out.println("----------------------------------------------------------------------------------\n");
        System.out.println( cheems.nombre() + "   Ahora tiene : vida " + cheems.vida() + 
                                                        "   ataque   " + cheems.ataque());


        int vidaChemms = cheems.vida() - mago.ataque();

        System.out.println(vidaChemms);


        System.out.println("----------------------------------------------------------------------------------\n");
        enemigo.muestraDragon();
        System.out.println("----------------------------------------------------------------------------------\n");
        enemigo.muestraMago();
        System.out.println("----------------------------------------------------------------------------------\n");
        enemigo.muestraSpectre();






        break;
    	}catch(NumberFormatException ex)
            { 
            System.out.println("Use solo numeros, por favor.");
            }
    	}                                                                            
    }
}