/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import excepciones.DatoInvalidoException;
import excepciones.ProductoDuplicadoException;
import java.util.List;
import modelo.Producto;
import repositorio.ProductoRepositorio;
import java.util.Stack;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Comparator;

public class ProductoNegocio {
// Negocio usa el repositorio para guardar, listar, buscar, editar y eliminar productos.
    
    private ProductoRepositorio repositorio = new ProductoRepositorio();
 
    // Registra las acciones realizadas en el sistema.
    private Stack<String> historial = new Stack<>();
    
    // metodos
    
    // validar y guardar
    public void agregarProducto(Producto producto)
        // este metodo lanza los errores a quien llame al metodo y los maneja con try/catch    
            throws DatoInvalidoException, ProductoDuplicadoException {
        validarProducto(producto);
        
        // lanza un nuevo error de producto duplicado
        if (repositorio.existeCodigo(producto.getCodigo())) {
            throw new ProductoDuplicadoException("Ya existe un producto con ese código.");    
        }
        // guarda el producto
        repositorio.agregar(producto);
        historial.push("Producto registrado: " + producto.getNombre());
    }
     // validaciones obligatorias del producto
    private void validarProducto(Producto producto) throws DatoInvalidoException {
        
        if (producto == null) {
            throw new DatoInvalidoException("El producto no puede ser nulo.");
        }
        
        if (producto.getCodigo() == null || producto.getCodigo().trim().isEmpty()) {
            throw new DatoInvalidoException("El código es obligatorio.");
        }
        
        if (producto.getNombre() == null || producto.getNombre().trim().isEmpty()) {
            throw new DatoInvalidoException("El nombre es obligatorio.");
        }
        
        if (producto.getNombre().trim().length() < 3 ) {
            throw new DatoInvalidoException("El nombre debe tener mínimo 3 caracteres.");
        }
        
        if (producto.getCantidad() < 0) {
            throw new DatoInvalidoException("La cantidad debe ser igual o mayor que 0.");
        }
        
        if (producto.getPrecio() <= 0) {
            throw new DatoInvalidoException("El precio debe ser mayor que cero.");
        }
        
        if (producto.getCategoria() == null || producto.getCategoria().trim().isEmpty()) {
            throw new DatoInvalidoException("La categoría es obligatoria.");
        }
        
        if (producto.getTipoProducto() == null || producto.getTipoProducto().trim().isEmpty()) {
            throw new DatoInvalidoException("Debe seleccionar el tipo de producto.");
        }
    }
    
    // devuelve los productos guardados en el repositorio
    public List<Producto> listarProductos() {
        return repositorio.listar();
    }
    
    // busca productos por nombre o codigo
    public List<Producto> buscarProductos(String texto) throws DatoInvalidoException {
        
        // si el texto es nulo o esta vacio
        if (texto == null || texto.trim().isEmpty()) {
            throw new DatoInvalidoException ("Debe ingresar un texto para buscar");
        }
        // si se escribe un texto, se busca el producto en el repositorio
        return repositorio.buscarPorNombreOCodigo(texto);
    }
    
    // filtra productos por categoria
    public List<Producto> filtrarPorCategoria(String categoria) throws DatoInvalidoException {
        
        if (categoria == null || categoria.trim().isEmpty()) {
            throw new DatoInvalidoException ("Debe seleccionar o ingresar una categoría.");
        }
        
        return repositorio.filtrarPorCategoria(categoria);
    }
    
    // Ordena por nombre
    public List<Producto> ordenarPorNombre() {
        List<Producto> productos = repositorio.listar();
        
        // ordena la lista de productos comparando los nombres
        Collections.sort(productos, Comparator.comparing(Producto::getNombre));
        
        return productos;
    }
    
    // Ordena por precio
    public List<Producto> ordenarPorPrecio() {
        List<Producto> productos = repositorio.listar();
        
        Collections.sort(productos, Comparator.comparingDouble(Producto::getPrecio));
        
        return productos;
    }
    
