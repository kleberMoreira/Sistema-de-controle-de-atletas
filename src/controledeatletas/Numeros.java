/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeatletas;

import telas.informacoesGerais;

/**
 *
 * @author Kleber Moreira
 */
public class Numeros extends informacoesGerais{

    private String numero;
    
    public Numeros(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
}
