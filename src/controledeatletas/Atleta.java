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
public class Atleta {

    //Atributos   
    private String nomeAtleta;
    private String dataDeNascimento;
    private String altura;
    private String peso;
    private char sexo;
    private String nomePai;
    private String nomeMae;
    private String RG;
    private String CPF;
    private ArrayList <Numeros> telefone;

    public Atleta(String nomeAtleta, String dataDeNascimento, String altura, String peso, String nomePai, String nomeMae, String RG, String CPF) {
        this.nomeAtleta = nomeAtleta;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
        this.peso = peso;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.RG = RG;
        this.CPF = CPF;
    }
    

    public Atleta(String nomeAtleta)
    {
        this.nomeAtleta = nomeAtleta;
    }
    
       public String getNomeAtleta() {
        return nomeAtleta;
    }

    public void setNomeAtleta(String nomeAtleta) {
        this.nomeAtleta = nomeAtleta;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public ArrayList<Numeros> getTelefone() {
        return telefone;
    }

    public void setTelefone(ArrayList<Numeros> telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Atleta{" + "nomeAtleta=" + nomeAtleta + ", dataDeNascimento=" + dataDeNascimento + ", altura=" + altura + ", peso=" + peso + ", sexo=" + sexo + ", nomePai=" + nomePai + ", nomeMae=" + nomeMae + ", RG=" + RG + ", CPF=" + CPF + ", telefone=" + telefone + '}';
    }
    
}
