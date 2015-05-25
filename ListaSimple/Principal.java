public class Principal {
   private Principal () {
      ListaConNodoFicticeo l=new ListaConNodoFicticeo();
      l.add(0,new StringBuffer("Cero"));
      l.add(1,new StringBuffer("Uno"));
      l.add(2,new StringBuffer("Cuatro"));
      l.add(2,new StringBuffer("Tres"));
      l.add(2,new StringBuffer("Dos"));
      log.debug("Lista creada");
      log.debug("------------");
   }

   public static void main(String[] arg) {
      principal();		
   }		
}