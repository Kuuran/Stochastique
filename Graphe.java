import java.util.ArrayList;

public class Graphe {

    private ArrayList<Point> points;

    public Graphe(ArrayList<Point> p){
        points = new ArrayList<>(p);
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }

    /**
     * Premute deux éléments du graphe
     * @param e1
     * @param e2
     */
    public void permutation(int e1, int e2){
        //todo ya des algos bien qui sont sur internet
        //todo mais avant faut refaire la classe pour savoir quelle structure on utilise
    }

    /**
     * Calcul du cout total du graphe
     * @return
     */
    public double cout(){
        Point buffer = null;
        double result = 0;
        for (Point p : points){
            if (buffer != null){
                result += p.distance(buffer);
            }
            buffer = p;
        }
        return result;
    }
}
