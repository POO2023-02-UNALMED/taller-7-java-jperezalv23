package comunicacion;

public class Periodico extends Escrito{
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen,String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor,paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
		
	}
	
	 public String interpretacion() {
		 return interpretacion;
		
	}
	 
	 public String toString() {
		 return super.getOrigen() + "\n" + super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n" + fecha + "\n" + primicia;
		 
	 }
	 
	 public int palabrasTotales(int palabrasPagina) {
		 return palabrasPagina * 10;
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
	 
	 public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	 
	 public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	 
	 public void setPrimicia(String primicia) {
		this.primicia = primicia;
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
	 
	 public String getFecha() {
		return fecha;
	}
	 
	 public String getInterpretacion() {
		return interpretacion;
	}
	 
	 public String getPrimicia() {
		return primicia;
	}

}
