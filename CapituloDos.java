import java.util.Scanner;
public class CapituloDos implements Historia{

    @Override
    public void mostrarHistorias() {
        
        System.out.println("\n \n Capitulo: Escape \n  ... 21 Dec 22");
        Scanner sc = new Scanner(System.in);
        int sw;
		int opcion;
        
        System.out.println("Te encuentras en tu salón de clases y entonces se escucha un ruido muy fuerte\n");
        // Para repetir el menú si se da otra opción
        while (true){
            try {
            
                System.out.println("Elige entre 1 o 2 para seguir con el juego ");                                
                System.out.println("[1] Sales al pasillo a ver que pasa \n"+
                                   "[2] Te quedas en el salón \n" +
                                   "[ ] Otro número para salir del capitulo\n");

                String opcionUsuario = sc.nextLine();
                sw = Integer.parseInt(opcionUsuario);

                switch(sw){
                    // PRIMERA SECUENCIA 
                    case 1:
                        System.out.println("Muchos están en el pasillo entonces " + 
                                           "observas por la ventana como corren de algo \n");
                        
                        System.out.println("[1] Desde el pasillo sales al patio principal \n"+
                                           "[2] Regresas por tu mochilas y te vas \n");

                        String opcionUsuario2 = sc.nextLine();
                        opcion = Integer.parseInt(opcionUsuario2);
                        // SEGUNDA SECUENCIA
                        if(opcion == 1){
                            System.out.println("Un grupo se esta atrincherando en la cafetería");
                            System.out.println("[1] Vas a la trinchera que esta repeliendo de buena forma a la orda\n"+
                                               "[2] Tus amigos te envían un mensaje: te esperan del otro lado" + 
                                               "    para irse en coche; vas con ellos\n");   

                            String opcionUsuari2 = sc.nextLine();
                            opcion = Integer.parseInt(opcionUsuari2);
                            // TERCERA SECUENCIA
                            if(opcion == 1){
                                System.out.println("Logras entrar y cuando esta bien sellada  "+
                                                   "alguien revela que fue mordido\n" + 
                                                   "[F I N]");
                                break;
                            // TERCERA SECUENCIA
                            }else if(opcion == 2){
                                System.out.println("Sales corriendo por el que crees es el camino más corto. "+
                                                   "Te derriba un infectado y alguien más te ayuda a quitártelo \n");
                                System.out.println("[1] Le das las gracias y le ofreces venir contigo y tus amigos\n"+
                                                   "[2] Le das las gracias y sales de ahí\n"); 
                                String opcionUsuar2 = sc.nextLine();
                                opcion = Integer.parseInt(opcionUsuar2);
                                // CUARTA SECUENCIA
                                if(opcion == 1){
                                    System.out.println("Continuara "+
                                                       "...\n");
                                    break;
                                // CUARTA SECUENCIA
                                }else if(opcion == 2){
                                    System.out.println("Continuara... "+
                                                       "... \n");
                                    break;
                                }                                                                                   
                            }
                            
                        // SEGUNDA SECUENCIA                                               
                        }else if(opcion == 2){
                            System.out.println("Alcanzas tu mochila pero un compañero " + 
                                               "infectado con un virus te a mordido\n" +
                                               "[F I N]"); 
                        break;
                        }

                    
                    // PRIMERA SECUENCIA 
                    case 2:
                        System.out.println("Escuchan por la ventana que todos corren ");

                        System.out.println("[1] Te asomas por la ventana también \n"+
                                           "[2] Envías un texto a tus amigos mientras sales del salón\n");

                        String opcionUsuario3 = sc.nextLine();
                        opcion = Integer.parseInt(opcionUsuario3);
                        // SEGUNDA SECUENCIA 
                        if(opcion == 1){
                            System.out.println("Un compañero infectado con un virus te a mordido FIN\n"+
                                               "[F I N]");
                        break;
                        // SEGUNDA SECUENCIA 
                        }else if(opcion == 2){
                            System.out.println("Te contestan y te están esperando del otro " + 
                                               " de lado de la escuela para irse en coche ");
                            System.out.println("[1] Les pides que se acerquen lo más que puedan \n"+
                                               "[2] Les dices que se vayan, tú iras a las trincheras \n");
                            String opcionUsuari3 = sc.nextLine();
                            opcion = Integer.parseInt(opcionUsuari3);
                            // TERCERA SECUENCIA 
                            if(opcion == 1){
                                System.out.println("Se acercan sin embargo una orda los alcanzó "+                                                   
                                                  "[F I N]");
                                break;
                            // TERCERA SECUENCIA 
                            }else if(opcion == 2){
                                System.out.println("Vas a una que se esta armando en el edificio más "+ 
                                                  "alto. Antes de pasar te piden\n" + 
                                                  "quedarte en una zona con más compañeros " +
                                                  "posiblemente infectados\n");

                                System.out.println("[1] No te gusta la idea así que vas a otra trinchera \n"+
                                                   "[2] Aceptas y te quedas junto a varios compañeros tal " + 
                                                   "    vez infectados \n");
                                String opcionUsuar3 = sc.nextLine();
                                opcion = Integer.parseInt(opcionUsuar3);
                                // CUARTA SECUENCIA 
                                if(opcion == 1){
                                    System.out.println("Te alcanza una orda  "+                                                         
                                                       "[F I N]");
                                    break;
                                // CUARTA SECUENCIA 
                                }else if(opcion == 2){
                                    System.out.println("Ninguno estaba infectado por lo que   "+ 
                                                       "pasan a los salones para hidratarse \n" + 
                                                       "\n \n " +
                                                       "Continuara...");
                                }
                            }
                        }
                    case 0: // Caso de Salida
                        System.out.println("Ha salido del capitulo");
                            break;                
                }

            break;                                
            }catch(NumberFormatException ex)
                { 
                System.out.println("Solo es valido los numeros. Eliga entre sus dos opciones (1 o 2) " +
                                   "Juego Reiniciado\n \n");
                }
        }                
    }       
}