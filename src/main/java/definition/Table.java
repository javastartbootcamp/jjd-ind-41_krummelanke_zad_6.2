package definition;

import java.util.Scanner;

public class Table {
    Scanner input = new Scanner(System.in);

    private int declareTableSize() {
        System.out.println("Podaj rozmiar tablicy: ");
        int tableSize = input.nextInt();
        return tableSize;
    }

    public double[] createTable() {

        int tableSize = declareTableSize();
        double[] numbers = new double[tableSize];

        System.out.println("Wprowadź " + numbers.length + " liczb(y): ");
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {

            double element = input.nextDouble();
            numbers[counter] = element;
            counter += 1;
        }
        return numbers;
    }

    public void showSumOfSquares(double[] numbers) {
        double sumOfSquares = 0;

        for (double tmp : numbers) {
            double square = tmp * tmp;
            sumOfSquares = sumOfSquares + square;
        }
        System.out.printf("Suma kwadratów wprowadzonych liczb to: %.0f", sumOfSquares);
    }
}
