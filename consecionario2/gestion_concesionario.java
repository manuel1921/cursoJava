package consecionario2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

public class gestion_concesionario {
	
	public static coche[] coches_Stock=new coche[40];
	public static usuario[] _usuarios=new usuario[10];
		
	//coches random
	private static String Random_Matricula() {
		
	String Matriculas []= {"XCD465", "JGF678", "PDF984", "GSG154", "BMW954", "HDH748", "MGH156", "FDG374", "TLU302"};
	 Random random_matricula=new Random();
	int select = random_matricula.nextInt(Matriculas.length);
	return Matriculas[select];
	}
	private static String Random_Marca() {
		String Marcas []= {"Seat", "Peugeot", "Corsa", "Ford", "BMW", "Hyundai", "Mercedes", "Ferrari", "Twingo"};
		Random random_marca=new Random();
		int select = random_marca.nextInt(Marcas.length);
		return Marcas[select];
	}
	private static int Random_Puerta() {
		int seleccion;
		Random rd = new Random();
		rd.nextBoolean();
		if(rd.nextBoolean()) {
			seleccion=3;
		}
		else {
			seleccion=5;
		}
		return seleccion;
	}
	private static double Random_Precio() {
		int min=12080;
		int max=54900;
		double x = (Math.random() * ((max - min) + 1)) + min;
		double xrounded = Math.round(x * 100.0) / 100.0;
		return xrounded;
	}
	private static boolean Random_combustible() {
		
		Random rd = new Random();
		return rd.nextBoolean();
	}
	
	//funciones
	private static void compra_coche(int a, int b) {
		_usuarios[a].add_coches(coches_Stock[b]);
		
		coches_Stock[b]=new coche();
	}
	
	private static void Busca_Marca () {
		
		 Scanner lectura= new Scanner (System.in);
		 System.out.println("Introduce la marca");
			String marca = lectura.next();
			lectura.close();
			
			for(int a=0;a<coches_Stock.length;a++) {
				
				if (marca.equals(coches_Stock[a].getMarca())) {
				System.out.println("coche "+a+":"+coches_Stock[a].getMatricula()+","+coches_Stock[a].getPrecio()+","+coches_Stock[a].getMarca()+","+coches_Stock[a].getGasolina());
			}
			
			}
	}
	
	private static void Busca_Coche() {
		 Scanner lectura= new Scanner (System.in);
		 System.out.println("Introduce la matricula");
			String matricula = lectura.next();
		System.out.println("Introduce la precio");
			double precioBuscado = Double.parseDouble(lectura.next());
			//double precioBuscado=1200.00;
		 System.out.println("Introduce la marca");
			String marca = lectura.next();
		System.out.println("Introduce la combustible");
			boolean combustible = lectura.nextBoolean();
			
			for(int a=0;a<coches_Stock.length;a++) {
				
				if (coches_Stock[a].getMatricula().equals(matricula) && coches_Stock[a].getPrecio()==precioBuscado 
					&& coches_Stock[a].getMarca().equals(marca) && coches_Stock[a].getGasolina()==combustible) {
					System.out.println("coche "+a+":"+coches_Stock[a].getMatricula()+","+coches_Stock[a].getPrecio()+","+coches_Stock[a].getMarca()+","+coches_Stock[a].getGasolina());
					
				}
				
			}
			lectura.close();
			
	}
	
	private static void Busca_Caro() {
		double caro=0;
		for(int i=0; i<coches_Stock.length; i++){
			
		    if(coches_Stock[i].getPrecio()>caro){
		    	caro = coches_Stock[i].getPrecio();
		    }
		}
		for(int i=0; i<coches_Stock.length; i++){
			
		    if(coches_Stock[i].getPrecio()==caro){
		    	System.out.println("el coche m�s caro es: "+coches_Stock[i].getMatricula()+","+coches_Stock[i].getPuertas()+","+coches_Stock[i].getPrecio()+","+coches_Stock[i].getMarca()+","+coches_Stock[i].getGasolina());
		    }
		}
		
	}
	
