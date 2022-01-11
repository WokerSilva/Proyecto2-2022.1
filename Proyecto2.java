import java.util.Scanner;

public class Proyecto2{
    public static void main(String[] args){
        Maquina player = new Maquina();

        CapituloUno chapterUno = new CapituloUno();

        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("***BIENVENIDO al Acade.***"
						+ "\nPor favor selecciona la opcion que deseas ejecutar.");
        do{
            System.out.println(
				"\n Maquina de juegos Tukesfor\n" +
				"| 1.- Activar            |\n" +
				"| 2.- Reglas             |\n" + 
				"| 3.- Jugar              |\n" + 
				"| 4.- Apagar             |\n" +
				"| 0.- Salir              |\n" +
				"|------------------------|\n");
            
                while (true){
					try {
						String opcionUsuario = sc.nextLine();
						opcion = Integer.parseInt(opcionUsuario);
						break;
					}catch (NumberFormatException ex){
						System.out.println("Por favor selecciona la opcion valida"
							+ "que deseas ejecutar.\n" + 
							"\n Maquina de juegos Tukesfor\n" +
							"| 1.- Activar            |\n" +
							"| 2.- Reglas             |\n" + 
							"| 3.- Jugar              |\n" + 
							"| 4.- Apagar             |\n" +
							"| 0.- Salir              |\n" +
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
                        chapterUno.mostrarHistorias();
						break;

					case 4:
                        player.apagar();
						break;					

					case 0:
						break;

					default:
						System.out.println("\nPor favor elige la opcion que deseas ejecutar.");
						break;

				}

        }while(opcion != 0);        
        sc.close();
    }
}