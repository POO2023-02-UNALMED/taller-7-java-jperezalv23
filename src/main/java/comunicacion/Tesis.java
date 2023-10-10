package comunicacion;

public class Tesis extends Escrito {
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen,String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
		
	}
	
	 public String interpretacion() {
		 return interpretacion;
		
	}
	 
	 public String toString() {
		 return super.getOrigen() + "\n" + super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas() + "\n" + idea + "\n" + argumentos.length + "\n" + conclusion + "\n" + referencias;
		 
	 }
	 
	 public int palabrasTotales(int palabrasPagina) {
		 return palabrasPagina * 5 * super.getPaginas();
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
	 
	 public void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}
	 
	 public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	 
	 public void setIdea(String idea) {
		this.idea = idea;
	}
	 
	 public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	 
	 public void setReferencias(String referencias) {
		this.referencias = referencias;
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
	
	 public String[] getArgumentos() {
		return argumentos;
	}
	 
	 public String getConclusion() {
		return conclusion;
	}
	 
	 public String getIdea() {
		return idea;
	}
	 
	 public String getInterpretacion() {
		return interpretacion;
	}
	 
	 public String getReferencias() {
		return referencias;
	}

}