	private static void Busca_Barato() {
		double barato=9000000;
		for(int i=0; i<coches_Stock.length; i++){
			
		    if(coches_Stock[i].getPrecio()<barato && coches_Stock[i].getPrecio()!=0){
		    	barato = coches_Stock[i].getPrecio();
		    }
		}
		for(int i=0; i<coches_Stock.length; i++){
			
		    if(coches_Stock[i].getPrecio()==barato){
		    	System.out.println("El coche mas barato es: "+coches_Stock[i].getMatricula()+","+coches_Stock[i].getPuertas()+","+coches_Stock[i].getPrecio()+","+coches_Stock[i].getMarca()+","+coches_Stock[i].getGasolina());
		    }
		}
		
	}
	
	private static void Suma_Caros() {
		double primero=0;
		double segundo=0;
		double tercero=0;
		for(int i=0; i<coches_Stock.length; i++){
			
			/*
		   if(coches_Stock[i].getPrecio()>primero){
		    	primero = coches_Stock[i].getPrecio();
		    }
		    if(coches_Stock[i].getPrecio()>segundo && coches_Stock[i].getPrecio()!=primero){
		    	segundo = coches_Stock[i].getPrecio();
		    }
		    if(coches_Stock[i].getPrecio()>tercero && coches_Stock[i].getPrecio()!=primero && coches_Stock[i].getPrecio()!=segundo){
		    	tercero = coches_Stock[i].getPrecio();
		    }*/
			if (coches_Stock[i].getPrecio()>primero) {
				primero = coches_Stock[i].getPrecio();
			}
			else {
				if(coches_Stock[i].getPrecio()>segundo) {
					segundo = coches_Stock[i].getPrecio();
				}
				else {
					if(coches_Stock[i].getPrecio()>tercero) {
						tercero = coches_Stock[i].getPrecio();
					}
				}
			}
				
		}
		System.out.println("El mas caro es: "+primero+", el segundo mas caro es: "+segundo+", el tercero mas caro es: "+tercero+". Su suma es: "+(primero+(segundo+tercero)));
		
	}
	
	private static void Media_usuario(int u) {
		double suma=0;
		
		suma+=_usuarios[u].getCoches_comprados()[0].getPrecio();
		suma+=_usuarios[u].getCoches_comprados()[1].getPrecio();
		suma+=_usuarios[u].getCoches_comprados()[2].getPrecio();
		System.out.printf("La media de "+_usuarios[u].getNombre()+" es %5.2f", suma/3);
	}
	
	private static void Media_usuarios() {
		double suma=0;
		for(int a=0; a<_usuarios.length; a++) {
			for (int cocheCom=0;cocheCom<_usuarios[a].getCont_coches();cocheCom++)
				suma+=_usuarios[a].getCoches_comprados()[cocheCom].getPrecio();
	
		}
		System.out.printf("La media de los usuarios es %5.2f", suma/_usuarios.length);
		System.out.println();
	}

	private static void Marca_Comprada () {
		
		Scanner lectura= new Scanner (System.in);
		 System.out.println("Introduce la marca");
			String marca = lectura.next();
			lectura.close();
			
			for(int a=0;a<3;a++) {
				for(int b=0; b<_usuarios[a].getCoches_comprados().length; b++) {
					if (_usuarios[a].getCoches_comprados()[b].getMarca().equals(marca)) {
						System.out.println("coche de "+_usuarios[a].getNombre()+" es:"+_usuarios[a].getCoches_comprados()[b].getMatricula()+","+_usuarios[a].getCoches_comprados()[b].getPrecio()+","+_usuarios[a].getCoches_comprados()[b].getMarca()+","+_usuarios[a].getCoches_comprados()[b].getGasolina());
				}
				
			}
			
			}
	}
	
