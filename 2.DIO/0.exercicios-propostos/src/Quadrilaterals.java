// Cria uma aplicação que calcula a área dos 3 quadrilateros notáveis: quadrado, retângulo e trapézio. Obs.: Use sobrecarga. 

public class Quadrilaterals {

    public static double square(double side){
        return side * side;
    }

    public static double square(double side1, double side2){
        return side1 * side2;
    }

    public static double square(double baseLarger, double baseMinor, double height){
        return ((baseLarger + baseMinor) * height)/2;
    }

    public static float square(float diagonal1, float diagonal2){
        return (diagonal1 * diagonal2) / 2;
    }
   // Utilizando sem retorno.

    // public static void square(double side){
    //     double area = side * side;
    //     System.out.println("A área do quadrado do quadrilatero: " + area);
    // }

    // public static void square(double side1, double side2){
    //     double area = side1 * side2;
    //     System.out.println("A área do retângulo do quadrilatero: " + area);
    // }

    // public static void square(double baseLarger, double baseMinor, double height){
    //     double area = ((baseLarger + baseMinor) * height)/2;
    //     System.out.println("A área do trapezio do quadrilatero: " + area);
    // }

    // public static void square(float diagonal1, float diagonal2){
    //     float area = (diagonal1 * diagonal2) / 2;
    //     System.out.println("A área do losango do quadrilatero: " + area);
    // }
}
