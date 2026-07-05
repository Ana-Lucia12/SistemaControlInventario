/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositorio;

import java.util.ArrayList;
import java.util.List;
import modelo.Producto;

public class ProductoRepositorio {
    // Lista privada llamada listaProductos, que solo puede guardar objetos Producto
    // se inicializa como un ArrayList vacio
    
    private List<Producto> listaProductos = new ArrayList<>();
    
    public void agregar(Producto producto) { // Este método recibe un producto y lo agrega a la lista de productos
        listaProductos.add(producto);  // void no devuelve nada, realiza la accion de agregar el producto
    }
    
    public List<Producto> listar() { // no se usa void porque el metodo si devuelve algo
        return listaProductos;
    }
    
    public Producto buscarPorCodigo(String codigo) {
        for (Producto producto : listaProductos) { 
            // Cada producto de la lista se guarda temporalmente
            // en la variable producto.
            if (producto.getCodigo().equalsIgnoreCase(codigo)) { // compara ignorando mayusc o minsc
                return producto;
            }
        }
        return null;
    } 
    
    public boolean existeCodigo(String codigo) {
        return buscarPorCodigo(codigo) != null; // devuelve verdadero si buscarPorCodigo no devuelve null
    }
    
    public void eliminar (String codigo) {
        Producto producto = buscarPorCodigo(codigo); //Si el código existe, producto tendrá el objeto encontrado sino sera null

        if(producto != null) {
            listaProductos.remove(producto);
        }
    }
    
    public void editar( Producto productoActualizado) {
        for (int i = 0; i < listaProductos.size(); i++) { // recorre la lista
            if (listaProductos.get(i).getCodigo().equalsIgnoreCase(productoActualizado.getCodigo())) {
                listaProductos.set(i, productoActualizado); // reemplazar el valor de la posicion i por el nuevo
                return;
            }
        }
    }
    
    public List<Producto> buscarPorNombreOCodigo(String texto) {
        List<Producto> resultados = new ArrayList<>();
        
        // Si el nombre contiene el texto buscado o el código contiene el texto buscado, entonces se agrega ese producto a los resultados.
        for (Producto producto : listaProductos) {
            if(producto.getNombre().toLowerCase().contains(texto.toLowerCase())
                || producto.getCodigo().toLowerCase().contains(texto.toLowerCase())) {
                resultados.add(producto);
            }
        }
        return resultados; // devuelve la lista con los resultados encontrados.
    }
    // recibe una categoria y develve los productos que pertenecen a ella
    public List<Producto> filtrarPorCategoria(String categoria) {
        List<Producto> resultados = new ArrayList<>();
        
        for (Producto producto : listaProductos) {
            if (producto.getCategoria().equalsIgnoreCase(categoria)) {
                resultados.add(producto);
            }
        }
        return resultados;
    }
    
}
