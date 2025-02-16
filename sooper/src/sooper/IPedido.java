package sooper;

import java.util.*;

public interface IPedido {
	String getReferencia();//referencia del pedido
	Set<productos.IProducto> getProductos();//conjunto de productos de ese pedido
	Set<contenedores.IContenedor> getContenedores();//conjunto de contenedores de ese pedido
	
	void addContenedor(contenedores.IContenedor contenedor); //si necesito añadir mas bolsas o cajas (contenedor) a mi pedido
	contenedores.IContenedor addProducto(productos.IProducto producto); //me devuelve el contenedor en el cual coloca el producto, pero me podria devolver tambien su referencia como un string
	
}