	private static void Busca_Caro_Usu() {
		double caro=0;
		for(int a=0; a<_usuarios.length; a++) {
			for (int cocheCom=0;cocheCom<_usuarios[a].getCont_coches();cocheCom++) {
				
		    if(_usuarios[a].getCoches_comprados()[cocheCom].getPrecio()>caro){
		    	caro = _usuarios[a].getCoches_comprados()[cocheCom].getPrecio();
		    }
		}
		}
			for(int a=0; a<_usuarios.length; a++) {
				for (int cocheCom=0;cocheCom<_usuarios[a].getCont_coches();cocheCom++) {
					
			    if(_usuarios[a].getCoches_comprados()[cocheCom].getPrecio()==caro){
		    	System.out.println("el coche comprado m�s caro es el coche de: "+_usuarios[a].getNombre()+", es: "+_usuarios[a].getCoches_comprados()[cocheCom].getPrecio()+", "+_usuarios[a].getCoches_comprados()[cocheCom].getMarca());
		    }
		}
			}
		
	}
	
	
	private static String Nombre() {
		String nombre[] = {"Manuel","Jose","David","Antonio","Luis","Francisco","Pedro","Ana","Maria"};
		Random random = new Random();
		int selet = random.nextInt(nombre.length);
		return nombre[selet];
		
	}
	
	private static String Apellido() {
		String apellido[] = {"Gonzales", "Jimenes","Torre","Vega","Tello","Sanches","Gomez"};
		Random random = new Random();
		int selet = random.nextInt(apellido.length);
		return apellido[selet];
	}
	
	private static String Fecha() {
		String año[] = {"1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"};
		String dia[] = {"0","1","2","3","4","5","6","7","8","9"};
		String mes [] = {"enero","febrero","marzo", "abril", "mayo", "junio","julio", "agosto","septiembre", "noviembre","diciembre"}; 
		Random random = new Random();
		int a = random.nextInt(año.length);
		int b = random.nextInt(dia.length);
		int c = random.nextInt(mes.length);
		return dia[b]+ "/" +mes[c] + "/" + año[a];
	
	}
	
	private static double Descuento() {
		double descuento [] = {0.1,0.2,0.3};
		Random random = new Random();
		int d = random.nextInt(descuento.length);
		return descuento [d];
	}
	
	private static void Insertar_Coche() {
		int i = 0;
		boolean encontrado = false;
		while(!encontrado && i<coches_Stock.length) {
			if(coches_Stock [i].getMarca()== null) {
				encontrado = true;
				coches_Stock[i]=new coche(Random_Matricula(), Random_Puerta(), Random_Precio(), Random_Marca(), Random_combustible());
				}
			else {
				i++;
			}
			
			}
		if(!encontrado) {
			System.out.println("esta lleno");
		}
			
	}
	
 	private static void Busca_usuario() {
		
		
		Scanner lectura= new Scanner (System.in);
		 System.out.println("Introduce letra");
			String letra = lectura.next();
			lectura.close();
			
			boolean enco=false;
			
			System.out.println("Usuarios que contienen '"+letra+"'");
			
		for (int a=0; a<_usuarios.length; a++) {
			if (_usuarios[a].getNombre()!=null ) {
				
				if(_usuarios[a].getNombre().contains(letra)) {
					System.out.println(_usuarios[a].getNombre()+" "+_usuarios[a].getApellido());
					enco=true;
					}
				}
			}
			
		if (!enco) {
			System.out.println("No hay usuarios que ocntenga esa letra");
		}
	}
	
