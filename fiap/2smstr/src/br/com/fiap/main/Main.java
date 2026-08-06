package br.com.fiap.main;

import br.com.fiap.bean.Equipe;

public class Main {
    public static void main(String[] args) {
        String[] sabores = {"Uva","Laranja","Scorch","xiiii"};
        double[] valores = new double[4];

        Equipe pao = new Equipe("SEES", new String[] {"Aigis", "Mitsuru Kirijo", "Junpei Iori", "Yukari Takeba", "Makoto Yuki", "Shinjiro", "Ken Amada", "Sanada", "Koromaru"});
        pao.listarEquipe();
    }
}
