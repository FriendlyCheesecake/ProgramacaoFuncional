package br.com.ada.OOPII;

public class Morador {
    String nome;
    //Criar uma interface para garantir que são moradores
    Integer apartamento;
    Long telefoneCelular;
    String senha;

    public String getNome() {
        return nome;
    }

    public Integer getApartamento() {
        return apartamento;
    }

    public Long getTelefoneCelular() {
        return telefoneCelular;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setApartamento(Integer apartamento) {
        this.apartamento = apartamento;
    }

    public void setTelefoneCelular(Long telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
