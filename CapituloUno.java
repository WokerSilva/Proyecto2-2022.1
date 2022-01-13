import java.util.Scanner;
public class CapituloUno implements Historia{

    @Override
    public void mostrarHistorias() {

        System.out.println("----------------------------------------------------------------------------------\n");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("\n \n Capitulo: El inicio \n  ... 20 Dec 22");
        System.out.println("----------------------------------------------------------------------------------\n");
        Scanner sc = new Scanner(System.in);
        int sw;
		int opcion;

        System.out.println("----------------------------------------------------------------------------------\n");
        System.out.println("Eres un investigador bioquímico. Actualmente trabajas en una" + 
                            "mutación para curar la ceguera \n");
        System.out.println("Llegas al laboratorio ¿Qué es lo primero que haces?\n");
        System.out.println("----------------------------------------------------------------------------------\n");
        // Para repetir el menú si se da otra opción
        while (true){
            try {
            
                System.out.println("Elige entre 1 o 2 para seguir con el juego ");                                
                System.out.println("[1] Preparas tu café\n"+
                                   "[2] Activas protocolos de seguridad\n" +
                                   "[ ] Otro número para salir del capitulo\n");

                String opcionUsuario = sc.nextLine();
                sw = Integer.parseInt(opcionUsuario);

                switch(sw){
                    // PRIMERA SECUENCIA 
                    case 1:
                        System.out.println("Mientras bebes tu café lees los informes" + 
                                           "y recuerdas que debías cambiar algunos filtros\n");

                        
                        System.out.println("[1] Los filtros pueden esperar\n"+
                                           "[2] Sales por ellos al cuarto de mantenimiento\n");

                        String opcionUsuario2 = sc.nextLine();
                        opcion = Integer.parseInt(opcionUsuario2);
                        // SEGUNDA SECUENCIA
                        if(opcion == 1){
                            System.out.println("Comienzas a manipular las encimas y tienes una" + 
                                               "corazonada al combinar un par");
                            System.out.println("[1] Las combino\n"+
                                               "[2] No las combino y sigo con las notas\n");   

                            String opcionUsuari2 = sc.nextLine();
                            opcion = Integer.parseInt(opcionUsuari2);
                            // TERCERA SECUENCIA
                            if(opcion == 1){
                                System.out.println("Al combinarlas se produce una neblina toxica, los "+
                                                   "protocolos no están activos así se que sales a buscar ayuda\n" + 
                                                   "[F I N]");
                                break;
                            // TERCERA SECUENCIA
                            }else if(opcion == 2){
                                System.out.println("Recibes un mensaje que te llena de alegría "+
                                                   "y accidentalmente mueves la mesa con las encimas abiertas\n");
                                System.out.println("[1] Limpias por tu cuenta\n"+
                                                   "[2] Activas los protocolos de seguridad\n"); 
                                String opcionUsuar2 = sc.nextLine();
                                opcion = Integer.parseInt(opcionUsuar2);
                                // CUARTA SECUENCIA
                                if(opcion == 1){
                                    System.out.println("Terminas de limpiar sin las medidas "+
                                                       " de seguridad adecuadas y vas a casa\n");
                                    break;
                                // CUARTA SECUENCIA
                                }else if(opcion == 2){
                                    System.out.println("Los protocolos funcionan pero acabas de dar "+
                                                       " un sorbo al café que tenía encima\n");
                                    break;
                                }                                                                                   
                            }
                            
                        // SEGUNDA SECUENCIA                                               
                        }else if(opcion == 2){
                            System.out.println("Los protocolos no estaban activos, el cambio" + 
                                               "de temperatura hace estallar encimas peligrosas\n" +
                                               "[F I N]"); 
                        break;
                        }
                    break;
                    // PRIMERA SECUENCIA 
                    case 2:
                        System.out.println("Los protocolos están activos. Empiezas a leer" + 
                                           "los informes y recibes una llamada\n");

                        System.out.println("[1] Contestas la llamada\n"+
                                           "[2] No contestas la llamada\n");

                        String opcionUsuario3 = sc.nextLine();
                        opcion = Integer.parseInt(opcionUsuario3);
                        // SEGUNDA SECUENCIA 
                        if(opcion == 1){
                            System.out.println("Te avisan que el laboratorio de alado" + 
                                               "hubo una fuga química\n" + 
                                               "[F I N]");
                        break;
                        // SEGUNDA SECUENCIA 
                        }else if(opcion == 2){
                            System.out.println("Comienzas a trabajar con las encimas, obtienes una " + 
                                               "reacción prometedora y recuerdas que tienes " + 
                                               "un muy buen estabilizador esta en casa" );
                            System.out.println("[1] Dejas el tubo en el laboratorio \n"+
                                               "[2] Llevas el tubo a casa \n");
                            String opcionUsuari3 = sc.nextLine();
                            opcion = Integer.parseInt(opcionUsuari3);
                            // TERCERA SECUENCIA 
                            if(opcion == 1){
                                System.out.println("La reacción por la noche hizo una explosión "+ 
                                                  "comprometiendo gravemente el laboratorio\n" + 
                                                  "[F I N]");
                                break;
                            // TERCERA SECUENCIA 
                            }else if(opcion == 2){
                                System.out.println("Llegas a casa y empiezas el procedimiento para"+ 
                                                  "estabilizar la reacción, en eso llega  \n" + 
                                                  "tu gato pidiendo comida");
                                System.out.println("[1] No le das de comer \n"+
                                                   "[2] Le das de comer \n");
                                String opcionUsuar3 = sc.nextLine();
                                opcion = Integer.parseInt(opcionUsuar3);
                                // CUARTA SECUENCIA 
                                if(opcion == 1){
                                    System.out.println("El gato salta bruscamente a la  "+ 
                                                       "mesa tirando la encima sobre ti  \n" + 
                                                       "[F I N]");
                                    break;
                                // CUARTA SECUENCIA 
                                }else if(opcion == 2){
                                    System.out.println("Vuelves y la encima produjo un gas pequeño el cual has "+ 
                                                       "respirado no le das importancia y te vas a dormir \n" +
                                                       "20 Dec 22...");                                
                                }
                            }
                        }
                    break;
                    case 0: // Caso de Salida
                        System.out.println("Ha salido del capitulo");
                    break;                
                }

            break;                                
            }catch(NumberFormatException ex)
                { 
                System.out.println("Solo es valido los numeros. Eliga entre sus dos opciones (1 o 2)\n " +
                                   "Juego reiniciado\n \n");
                }
        }                
    }    
}