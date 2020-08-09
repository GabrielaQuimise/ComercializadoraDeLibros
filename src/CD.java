import java.util.ArrayList;

public class CD {
	private int codigo;
	private String titulo;
	private String interprete;
	private int anio;
	private double precio;
	private double precioIva;
	private double descuento;
	private double precioTotal;
	
	
	public CD(int codigo, String titulo, String interprete, int anio, double precio) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.interprete = interprete;
		this.anio = anio;
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


	public String getInterprete() {
		return interprete;
	}


	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}


	public int getAnio() {
		return anio;
	}


	public void setAnio(int anio) {
		this.anio = anio;
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
		return "CDs [C�DIGO: " + codigo + "-- T�TULO: " + titulo + "-- INT�RPRETE: " + interprete + "-- A�O PUBLICACI�N: " + anio
				+ "-- PRECIO SIN IVA = " + precio +"$" + "]";
	}
	
	
}
