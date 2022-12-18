package br.com.ada.OOPII;

import java.util.Arrays;
import java.util.List;

public class Instrutor extends Morador implements Elegivel{
    String habilidade;

    public Instrutor(String nome, Integer apartamento, Long telefoneCelular, String senha, String habilidade) {
        this.nome = nome;
        this.apartamento = apartamento;
        this.telefoneCelular = telefoneCelular;
        this.senha = senha;
        this.habilidade = habilidade;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }


    @Override
    public void ConfereApartamento() {
        List<Integer> apartamentosValidos= Arrays.asList(101, 102, 103, 104, 201, 202, 203, 204, 301, 302, 303, 304, 401, 402, 403, 404, 501, 502,
                503, 504, 601,
                602, 603, 604);
        if (!(apartamentosValidos.contains(apartamento))) {
            System.out.println("Apartamento inválido, instrutor não pode ser cadastrado");
        }
    }
}
