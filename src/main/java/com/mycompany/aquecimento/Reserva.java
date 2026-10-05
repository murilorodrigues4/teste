package com.mycompany.aquecimento;

public class Reserva {

    private String nome;
    private String destino;
    private String transporte;
    private boolean seguro;

    public Reserva(String nome, String destino, String transporte, boolean seguro) {
        this.nome = nome;
        this.destino = destino;
        this.transporte = transporte;
        this.seguro = seguro;
    }

    public String getNome() {
        return nome;
    }

    public String getDestino() {
        return destino;
    }

    public String getTransporte() {
        return transporte;
    }

    public boolean isSeguro() {
        return seguro;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
               " | Destino: " + destino +
               " | Transporte: " + transporte +
               " | Seguro: " + (seguro ? "Sim" : "Não");
    }
}

