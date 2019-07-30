/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
    
    
/**
 *
 * @author Administrador
 */
public class Ator {
    private int codigo;
    private String nome_artistico;
    private String nome_real;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome_artistico() {
        return nome_artistico;
    }

    public void setNome_artistico(String nome_artistico) {
        this.nome_artistico = nome_artistico;
    }

    public String getNome_real() {
        return nome_real;
    }

    public void setNome_real(String nome_real) {
        this.nome_real = nome_real;
    }

    @Override
    public String toString() {
        return "Ator{" + "nome_artistico=" + nome_artistico + '}';
    }

    
    
    
}
