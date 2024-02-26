package consecionario2;

import java.util.Iterator;

public class usuario {

	private double descuento;
	private String fecha;
	private String nombre;
	private String apellido;
	private static int id=0;
	private int identificador;
	private coche[] coches_comprados= new coche[3];
	private int cont_coches=0;
	private double dinero_invertido;
	private double suma_precio=0;
	
	//constructores
	public usuario() {
		super();
		this.id++;
		this.identificador=id;
	}

	public usuario(String nombre, String apellido, String fecha, double descuento) {
		super();
		this.nombre=nombre;
		this.apellido=apellido;
		this.fecha=fecha;
		this.descuento=descuento;
	}
	//id private static int enumerar que la clase te facilite los id de cada usuario
	//id statico que se aumente cuando se genere un nuevo usuario
	//identificador en cada usuario donde se guardara el id generado
	//vector de coches de 3 que se llame coche_comprados

	
	//getes y setes
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public coche[] getCoches_comprados() {
		return coches_comprados;
	}
	public void setCoches_comprados(coche[] coches_comprados) {
		this.coches_comprados = coches_comprados;
	}
	
	public double getDinero_invertido() {
		this.dinero_invertido+=coches_comprados[cont_coches-1].getPrecio();
		return dinero_invertido;
	}

	public void setDinero_invertido(double dinero_invertido) {
		this.dinero_invertido = dinero_invertido;
	}

	public double getSuma_precio() {
		return suma_precio;
	}

	public void setSuma_precio(double suma_precio) {
		this.suma_precio = suma_precio;
	}

	
	
	public int getCont_coches() {
		return cont_coches;
	}

	public void setCont_coches(int cont_coches) {
		this.cont_coches = cont_coches;
	}

	//funciones
	public void add_coches(coche c1) {
		if (cont_coches<3) {
			{coches_comprados[cont_coches]=c1;
			cont_coches++;
			}
		}else
			System.out.println(nombre+"no puedes comprar mas coches");
	}
	
	/*public void sumatorio_precio () {
		//System.out.println("contador de coches "+cont_coches);
		for (int i=0;i<cont_coches;i++) {
			this.suma_precio+=coches_comprados[cont_coches-1].getPrecio();
		}
		
	}*/
	
	public void precio_final ( ) {
				
		this.dinero_invertido=dinero_invertido+(suma_precio-(suma_precio*descuento));
	}

	public void Quitar_Coche() {
	if (cont_coches>0) {
		coches_comprados[cont_coches-1] = new coche();
		cont_coches --;
	}
	else {
		System.out.println("notiene coche comprado");
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
