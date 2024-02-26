package consecionario2;

public class coche {

	
	//atributos
	private String matricula;
	private int puertas;
	private double precio;
	private String marca;
	private boolean gasolina;
	
	
	//constructores
	public coche() {
		super();
		this.precio=0;
		
		// TODO Auto-generated constructor stub
	}
	
	public coche(String matricula, int puertas, double precio, String marca, boolean gasolina) {
		super();
		this.matricula=matricula;
		this.puertas=puertas;
		this.precio=precio;
		this.marca=marca;
		this.gasolina=gasolina;
	}

	
	//getes y setes
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean getGasolina() {
		return gasolina;
	}
	public void setGasolina(boolean gasolina) {
		this.gasolina = gasolina;
	}
	

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
