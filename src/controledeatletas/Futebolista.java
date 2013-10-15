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
public class Futebolista extends Atleta{
    
    //Atributos  
    private char categoria;
    private char posicao;
    private char principalAtributo;
    private char principalDeficiencia;
    private String clube;
    private String clubeAnterior;
    private char liga;
    private String preco;
    private String observacao;
    private ArrayList<premiacaoClass> premios;

    public Futebolista (String nomeAtleta, String clube, String clubeAnterior, String preco)
    {   
        super(nomeAtleta);
        this.clube = clube;
        this.clubeAnterior = clubeAnterior;
    }
    
    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public char getPosicao() {
        return posicao;
    }

    public void setPosicao(char posicao) {
        this.posicao = posicao;
    }

    public char getPrincipalAtributo() {
        return principalAtributo;
    }

    public void setPrincipalAtributo(char principalAtributo) {
        this.principalAtributo = principalAtributo;
    }

    public char getPrincipalDeficiencia() {
        return principalDeficiencia;
    }

    public void setPrincipalDeficiencia(char principalDeficiencia) {
        this.principalDeficiencia = principalDeficiencia;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public String getClubeAnterior() {
        return clubeAnterior;
    }

    public void setClubeAnterior(String clubeAnterior) {
        this.clubeAnterior = clubeAnterior;
    }

    public char getLiga() {
        return liga;
    }

    public void setLiga(char liga) {
        this.liga = liga;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public ArrayList<premiacaoClass> getPremios() {
        return premios;
    }

    public void setPremios(ArrayList<premiacaoClass> premios) {
        this.premios = premios;
    }
}
