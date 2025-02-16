package contenedores;

import java.util.*;

public interface IContenedor {
	String getReferencia();
	int getVolumen();
	int getVolumenDisponible();
	int getResistencia();
	String getTipo();
	Set<productos.IProducto> getProductos();
	
	boolean meter(productos.IProducto producto);
	boolean resiste(productos.IProducto producto);

}
