package com.ListaSimple.app.ListaSimple_app;
import java.util.Iterator;

public class Principal {
	public static void main(String[] arg) {
		Iterator it;
		ListaConNodoFicticeo l=new ListaConNodoFicticeo();
		l.add(0,new StringBuffer("Cero"));
		l.add(1,new StringBuffer("Uno"));
		l.add(2,new StringBuffer("Cuatro"));
		l.add(2,new StringBuffer("Tres"));
		l.add(2,new StringBuffer("Dos"));
		System.out.println("Lista creada");
		System.out.println("------------");

	}	

	
}