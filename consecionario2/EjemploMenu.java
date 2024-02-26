package consecionario2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;

public  class EjemploMenu extends JFrame{
	



/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/*

	private static void Menu() {
		
		//Lo primero será crear la barra de menú con JMenuBar
		JMenuBar Menu=new JMenuBar();
		
		//le podemos pasar como parámetro un String con el nombre del menú
		JMenu archivo=new JMenu("Archivo");
		JMenu editar=new JMenu("Editar");
		
		//Añadimos los anteriores menus a la barra de menú.
		Menu.add(archivo);
		Menu.add(editar);	
		
		//Ahora vamos a crear los submenus con JMenuItem.
		JMenuItem abrir=new JMenuItem("Abrir");
		JMenuItem guardar=new JMenuItem("Guardar");
		JMenuItem cargar=new JMenuItem("Cargar");
		JMenuItem salir=new JMenuItem("Salir");
		 
		JMenuItem modificar=new JMenuItem("Modificar");
		JMenuItem copiar=new JMenuItem("Copiar");
		JMenuItem pegar=new JMenuItem("Pegar");
		
		//Ahora debemos añadir los anteriores submenus a sus respectivos menús.

		archivo.add(abrir);
		archivo.add(guardar);
		archivo.add(cargar);
		archivo.add(salir);
		 
		editar.add(modificar);
		editar.add(copiar);
		editar.add(pegar);
		
		//indicaremos la barra que usaremos en la aplicación con el método setJMenuBar
		setJMenuBar(Menu);
		
		//añadir separadores entre los submenus, para ello usaremos la clase JSeparator

		JSeparator separador=new JSeparator();
		JSeparator separador2=new JSeparator();
		 
		archivo.add(abrir);
		archivo.add(separador);
		archivo.add(guardar);
		archivo.add(cargar);
		archivo.add(separador2);
		archivo.add(salir);
			
		System.out.println("has llegado");
	}



*/
	private JPanel contentPane;
	public static void main(String[] args) {
		
		 EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    EjemploMenu frame = new EjemploMenu();
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
				
		System.out.println("Fin");

	}
	
	public EjemploMenu() {
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 450, 300);
	        contentPane = new JPanel();
	        contentPane.setLayout(null);
	        setContentPane(contentPane);
	 
	        //Creamos la barra de Menu
	        JMenuBar barraMenu=new JMenuBar();
	 
	        //Creamos los menus
	        JMenu archivo=new JMenu("Archivo");
	        JMenu editar=new JMenu("Editar");
	 
	        //Añadimos los menus a la barra de menu
	 
	        barraMenu.add(archivo);
	        barraMenu.add(editar);
	 
	        //Creamos los submenus
	 
	        JMenuItem abrir=new JMenuItem("Abrir");
	        JMenuItem guardar=new JMenuItem("Guardar");
	        JMenuItem cargar=new JMenuItem("Cargar");
	        JMenuItem salir=new JMenuItem("Salir");
	 
	        JMenuItem modificar=new JMenuItem("Modificar");
	        JMenuItem copiar=new JMenuItem("Copiar");
	        JMenuItem pegar=new JMenuItem("Pegar");
	 
	        //Añadimos los submenus a los menus
	 
	        archivo.add(abrir);
	        archivo.add(new JSeparator());
	        archivo.add(guardar);
	        archivo.add(cargar);
	        archivo.add(new JSeparator());
	        archivo.add(salir);
	 
	        editar.add(modificar);
	        editar.add(copiar);
	        editar.add(pegar);
	 
	        //Indicamos que es el menu por defecto
	        setJMenuBar(barraMenu);
		
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}


}
