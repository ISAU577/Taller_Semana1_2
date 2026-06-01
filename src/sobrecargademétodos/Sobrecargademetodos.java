package sobrecargademétodos;

public class Sobrecargademetodos {
    
    
    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

   
    public static void main(String[] args) {
       
        Sobrecargademetodos op = new Sobrecargademetodos();

        int resultadoDosEnteros = op.sumar(5, 10);
        double resultadoDosDoubles = op.sumar(4.5, 3.2);
        int resultadoTresEnteros = op.sumar(10, 20, 30);

        System.out.println("--- Resultados de las Sumas ---");
        System.out.println("Suma de dos enteros (5 + 10): " + resultadoDosEnteros);
        System.out.println("Suma de dos doubles (4.5 + 3.2): " + resultadoDosDoubles);
        System.out.println("Suma de tres enteros (10 + 20 + 30): " + resultadoTresEnteros);
    }
}
 
 