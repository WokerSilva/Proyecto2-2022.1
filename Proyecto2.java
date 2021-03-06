import java.util.Scanner;

public class Proyecto2{
    public static void main(String[] args){
        Maquina player = new Maquina();
		Batalla verCheems = new Batalla();

        CapituloUno chapterUno = new CapituloUno();
		CapituloDos chapterDos = new CapituloDos();

        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("           ** * * B I E N V E N I D O * * **  "
						+ "\n Para comenzar su aventura active la maquina\n"+
							  "[1] Activar Maquina\n" + 
							  "[2] Apagar Maquina \n" );
		
		while (true){
			try {
			String inicioMaquina = sc.nextLine();
			opcion = Integer.parseInt(inicioMaquina);

			if(opcion == 1){
				player.activar();
				do{
					System.out.println(
					"--------------------------------------" +	
					"\n Maquina de juegos Tuckrsoft\n" +
					"| 1.- Activar Maquina     |\n" +
					"| 2.- Reglas              |\n" + 
					"| 3.- Jugar bandersnatch  |\n" +
					"| 4.- Jugar Cheems Heroe  |\n" + 								 					
					"| 0.- Apagar              |\n" +
					"|-------------------------|\n");
				
					while (true){
						try {
							String opcionUsuario = sc.nextLine();
							opcion = Integer.parseInt(opcionUsuario);
							break;
						}catch (NumberFormatException ex){
							System.out.println("Por favor selecciona la opcion valida "
								+ "que deseas ejecutar.\n" + 
								"--------------------------------------" +	
								"\n Maquina de juegos Tuckrsoft\n" +
								"| 1.- Activar            |\n" +
								"| 2.- Reglas             |\n" + 
								"| 3.- Jugar bandersnatch |\n" +
								"| 4.- Jugar Cheems Heroe |\n" +
								"| 0.- Apagar             |\n" +
								"|------------------------|\n");
						}
					}
					
					switch(opcion){
						case 1:
							player.activar();
							break;
	
						case 2:
							player.mostrar();
							break;
	
						case 3:							
							player.jugar();
							chapterDos.mostrarHistorias();
							chapterUno.mostrarHistorias();							
							break;						
						
						case 4:							
							player.jugarDos();
							verCheems.batallaCheems();
							verCheems.muestaHabilidad();
							verCheems.eligeEnemigos();
							//verCheems.bMago();							
							break;
						case 0:
							break;
	
						default:
							System.out.println("\nPor favor elige la opcion que deseas ejecutar.");
							break;
					}

				}while(opcion != 0);		
			break;
			}else if (opcion == 2){
				player.apagar();				
			}else{
				System.out.println("\n Hasta pronto!");
			}     
		sc.close();
		break;                                
    	}catch(NumberFormatException ex)
            { 
            System.out.println("Use solo numeros, por favor.");
            }
    	}
	}
}