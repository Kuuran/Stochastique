package stochastique;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class IO {

	/**
     * Crée un graphe à partir d'un fichier .tsp
     * @param fichier
     * @return
	 * @throws IOException 
     */

	/* Ajout d'un parseur */
	
public Graphe parse(String fichier) throws IOException {
    	
    	Graphe G = new Graphe(new ArrayList<>());
    	
    	FileReader input = new FileReader(fichier);
    	BufferedReader bufRead = new BufferedReader(input);
    	String myLine = null;
    	
        while((myLine = bufRead.readLine()) != null){
        	
            String[] tokens = myLine.split(" ");
            ArrayList<Integer> tokensInt= new ArrayList<Integer>();
            for(int i = 0; i<tokens.length; i++)
            {
            	try {
            		tokensInt.add(Integer.parseInt(tokens[i]));
            	}catch (NumberFormatException e) {}

            }
            
            Point p = new Point(tokensInt.get(0), tokensInt.get(0), tokensInt.get(0));
            G.add(p);
            
        }
        
		return G;
    }

    /**
     * écrit un graphe dans un fichier
     * @param g
     * @param chemin
     */
    public void ecrit(Graphe g, String chemin){

    }
    
}
