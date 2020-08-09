import java.util.ArrayList;

public class Libros {
	private int codigo;
	private String titulo;
	private String autor; 
	private int anioPubli;
	private String editorial; 
	private long isbn;
	private double precio;
	private double precioIva;
	private double descuento;
	private double precioTotal;
	
	public Libros(int codigo, String titulo, String autor, int anioPubli, String editorial, long isbn, double precio) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.anioPubli = anioPubli;
		this.editorial = editorial;
		this.isbn = isbn;
		this.precio = precio;
	}
	 
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnioPubli() {
		return anioPubli;
	}

	public void setAnioPubli(int anioPubli) {
		this.anioPubli = anioPubli;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPrecioIva() {
		return precioIva;
	}

	public void setPrecioIva(double precioIva) {
		this.precioIva = precioIva;
	}
	
	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}



	@Override
	public String toString() {
		return "Libros [CÓDIGO: " + codigo + "-- TÍTULO: " + titulo + "-- AUTOR: " + autor + "-- AÑO PUBLICACIÓN: " + anioPubli
				+ "-- EDITORIAL: " + editorial + "-- ISBN: " + isbn + "-- PRECIO SIN IVA: " + precio +"$" + "]";
	}
	
	
	
}
