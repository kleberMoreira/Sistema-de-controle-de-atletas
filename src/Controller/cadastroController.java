/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import controledeatletas.Atleta;
import controledeatletas.Futebolista;
import controledeatletas.Numeros;
import controledeatletas.enderecoClass;
import controledeatletas.premiacaoClass;
import controledeatletas.repositorioManager;

/**
 *
 * @author Kleber Moreira
 */
public class cadastroController {

    public boolean cadastrarAtleta(Atleta atleta)
  {
        boolean result = false;
        
        if(atleta.getNomeAtleta().length() > 0 && atleta.getNomeMae().length() > 0
                && atleta.getNomePai().length() > 0 && atleta.getRG().length() > 0
                && atleta.getPeso().length() > 0 && atleta.getAltura().length() > 0) 
        {
            repositorioManager.getInstance().cadastrarJogador(atleta);
            
            result = true;
        }
        
        return result;
    }
    
    public boolean cadastrarEndereco(enderecoClass endereco)
    {
        boolean result = false;
        
        if(endereco.getLogradouro().length() > 0 && endereco.getNumero().length() > 0 && endereco.getComplemento().length() > 0
              && endereco.getBairro().length() > 0 && endereco.getCidade().length() > 0 && endereco.getPaís().length() > 0 
                && endereco.getCep().length() > 0)
        {
            result = true;
        }   
    
            return result;
    }        
    
    public boolean cadastrarPremio(premiacaoClass premio)
    {
        boolean result = false;
        
        if(premio.getTitulo().length() > 0 && premio.getAno().length() > 0)
        {
            result = true;
        }
            return result;
    }       
    
    public boolean cadastrarFicha(Futebolista jogador)
    {
        boolean result = false;
        
        if(jogador.getClube().length() > 0 && jogador.getClubeAnterior().length() > 0)
            result = true;
            
            return result;
    }
    
    public boolean cadastrarNumero (Numeros contato)
    {
            boolean result = true;
            
            if(contato.getNumero().length() > 0)
                result = true;
            
            return result;
    }             
}