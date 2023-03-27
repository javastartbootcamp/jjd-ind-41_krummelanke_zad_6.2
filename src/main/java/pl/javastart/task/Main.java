package pl.javastart.task;

import definition.Table;

class Main {
    public static void main(String[] args) {

        Table table = new Table();
        double[] numbers =  table.createTable();
        table.showSumOfSquares(numbers);
    }
}
