public class Point {
    private int nb;
    private double x, y;

    public Point(int n, double x, double y){
        nb = n;
        this.x = x;
        this.y = y;
    }

    /**
     * calcule la distance entre deux points
     * @param p
     * @return distance entre le point courant et le parametre p
     */
    public double distance (Point p){
        return java.lang.Math.sqrt((p.x - this.x)*(p.x - this.x) + (p.y - this.y)*(p.y - this.y));
    }

}
