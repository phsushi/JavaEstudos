package br.com.fiap.bean;

import javax.swing.*;

public class Equipe {
    private String nome;
    private String[] integrantes;

    public Equipe(){}

    public Equipe(String nome, String[] integrantes){
        setNome(nome);
        setIntegrantes(integrantes);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(String[] integrantes) {
        this.integrantes = integrantes;
    }

    public void listarEquipe(){
        System.out.printf("Nome da Equipe: %s \n",getNome());
        System.out.println("Integrantes:");
        for (String integrante: this.integrantes){
            System.out.println(integrante);
        }
    }
}