	public static void menu() {
		  Scanner sn = new Scanner(System.in);
	        boolean salir = false;
	        int opcion; //Guardaremos la opcion del usuario
	 
	        while (!salir) {
	 
	        	System.out.println("||////////////////////////////////////////////////||");
	            System.out.println("|| 1. coches_Stock                                ||");
	            System.out.println("|| 2. todos los usuarios                          ||");
	            System.out.println("|| 3. Fecha                            0     0    ||");
	            System.out.println("|| 4. descuento                           ^       ||");
	            System.out.println("|| 5. buscar usuario                   -------    ||");
	            System.out.println("|| 6. comprar coche                       ¨       ||");
	            System.out.println("|| 7. insertar coche                              ||");
	            System.out.println("|| 8. mostrar coches de usuarios                  ||");
	            System.out.println("|| 9. baja de coche usuario                       ||");
	            System.out.println("|| 0.Salir                                        ||");
	            System.out.println("||////////////////////////////////////////////////||");
	 
	 
	            try {
	 
	                System.out.println("Escribe una de las opciones");
	                opcion = sn.nextInt();
	 
	                switch (opcion) {
	                    case 1:{
	                    	for(int a=0;a<40;a++) {
	                    		System.out.println("stock "+a+":"+coches_Stock[a].getMatricula()+","+coches_Stock[a].getPuertas()+","+coches_Stock[a].getPrecio()+","+coches_Stock[a].getMarca()+","+coches_Stock[a].getGasolina());	                    	
	                    		}
	                     	break;}
	                    case 2:{
	                    	for (int a=0;a<20;a++) {
	                    		System.out.println( "ususarios" + a + Nombre() + Apellido());
	                    	}
	                        break;}
	                    case 3:{
	                    	for (int a=0;a<10;a++) {
	                    		System.out.println( a + Fecha());}
	                        break;}
	                    case 4:{
	                    	for(int a=0; a<1;a++)
	                    		System.out.println(a + Descuento());
	                    	break;
	                    }
	                    
	                    case 5:{
	                    	 System.out.println("Escribe id usuario");
	     	                 int usu = sn.nextInt();
	     	                 System.out.println(_usuarios[usu].getNombre() +" "+ "" +  _usuarios[usu].getApellido());
	                    	break;
	                    }
	                    case 6:{
	                    	System.out.println("Escribe id coche");
	     	                 int coche = sn.nextInt();
	     	                 System.out.println("coche "+coche+":"+coches_Stock[coche].getMatricula()+","+coches_Stock[coche].getPuertas()+","+coches_Stock[coche].getPrecio()+","+coches_Stock[coche].getMarca()+","+coches_Stock[coche].getGasolina());
	                    	break;
	                    }
	                    case 7:{
	                    	Insertar_Coche();
	                    	
	                    	break;
	                    }
	                    case 8:{
	                    	  System.out.println("id usuario");
	                    	  int usu2 = sn.nextInt();
	                    	  if(_usuarios[usu2].getCont_coches()!=0) {
	                    		  for(int a = 0; a<_usuarios[usu2].getCont_coches();a++) {
	                    			  System.out.println(_usuarios[usu2].getCoches_comprados()[a].getGasolina() +" "+ _usuarios[usu2].getCoches_comprados()[a].getMarca()+ " "+ _usuarios[usu2].getCoches_comprados()[a].getPuertas()+" "+ _usuarios[usu2].getCoches_comprados()[a].getPrecio());
	                    		  }
	                    	  }
	                    	break;
	                    }
	                    case 9:{System.out.println("id usuario");
	                    	int usu3 = sn.nextInt();
	                    	_usuarios[usu3].Quitar_Coche();
	                    	break;
	                    }
	                    
	                    case 0:{
	                        salir = true;
	                        break;}
	                    default:{
	                        System.out.println("Solo números entre 1 y 4");
	                        break;}
	                	}
	            	} catch (InputMismatchException e) {
	                System.out.println("Debes insertar un número");
	                sn.next();
	            }
	        }	      
		 
	   }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		for(int i=0; i<_usuarios.length; i++) {
			_usuarios[i]=new usuario();
		}
		
