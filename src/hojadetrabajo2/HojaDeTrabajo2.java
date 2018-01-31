package hojadetrabajo2;

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
        // el arreglo args contiene uno o mas archivos validos para leer
        if(args.length > 0)
        {
            for(String file : args)
            {
                // leer archivo de texto, posicionar cada linea del archivo en una celda
                // de un arreglo
                List<String> lineas = leerArchivoDeTexto(file);
                if(lineas == null)
                {
                    System.out.println("No se encontro el archivo " + file);
                    return;
                }

                // instanciar calculadora
                CalculadoraI calcu = new ImplementacionCalculadora();
                for(String linea : lineas)
                    System.out.println("Resultado de: " + linea + " -> " +calcu.calcular(linea));
            }
        }
        // leer el archivo src/datos.txt
        else
        {
            // leer archivo de texto, posicionar cada linea del archivo en una celda
            // de un arreglo
            String path = "src/datos.txt";
            List<String> lineas = leerArchivoDeTexto(path);
            if(lineas == null)
            {
                System.out.println("No se encontro el archivo datos.txt.");
                return;
            }
        
            // instanciar calculadora
            CalculadoraI calcu = new ImplementacionCalculadora();
            for(String linea : lineas)
                System.out.println("Resultado de: " + linea + " -> " +calcu.calcular(linea));
        }
    }
    
    /**
     * Devuelve una lista que contiene cada linea del archivo de texto ubicado
     * en path.
     * @param path la ubicacion del archivo de texto para leer
     * @return lista que contiene las lineas del archivo.
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
