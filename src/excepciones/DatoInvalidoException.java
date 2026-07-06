/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;


// controla datos invalidos como null, numeros menores a 0

// excepcion personalizada, hereda de Exception
public class DatoInvalidoException extends Exception{
    // el constructor recibe un mensaje de error
    public DatoInvalidoException(String mensaje) {
        super (mensaje); // envia el error a la clase Exception
    }
    
}
