import java.util.ArrayList;

//todo faut refaire cette classe, on stoque pas les bonnes data dedans (pour l'instant on peut pas calculer le cout)

public class Graphe {

    private ArrayList<Integer> points;

    public Graphe(ArrayList<Integer> p){
        points = new ArrayList<>(p);
    }

    public ArrayList<Integer> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Integer> points) {
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
    public float cout(){
        //todo bah juste on additionne les couts des arretes mais encore une fois faut revoir la structure avant
        return 0;
    }
}
