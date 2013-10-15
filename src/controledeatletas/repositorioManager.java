/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeatletas;

import java.util.ArrayList;

/**
 *
 * @author Kleber Moreira
 */
public class repositorioManager {
    
    private static repositorioManager instance;
    private ArrayList <Atleta> listaAtleta;
            
    private repositorioManager()
    {
        listaAtleta = new ArrayList<Atleta>();
    }
    
    //Singleton
    public static repositorioManager getInstance()
    {
        if(instance == null)
        {
            instance = new repositorioManager();
        }
       return instance;
    }
    
    public void cadastrarJogador(Atleta atleta)
    {
        listaAtleta.add(atleta);
        System.out.println(atleta);
    }

    public void cadastrarJogador(premiacaoClass premio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
