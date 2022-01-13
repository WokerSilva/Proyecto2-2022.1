import java.util.Scanner;     // Escaner para el ususario

public class Batalla{
    Batalla batt;
    Personaje cheems = new CheemsHeroe();
    Personaje mago = new Mago();
    Personaje dragon = new Dragon();
    Personaje spectre = new Spectre();
    PersonajesProxy enemigo = new PersonajesProxy();
    

    public void batallaCheems(){        
        
        System.out.println("/////////////////////////////////////////////////");
        System.out.println("////////////// DUELO DE DESTINOS ////////////////");
        System.out.println("/////////////////////////////////////////////////\n");
        
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
    }

    public void muestaHabilidad(){
        System.out.println("----------------------------------------------------------------------------------\n");
        System.out.println( cheems.nombre() + "   Ahora tiene : vida " + cheems.vida() + 
                                                        "   ataque   " + cheems.ataque());

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");        
    }

    public void eligeEnemigos(){
        Scanner sc = new Scanner(System.in);
        int evil = 0;         

        System.out.println("Elige que enemigo combatir\n" + 
                            "[1] Dragon \n" +
                            "[2] Mago \n" +
                            "[3] Spectre");
        while (true){
            try {
                String opcionUsuario = sc.nextLine();
                evil = Integer.parseInt(opcionUsuario);

            }catch(NumberFormatException ex){
                    System.out.println("Elige que enemigo combatir !\n" + 
                                    "[1] Dragon \n " +
                                    "[2] Mago \n" +
                                    "[3] Spectre");
            }            
            switch(evil){
                case 1:
                    System.out.println("-------------------------------------------------------------------------\n");
                    enemigo.muestraDragon();                
                    this.bDragon();            
                break;
                case 2:
                    System.out.println("-------------------------------------------------------------------------\n");
                    enemigo.muestraMago();
                    this.bMago();                
                break;
                case 3:
                    System.out.println("-------------------------------------------------------------------------\n");
                    enemigo.muestraSpectre();
                    this.bSpectre();                
                break;

                default:
                break;
            }
            break;
        }        
    }
    
    public void bDragon(){
        int vidaChemms = cheems.vida() - dragon.ataque();
        if(vidaChemms > 0){
            System.out.println("Cheems ha sido debilitado [" + vidaChemms + "]\n"+
                                "Esta historia continuará");
        }else{
            System.out.println("Gana el mounstro");
        } 
        enemigo.muestraCheems();
    }

    public void bMago(){
        int vidaChemms = cheems.vida() - mago.ataque();
        if(vidaChemms > 0){
            System.out.println("Cheems ha sido debilitado [" + vidaChemms + "]\n"+
                                "Esta historia continuará");
        }else{
            System.out.println("Gana el mounstro");
        } 
        enemigo.muestraCheems();
    }

    public void bSpectre(){

        int vidaChemms = cheems.vida() - spectre.ataque();
        if(vidaChemms > 0){
            System.out.println("Cheems ha sido debilitado [" + vidaChemms + "]\n"+
                                "Esta historia continuará");
        }else{
            System.out.println("Gana el mounstro");
        } 
        enemigo.muestraCheems();
    }
}