import java.util.ArrayList;

public class ProduLibroCD {
	
	//Método LIBROS
	
	public static void mostrar1(ArrayList<Libros> p ) {
		for(int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i));
		}
	}
	
	public static void PrecioIvaL(ArrayList<Libros> p ) {
		double precio;
		double iva;
		double precioIva;
		double descuento;
		double precioTotal;
		for(int i = 0; i < p.size(); i++) {
			precio = p.get(i).getPrecio();
			iva = precio*0.04;
			descuento = precio*0.2;
			precioTotal = precio + iva - descuento;
			precioIva = precio +iva;
			p.get(i).setPrecioIva(precioIva);
			p.get(i).setPrecioTotal(precioTotal);
			}
	}
	
	
	//MÉTODO CDs
	
	public static void mostrar2(ArrayList<CD> p ) {
		for(int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i));
		}
	}
	
	public static void PrecioIvaC(ArrayList<CD> p ) {
		double precio;
		double iva;
		double precioIva;
		double descuento;
		double precioTotal;
		for(int i = 0; i < p.size(); i++) {
			precio = p.get(i).getPrecio();
			iva = precio*0.09;
			precioIva = precio +iva;
			p.get(i).setPrecioIva(precioIva);
			descuento = precio*0.1;
			precioTotal = precio + iva - descuento;
			p.get(i).setPrecioTotal(precioTotal);
			
			
			}
	}
	
	public static void main(String[] args) {
		
		
		ArrayList<Libros> lib = new ArrayList<Libros>();
		System.out.println("-------------DATOS DE LIBROS Y CDs-------------\n");
		Libros lib1 = new Libros(12345, "El principito", " Antoine de Saint-Exupéry", 1943, "Reynal & Hitchcock (EUA)" , 987655655 , 20 );
		Libros lib2 = new Libros(54321, "La vuelta al mundo en 80 días", "Julio Verne", 1872, "Pierre-Jules Hetzel" , 789245874 , 45.50 );
		Libros lib3 = new Libros(89562, "El Alquimista", " Paulo Cohelo", 1988, "HarperCollins" , 1238465 , 33.99 );
		Libros lib4 = new Libros(78945, "Don Quijote de la Mancha", " Miguel de Cervantes", 1605, " Francisco de Robles" , 587497865 , 45 );
		
		lib.add(lib1);
		lib.add(lib2);
		lib.add(lib3);
		lib.add(lib4);
		
		
		
		ArrayList<CD> cd = new ArrayList<CD>();
		CD cd1 = new CD(69862, "Flamingos", "Enrique Bunbury", 2001, 35);
		CD cd2 = new CD(78958, "Vértigo", "Fey", 2002, 22);
		CD cd3 = new CD(12557, "Aló!", "Pedropiedra", 2020, 45);
		CD cd4 = new CD(12647, "Play", "Akmu", 2014, 62);
		
		cd.add(cd1);
		cd.add(cd2);
		cd.add(cd3);
		cd.add(cd4);
		
		mostrar1(lib);
		mostrar2(cd);
		
		
		
		PrecioIvaL(lib);
		System.out.println("\n------------PRECIO VENTA LIBROS--------------\n");
		System.out.println("Libro1 con iva: " + lib1.getPrecioIva() + "$" +  " - Descuento = Precio Venta: "  + lib1.getPrecioTotal() + "$" );
		System.out.println("Libro2 con iva: " + lib2.getPrecioIva()+ "$"+  " - Descuento = Precio Venta: "  + lib2.getPrecioTotal() + "$" );
		System.out.println("Libro3 con iva: " + lib3.getPrecioIva()+ "$"+  " - Descuento = Precio Venta: "  + lib3.getPrecioTotal() + "$" );
		System.out.println("Libro4 con iva: " + lib4.getPrecioIva()+ "$"+  " - Descuento = Precio Venta: "  + lib4.getPrecioTotal() + "$" );
		
		PrecioIvaC(cd);
		System.out.println("\n------------PRECIO VENTA DE CDs--------------\n");
		System.out.println("CD1 con iva: " + cd1.getPrecioIva()+ "$"+ " - Descuento = Precio Venta: " +  cd1.getPrecioTotal() + "$" );
		System.out.println("CD2 con iva: " + cd2.getPrecioIva()+ "$"+ " - Descuento = Precio Venta: " + cd2.getPrecioTotal()+ "$" );
		System.out.println("CD3 con iva: " + cd3.getPrecioIva()+ "$"+ " - Descuento = Precio Venta: " + cd3.getPrecioTotal() + "$" );
		System.out.println("CD4 con iva: " + cd4.getPrecioIva()+ "$"+ " - Descuento = Precio Venta: " + cd4.getPrecioTotal() + "$" );
		
		
		
	}
		
		
		
	
}


