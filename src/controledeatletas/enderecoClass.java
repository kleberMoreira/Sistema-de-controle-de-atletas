/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeatletas;

/**
 *
 * @author Kleber Moreira
 */
public class enderecoClass {
    
    //Atributos
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private char estado;
    private String país;
    private String cep;
    
    
    //Construtores
    public enderecoClass(String logradouro, String numero, String complemento, String bairro, String cidade, String país, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.país = país;
        this.cep = cep;
    }
    
    //Getters and setters
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public String getPaís() {
        return país;
    }

    public void setPaís(String país) {
        this.país = país;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
}
