/**
 * pour ce programme on donnera deux éléments lors de l'exécution :
 * 1 - le nom du fichier contenant notre graphe
 * 2 - le nombre de fois que l'on veut faire tourner l'algorithme du recuit simulé
 */
public class Main {

    public static void main(String[] argc){

        if (argc[0].endsWith(".tsp")){
            IO io = new IO();
            Graphe g;
            g = io.parse(argc[0]);
            if (!argc[1].isEmpty()){
                int nbStep;
                nbStep = Integer.parseInt(argc[1]);

                RecuitSimule rs = new RecuitSimule();
                Graphe resultat = rs.run(g, nbStep);

                io.ecrit(g, "out/resultat.txt");
            }
        }
    }
}
