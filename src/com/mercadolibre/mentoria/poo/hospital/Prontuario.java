package com.mercadolibre.mentoria.poo.hospital;


import java.time.LocalDate;

public class Prontuario {

    //Propriedades
    public long codigoProntuario;
    private Paciente paciente;
    public LocalDate dataAtualizacao;

    //Métodos
    public Paciente getPacienteProntuario() {
        return  paciente;
    }

    public void setPacienteProntuario(Paciente paciente) {
        this.paciente = paciente;
    }

}
