package EntregaPrimeraParte;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		Herramienta tool= new Herramienta();
		tool.setColeccion("C:/datasets/dataset1.csv");
		tool.generarIndice();
		tool.getIndice().printPreOrder();
		tool.setSalida("C:/salidas/salida1.csv");
		tool.VerLibrosXGenero("cine");
	}

}
