package models;

import dao.MarcaDao;

public class Test {

	public static void main(String[] args) {
		
		Marca m = new Marca("Guaymall�n");
		MarcaDao aux = new MarcaDao();
		aux.save(m);
	}

}