		for (usuario usuario : _usuarios) {
			//System.out.println("El usuario tiene de id "+usuario.getIdentificador());
		}
		
		//coches_Stock[0]= new coche("XCD465", 5, 54900, "seat", true);
		_usuarios[0]=new usuario("Pablo","Fernandez","6-3-2022", 0.27);
		_usuarios[1]=new usuario("Fran","Pozo","10-3-2023", 0.05);
		_usuarios[2]=new usuario("Jose","Campo","28-9-2021", 0.39);
		
		//coches_Stock[1]=new coche("JGF678", 5, 31900.54, "ford", false);
		//coches_Stock[2]=new coche("PDF984", 5, 27900, "peugeot", true);
		
		//System.out.println(_usuarios[0].getCoches_comprados()[0].getMarca());
		//_usuarios[0].sumatorio_precio();
		//_usuarios[0].precio_final();
		//System.out.printf("%5.2f",_usuarios[0].getSuma_precio());
		//System.out.println();
		//System.out.printf("%5.2f",_usuarios[0].getDinero_invertido());
		//System.out.println();
		
		//Mostrar todos los coches en stock
		for(int a=0;a<40;a++) {
			coches_Stock[a]=new coche(Random_Matricula(), Random_Puerta(), Random_Precio(), Random_Marca(), Random_combustible());
			//System.out.println("coche "+a+":"+coches_Stock[a].getMatricula()+","+coches_Stock[a].getPuertas()+","+coches_Stock[a].getPrecio()+","+coches_Stock[a].getMarca()+","+coches_Stock[a].getGasolina());
		}
		
		
		_usuarios[0].add_coches(coches_Stock[4]);
		_usuarios[0].add_coches(coches_Stock[1]);
		_usuarios[0].add_coches(coches_Stock[8]);
		_usuarios[1].add_coches(coches_Stock[11]);
		_usuarios[1].add_coches(coches_Stock[18]);
		_usuarios[1].add_coches(coches_Stock[39]);
		_usuarios[2].add_coches(coches_Stock[21]);
		_usuarios[2].add_coches(coches_Stock[30]);
		_usuarios[2].add_coches(coches_Stock[27]);
		
		
		//compra_coche(1, 8);
		
		System.out.println("////////////////////////////////////////////////////////");
		for(int a=0;a<40;a++) {
			
			//System.out.println("coche "+a+":"+coches_Stock[a].getMatricula()+","+coches_Stock[a].getPrecio()+","+coches_Stock[a].getMarca()+","+coches_Stock[a].getGasolina());
			}
		/*for(int a=0;a<40;a++) {
		//System.out.println("coche "+a+":"+coches_Stock[a].getMatricula()+","+coches_Stock[a].getPrecio()+","+coches_Stock[a].getMarca()+","+coches_Stock[a].getGasolina());
		}*/
		
	/*	//Busca_Marca();
		System.out.println("////////////////////////////////");
		//Busca_Coche();
		Busca_Caro();
		System.out.println("/////////////////////////////////");
		Busca_Barato();
		System.out.println("/////////////////////////////");
		Suma_Caros();
		System.out.println("///////////////////////////////");
		System.out.println("Coches comprados");
		System.out.println(_usuarios[1].getCoches_comprados()[0].getMarca()+", "+_usuarios[1].getCoches_comprados()[1].getMarca()+", "+_usuarios[1].getCoches_comprados()[2].getMarca());
		System.out.println("///////////////////////////");
		//Media_usuario(1);
		System.out.println();
		System.out.println("////////////////////////////////");
		Media_usuarios();
		System.out.println("/////////////////////////////");
		//Marca_Comprada();
		System.out.println("//////////////////////////////");
		//Busca_Caro_Usu();
		System.out.println("//////////////////////////////");
		Busca_usuario();*/
		menu();

		
		
	}
	/*private static Object Random_Nombre() {
		// TODO Auto-generated method stub
		return null;
	}*/

}
