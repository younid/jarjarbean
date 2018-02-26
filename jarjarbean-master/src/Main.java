/**
 * Main
 *
 * Google HashCode 2017
 * Created by **
 */

public class Main {
    public static void main(String[] args) {
        String [] names = {"example.in", "big.in", "small.in", "medium.in"};

        for (String file : names) {
            InputParser parser = new InputParser(file);
            parser.run(); //< L'algo
            parser.writeOutput(); 
            System.out.println();
        }
    }
}