package EntregaPrimeraParte;

import java.util.ArrayList;

public class Herramienta {

	private CSVReader reader;
	private CSVWritter writter;
	private Indice indice;
	ArrayList <Libro> coleccion;
	
	public Herramienta() {
		this.reader= new CSVReader();
		this.writter= new CSVWritter();
	}
	
	public void setColeccion(String path) {
		//Genero un arraylist de libros con la lectura del path
		this.coleccion= reader.ReadCsv(path);
	}


	public void setSalida(String path) {
		//Seteo el archivo de salida del writter
		this.writter.setPath(path);
	}
	

	
	public void generarIndice() {
		//Seteo el primer nodo del �rbol
		
		this.indice = new Indice();
		//Recorro todos los libros de la coleccion
		for(int i=0; i<coleccion.size(); i++) {
			//Por cada libro tomo su arreglo de generos
			String [] generos= coleccion.get(i).getGeneros();
			//Recorro todos sus generos
			for (int j=0; j<generos.length; j++) {

				Comparable gen = generos[j];
		
				
				this.indice.setGenero(gen, coleccion.get(i));
				
	

			}
			
		}
	}
	
	public void mostrarIndice () {
		this.indice.mostrarIndice();
	}
	

}
