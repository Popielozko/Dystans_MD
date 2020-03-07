package pl.sda.dystans;

public class Point {
   public int y;

    public Point(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int x;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

   public double distance (Point punkt2) {
       return Math.sqrt ( Math.pow((punkt2.getX() - this.getX()),2) + Math.pow((punkt2.getY() - this.getY()),2));
    }
}
