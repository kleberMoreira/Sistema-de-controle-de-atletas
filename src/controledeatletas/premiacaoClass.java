/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controledeatletas;

/**
 *
 * @author Kleber Moreira
 */
public class premiacaoClass{
    
    //Atributos
    private String titulo;
    private String ano;
    
    public premiacaoClass(String titulo, String ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
    @Override    
    public String toString()
    {
        return this.ano + " - " + this.titulo;
    }

}
