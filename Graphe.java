import java.util.ArrayList;
import java.util.Collections;

public class Graphe {

    private ArrayList<Point> points;

    public Graphe(ArrayList<Point> p){
        points = new ArrayList<>(p);
    }


    /**
     * Premute deux éléments du graphe
     * @param e1
     * @param e2
     */
    public void permutation(int e1, int e2){
        Collections.swap(points, e1, e2);
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
