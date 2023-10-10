package comunicacion;

import java.lang.reflect.Array;

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
		 int n = letras.length - 1;
			String[] nuevo = new String[n];
			System.arraycopy(letras,1,nuevo,0,n);
			String j = (String)Array.get(letras, 0);
			
			for (String l : nuevo) {
				j = j + ", " + l ;
			}
			
		return j;
		 
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
