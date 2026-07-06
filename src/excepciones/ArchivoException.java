/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

// errores relacionacionados con archivos
public class ArchivoException extends Exception {
    
    // evia solo el mensaje
    public ArchivoException(String mensaje) {
        super (mensaje);
        
    }
    
    // evia el mensaje y guarda la causa del error
    public ArchivoException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
    
}
