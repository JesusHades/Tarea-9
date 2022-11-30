
public class Test {
    
    public static void main(String[] args) {
        ADTTablaHash<String> nombres = new ADTTablaHash<>(13);
        nombres.add(236, "Jose");
        nombres.add(526, "A");
        nombres.add(435, "E");
        nombres.add(313, "B");
        nombres.add(29, "C");
        nombres.add(187, "D");
        
        
        System.out.println("Valor asociado a la llave 435 : " + nombres.valueOf(435));
        System.out.println("\n");
        
        System.out.println("Valor asociado a la llave 526 : " + nombres.valueOf(526));
        System.out.println("\n");
        
        System.out.println("Valor asociado a la llave 236 : " + nombres.valueOf(236));
        System.out.println("\n");
        
        nombres.remove(435);
        System.out.println("Valor asociado a la llave 29 : " + nombres.valueOf(29));
        nombres.remove(313);       
    }
 
       
          
        

}
