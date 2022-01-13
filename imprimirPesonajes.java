import java.io.BufferedReader; // Lectura 
import java.io.FileReader;     // Lectura 
import java.io.IOException;    // Errores en Lectura

public class imprimirPesonajes implements verPersonajes{
    
    public void muestraDragon(){
        try{
            FileReader fr = new FileReader("dragon.txt");
            BufferedReader dragon = new BufferedReader(fr);
            String catalogo;

            while((catalogo = dragon.readLine())!= null){
                System.out.print(catalogo + "\n");
            }
            dragon.close();
        }catch(IOException e){
            e.getCause();
        }                
    }

    public void muestraSpectre(){
        try{
            FileReader fr = new FileReader("spectre.txt");
            BufferedReader spectre = new BufferedReader(fr);
            String catalogo;

            while((catalogo = spectre.readLine())!= null){
                System.out.print(catalogo + "\n");
            }
            spectre.close();
        }catch(IOException e){
            e.getCause();
        }        
    }

    public void muestraMago(){
        try{
            FileReader fr = new FileReader("mago.txt");
            BufferedReader mago = new BufferedReader(fr);
            String catalogo;

            while((catalogo = mago.readLine())!= null){
                System.out.print(catalogo + "\n");
            }
            mago.close();
        }catch(IOException e){
            e.getCause();
        }
    }


    public void muestraCheems(){
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