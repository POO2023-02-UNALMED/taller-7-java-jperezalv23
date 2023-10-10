package comunicacion;

public class Alfabeto extends Pictograma{
    private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
		
	}
	
	 public String interpretacion() {
		 return interpretacion;
		
	}
	 
	 public String toString() {
		 String n = "";
		 for (String l : letras) {
			 n = n + l + ", ";
		 }
		 return n;
		 
	 }
	 
	 public int cantidadLetras() {
		 return letras.length;
	 }
	 
	public void setOrigen(String origen) {
		super.setOrigen(origen);
	}
	 
	 public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	 
	 public void setLetras(String[] letras) {
		this.letras = letras;
	}
	 
	public String getOrigen() {
		return super.getOrigen();
	}
	 
	 public String getInterpretacion() {
		return interpretacion;
	}
	 
	 public String[] getLetras() {
		return letras;
	}

}
