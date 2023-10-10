package comunicacion;

public class Libro extends Escrito {
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	public Libro(String origen,String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion) {
		super(origen, titulo, autor,paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
		
	}
	
	 public String interpretacion() {
		 return interpretacion;
		
	}
	 
	 public String toString() {
		 return super.getOrigen() + "\n" + super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n" + co_autor + "\n" + editorial + "\n" + edicion;
		 
	 }
	 
	 public int palabrasTotales(int palabrasPagina) {
		 return palabrasPagina * 2 * super.getPaginas();
	 }
	 
	 
	public void setAutor(String autor) {
		super.setAutor(autor);
	}
	 
	public void setOrigen(String origen) {
		super.setOrigen(origen);
	}
	 
	public void setPaginas(int paginas) {
		super.setPaginas(paginas);
	}
	 
	 
	public void setTitulo(String titulo) {
		super.setTitulo(titulo);
	}
	 public void setCo_autor(String co_autor) {
		this.co_autor = co_autor;
	}
	 public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	 public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	 public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	 
	public String getAutor() {
		return super.getAutor();
	}
	public String getOrigen() {
		return super.getOrigen();
	}
	public int getPaginas() {
		return super.getPaginas();
	}
	public String getTitulo() {
		return super.getTitulo();
	}
	public String getCo_autor() {
		return co_autor;
	}
	public String getEdicion() {
		return edicion;
	}
	public String getEditorial() {
		return editorial;
	}
	public String getInterpretacion() {
		return interpretacion;
	}

}
