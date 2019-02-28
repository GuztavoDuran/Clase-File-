
package file;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class File {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DemostracionFile aplicacion = new DemostracionFile();
        
        System.out.println("Escriba aqui la direccion del directorio: ");
        aplicacion.analizarRuta(entrada.nextLine());
    }
    
}
