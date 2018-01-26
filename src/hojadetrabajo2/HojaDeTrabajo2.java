package hojadetrabajo2;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author Sebastian Arriola 11463
 * @author Fernando Figueroa 14175
 * @author Jose Andres Arenas 14470
 */
public class HojaDeTrabajo2 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // leer archivo de texto, posicionar cada linea del archivo en una celda
        // de un arreglo
        String path = "D:\\UVG\\2018_S1\\Estructuras_Algoritmos\\S3_29ENE_2FEB\\HojaDeTrabajo2\\datos.txt";
        List<String> lineas = leerArchivoDeTexto(path);
        if(lineas == null)
        {
            System.out.println("Archivo nulo.");
            return;
        }
        
        // instanciar calculadora
        //CalculadoraI calcu = new 
    }
    
    /**
     * 
     * @param path
     * @return 
     */
    public static List<String> leerArchivoDeTexto(String path)
    {
        try
        {
            return Files.readAllLines(Paths.get(path), Charset.defaultCharset());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
}
