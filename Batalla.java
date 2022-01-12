import java.io.BufferedReader; // Lectura 
import java.io.FileReader;     // Lectura 
import java.io.IOException;    // Errores en Lectura
// import java.util.Scanner;      // Escaner para el ususario

public class Batalla{

    public void muestraCheems(){
        try{
            FileReader fr = new FileReader("Cheems.txt");
            BufferedReader br1 = new BufferedReader(fr);
            String catalogo;

            while((catalogo = br1.readLine())!= null){
                System.out.print(catalogo + "\n");
            }
    
        }catch(IOException e){
            e.getCause();
        }
    }
}