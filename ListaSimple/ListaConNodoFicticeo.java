

public class ListaConNodoFicticeo{
	
	static class Nodo{//clase anidada
		Object dato;//apilaremos objetos para que sirva para cualquier cosa
		Nodo sig;//a su vez tiene un atributo de su misma clase	
	}

	Nodo ini;
	int tamaño;
	
	public ListaConNodoFicticeo() {
		ini=new Nodo();
	}

	
	public void add(int pos, Object o){

		if(pos<0 || pos>tamaño)
			throw new RuntimeException("posicion excedida en la lista.");

		Nodo anterior=ini;
		Nodo nuevo=new Nodo();
		nuevo.dato=o;

		while(pos!=0) {
			pos--;
			anterior=anterior.sig;
		}
		nuevo.sig=anterior.sig;
		anterior.sig=nuevo;
		tamaño++;
	}



	public Object remove(int pos){
		if(pos<0 || pos>=tamaño)
			throw new RuntimeException("posicion excedida en la lista.");

		Object aux;
		Nodo anterior;
		anterior=ini;
		while(pos!=0) {
			pos--;
			anterior=anterior.sig;
		}
		aux=anterior.sig.dato;
		anterior.sig=anterior.sig.sig;
		tamaño--;
		return aux;
	}

	public int size(){
		return tamaño;		
	}
	
	public String toString() {
		StringBuffer frase=new StringBuffer();
		Nodo i=ini.sig;
		while(i!=null) {
			frase.append(i.dato+"\n");
			i=i.sig;
		}
		return frase.toString();
	}

	public void set(int pos, Object obj) {
		if(pos<0 || pos>=tamaño)
			throw new RuntimeException("posicion excedida en la lista.");
		Nodo i=ini.sig;
		while(pos!=0)	{
			pos--;
			i=i.sig;
		}
		i.dato=obj;
	}
	
	
	
	public Object get(int pos) {
		if(pos<0 || pos>=tamaño)
			throw new RuntimeException("posicion excedida en la lista.");
		Nodo i=ini.sig;
		while(pos!=0)	{
			pos--;
			i=i.sig;
		}
		return i.dato;
	}


 	
}