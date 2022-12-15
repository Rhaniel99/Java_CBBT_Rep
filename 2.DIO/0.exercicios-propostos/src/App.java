import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // BasicOperation basicOperation = new BasicOperation();

        // basicOperation.sub(5, 5);
        // basicOperation.sum(12, 8);
        // basicOperation.mult(15, 2);
        // basicOperation.div(8, 4);


        // DateOfDay.dayTime(23);


        // Loan.calculation(1000, 2);
        // Loan.calculation(1000, Loan.getTwoParcel());

        // Quadrilaterals.square(3);
        // Quadrilaterals.square(5d, 5d);
        // Quadrilaterals.square(7, 8, 9);
        // Quadrilaterals.square(5f, 5f);

        System.out.println("Boas vindas ao exercicio: ");
        double areaSquare = Quadrilaterals.square(3);
        System.out.println("Área do quadrado:  " + areaSquare);

        double areaReactangle = Quadrilaterals.square(5, 5);
        System.out.println("Área do Retângulo:  " + areaReactangle);

        double areaTrapeze = Quadrilaterals.square(7, 8, 9);
        System.out.println("Área do Trapezio:  " + areaTrapeze);
        
        double areaLosange = Quadrilaterals.square(7f, 9f);
        System.out.println("Área do Losango:  " + areaLosange);

        int sumDecrease = CalculateDecrease.somatorio(10);
        System.out.println("Calculo: " + sumDecrease);

    }
}
