public class RecuitStep {

    private float temperature;

    public RecuitStep(float t){
        temperature = t;
    }

    /**
     * Exécute le recuit simulé sur notre graphe pour une temprature donnée
     * @param g
     * @return pour l'instant si ça s'est bien exécuté, a terme probablement le résultat (un indice de performance et le graphe résultant?)
     */
    public boolean run(Graphe g){

        //todo on veut faire des permutations aléatoires selon l'algo
        //on garde les permutations déja effectuées pour pas les refaire? ou que les rejetées?
        //todo calcul du nouveau cout pour savoir si on garde la permutation
        //il faut un graphe qui agisse comme buffer pour pouvoir revenir a celui d'avant (ou on refait juste la permutation a l'envers (probablement plus simple)


        return false;
    }

}
