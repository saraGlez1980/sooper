package productos;

public interface IProducto {
	String getReferencia(); //referencia del producto
	int getPeso(); //obtener peso del producto
	int getVolumen(); //obtener volumen del producto
	String getCategoria(); //obtener la categoria del producto
	
	boolean esCompatible(productos.IProducto producto); //para saber si es un producto que puede ir en el mismo contenedor
	boolean tengoEspacio(contenedores.IContenedor contenedor);//para saber si puedo meter en ese contenedor el producto 
	
	void meterProducto(contenedores.IContenedor contenedor); //para meter ese producto en un contenedor

}
