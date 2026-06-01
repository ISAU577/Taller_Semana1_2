package usodestatic;

public class Usodestatic {
    
  
    private static int contador = 0;

  
    public Usodestatic() {
        contador++;
    }

    
    public static int getContador() {
        return contador;
    }

  
    public static void main(String[] args) {
     
        System.out.println("Objetos creados al inicio: " + Usodestatic.getContador());

      
        new Usodestatic();
        new Usodestatic();
        new Usodestatic();

        System.out.println("Objetos creados al final: " + Usodestatic.getContador());
    }
}

