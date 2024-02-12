package ventanas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
    File archivo;
    
    public void crearArchivo(){
        archivo = new File("AgendaContactos.txt");
        
        try {
            if(archivo.createNewFile()){    
            }
            } 
        catch (IOException ex) {
            System.err.println("Error, "+ex);
        }
    }
    
    public void escribirTexto(Persona persona){
        try {
            FileWriter escribir = new FileWriter(archivo,true);
            escribir.write(persona.getNombre()+"%"+persona.getCorreo()+"%"+persona.getCelular()+"\r\n");
            escribir.close();
        } catch (IOException ex) {
            System.err.println("Error, "+ex);
        }
        
    }
    
}
