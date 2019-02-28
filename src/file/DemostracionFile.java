package file;
import java.io.File;
/**
 * @author Gustavo
 */
public class DemostracionFile {
    public  void analizarRuta(String ruta) {
        File nombre = new File(ruta);
        if(nombre.exists()){
            System.out.printf(
            "%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
            nombre.getName(), " existe ",
            ( nombre.isFile() ? " es un archivo " : " no es un archivo "),
            ( nombre.isDirectory() ? " es un directorio " : " no es un directorio "),
            ( nombre.isAbsolute() ? " es una ruta absoluta " : "No es una ruta absoluta "),
            " Ultima modificacion: ",
            nombre.lastModified(), " Tamanio: ", nombre.length(),
            " Ruta: ", nombre.getPath(), " Ruta absoluta: ",
            nombre.getAbsolutePath(), " Padre: ", nombre.getParent());
            
            if(nombre.isDirectory()){
                String directorio[] = nombre.list();
                System.out.println("\n\n Contenido del directorio: \n");
                
                for(String nombreDirectorio : directorio)
                    System.out.printf("%s\n",nombreDirectorio);
            }//fin de else       
        }else{
            System.out.printf("&s %s",ruta, " No existe");
        }//fin de else
    }//fin del metodo analizar ruta
}//fin de la clase DemostarcionFile 