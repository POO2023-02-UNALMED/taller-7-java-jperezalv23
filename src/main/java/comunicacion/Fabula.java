package comunicacion;

public class Fabula extends Escrito{
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen,String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor,paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	 public String interpretacion() {
		 return interpretacion;
		
	}
	 
	 public String toString() {
		 return super.getOrigen() + "\n" + super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n" + ensenanza;
		 
	 }
	 
	 public int palabrasTotales(int palabrasPagina) {
		 return palabrasPagina * super.getPaginas();
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
	 public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
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
	 public String getEnsenanza() {
		return ensenanza;
	}
	 public String getInterpretacion() {
		return interpretacion;
	}
	

}
