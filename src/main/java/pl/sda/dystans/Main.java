package pl.sda.dystans;

public class Main {

    public static void main(String[] args) {

        Point punkt1 = new Point(2,5);
        Point punkt2 = new Point(5,9);

        System.out.println("Odległość p1 do p2: " + punkt1.distance(punkt2));

    }
}