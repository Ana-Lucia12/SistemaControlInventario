/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import excepciones.ArchivoException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import modelo.Producto;

public class ArchivoUtil {
    
    // Recibe una lista de productos y un archivo donde se va a guardar la información
    public static void exportarInventario(List<Producto> productos, File archivo)
            throws ArchivoException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            
            writer.write("ID,Código,Nombre,Categoría,Cantidad,Precio,Disponible");
            writer.newLine();
            
            for (Producto producto : productos) {
                writer.write(
                        producto.getId() + "," +
                        producto.getCodigo() + "," +
                        producto.getNombre() + "," +
                        producto.getCategoria() + "," +
                        producto.getCantidad() + "," +
                        producto.getPrecio() + "," +
                        producto.isDisponible() 
                );
                writer.newLine();
            }
            
        } catch (IOException e) {
            throw new ArchivoException("Error al exportar el inventario.", e);
        }
    }
}
