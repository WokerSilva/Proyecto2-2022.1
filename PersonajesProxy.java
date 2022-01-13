import java.io.BufferedReader; // Lectura 
import java.io.FileReader;     // Lectura 
import java.io.IOException;    // Errores en Lectura

public class PersonajesProxy implements verPersonajes{

    Personaje dragon = new Dragon();
    Personaje mago = new Mago();
    Personaje spectre = new Spectre();
    
    public void muestraDragon(){            
        System.out.println("El "+ dragon.nombre() + " es un temible vendablal de fuego\n" +
        "Textos antiguos le dice a Cheems que posee: vida  " + dragon.vida() + " y un ataque de " + dragon.ataque());

        try{
            FileReader fr = new FileReader("dragon.txt");
            BufferedReader Bdragon = new BufferedReader(fr);
            String catalogo;            

            while((catalogo = Bdragon.readLine())!= null){
                System.out.print(catalogo + "\n");
            }
            Bdragon.close();            
        }catch(IOException e){
            e.getCause();
        }                
    }

    public void muestraSpectre(){        
        System.out.println(spectre.nombre() + " no hay muchos datos sobre este peligro \n" +
        "Informacion intercepatada por Cheems dice contar con: vida  " + spectre.vida() + " y un ataque de  " + spectre.ataque());

        try{
            FileReader fr = new FileReader("spectre.txt");
            BufferedReader Bspectre = new BufferedReader(fr);
            String catalogo;

            while((catalogo = Bspectre.readLine())!= null){
                System.out.print(catalogo + "\n");
            }
            Bspectre.close();
        }catch(IOException e){
            e.getCause();
        }        
    }

    public void muestraMago(){        
        System.out.println("El "+ ((Personaje) mago).nombre() + " es un enemigo muy conocido de la tierra media\n" +
        "Este viejo conocido de Cheems posee: vida  " + ((Personaje) mago).vida() + " y un ataque de  " + ((Personaje) mago).ataque());

        try{
            FileReader fr = new FileReader("mago.txt");
            BufferedReader Bmago = new BufferedReader(fr);
            String catalogo;

            while((catalogo = Bmago.readLine())!= null){
                System.out.print(catalogo + "\n");
            }
            Bmago.close();
        }catch(IOException e){
            e.getCause();
        }
    }

    public void muestraCheems(){
        System.out.println("Cheems necesitará tu ayuda....");
        try{
            FileReader fr = new FileReader("Cheems.txt");
            BufferedReader cheem = new BufferedReader(fr);
            String catalogo;

            while((catalogo = cheem.readLine())!= null){
                System.out.print(catalogo + "\n");
            }
            cheem.close();
        }catch(IOException e){
            e.getCause();
        }
    }    
}