    // Ordena por cantidad
    public List<Producto> ordenarPorCantidad() {
        List<Producto> productos = repositorio.listar();
        
        Collections.sort(productos, Comparator.comparingInt(Producto::getCantidad));
        
        return productos;
    }
    
    // Elimina un producto por codigo
    public void eliminarProducto(String codigo) throws DatoInvalidoException {
        
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new DatoInvalidoException("Debe seleccionar un producto para eliminar.");
        }
        
        Producto producto = repositorio.buscarPorCodigo(codigo);
        
        // si no hay producto con ese codigo lanza error
        if (producto == null) {
            throw new DatoInvalidoException("No existe un producto con ese código.");
        }
        repositorio.eliminar(codigo);
        historial.push("Producto eliminado: " + producto.getNombre());
    }
    // edita un producto
    public void editarProducto(Producto producto) throws DatoInvalidoException {
        
        validarProducto(producto);
        
        if (!repositorio.existeCodigo(producto.getCodigo())) {
            throw new DatoInvalidoException("No existe un producto con ese código para editar.");        
        }
        repositorio.editar(producto);
        historial.push("Producto editado: " + producto.getNombre());
    }
    
    public Stack<String> obtenerHistorial() {
        return historial;
    }
    
        public void registrarExportacion() {
        historial.push("Inventario exportado correctamente.");
    }
    
        // Contar los productos
    public Map<String, Integer> contarProductosPorCategoria() {
        Map<String, Integer> conteo = new HashMap<>();
        
        for (Producto producto : repositorio.listar()) {
            String categoria = producto.getCategoria();
            
// guarda la categoria en el mapa, si ya existe el contador aumenta el contador en 1, sino existe empieza desde 0 y suma 1
            conteo.put(categoria, conteo.getOrDefault(categoria, 0) + 1);
        }
        
        return conteo;
    }
    
    // cantidad total de productos registrados
    public int obtenerCantidadTotalProductos() {
        return repositorio.listar().size();
    }
    
    // contar los productos disponibles
    public int obtenerCantidadProductosDisponibles() {
        int contador = 0;
        
        for (Producto producto : repositorio.listar()) {
            if (producto.isDisponible()) {
                contador++;
            }
        }
        
        return contador;
    }
    
    // contar los productos no disponibles
    public int obtenerCantidadProductosNoDisponibles() {
        int contador = 0;
        
        for (Producto producto : repositorio.listar()) {
            if (!producto.isDisponible()) {
                contador++;
            }
        }
        
        return contador;
    }
    
    // suma las unidades almacenadas
    public int obtenerCantidadUnidadesAlmacenadas() {
        int total = 0;
        
        for (Producto producto : repositorio.listar()) {
            total += producto.getCantidad();
        }
        return total;
    }
    
    // Producto con mayor precio
    public Producto obtenerProductoMayorPrecio() {
        if (repositorio.listar().isEmpty()) {
            return null;
        }
        
        Producto mayor = repositorio.listar().get(0);
        
        for (Producto producto : repositorio.listar()) {
            if (producto.getPrecio() > mayor.getPrecio()) {
                mayor = producto;
            }
        }
        
        return mayor;
    }
    
    // Producto con menor precio
    public Producto obtenerProductoMenorPrecio() {
        if (repositorio.listar().isEmpty()) {
            return null;
        }
        
        Producto menor = repositorio.listar().get(0);
        
        for (Producto producto : repositorio.listar()) {
            if (producto.getPrecio() < menor.getPrecio()) {
                menor = producto;
            }
        }
        
        return menor;
    }
    
    // valor total del inventario
    public double calcularValorTotalInventario() {
        double total = 0;
        
        for (Producto producto : repositorio.listar()) {
            total += producto.getCantidad() * producto.getPrecio();
        }
        
        return total;
    }
    

}
