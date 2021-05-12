package com.mercadolibre.mentoria.poo.hospital;

import java.time.LocalDate;

public class Consulta {

    //Propriedades
    private Prontuario codigoProntuario;
    private Medico medico;
    private Setor setor;
    public LocalDate dataConsulta;

    //Métodos
    public Prontuario getProntuarioConsulta() {
        return  codigoProntuario;
    }

    public void setProntuarioConsulta(Prontuario codigoProntuario) {
        this.codigoProntuario = codigoProntuario;
    }

    public Medico getMedicoConsulta() {
        return  medico;
    }

    public void setMedicoConsulta(Medico medico) {
        this.medico = medico;
    }

    public Setor getSetorConsulta() {
        return  setor;
    }

    public void setSetorConsulta(Setor setor) {
        this.setor = setor;
    }

}
