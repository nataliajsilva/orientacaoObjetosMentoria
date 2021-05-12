package com.mercadolibre.mentoria.poo.hospital;

public class Exame {

    //Propriedades
    private Setor setor;
    public String nome;
    private Medico medico;
    private Paciente paciente;

    //Métodos
    public Setor getSetorExame() {
        return  setor;
    }

    public void setSetorExame(Setor setor) {
        this.setor = setor;
    }

    public Medico getMedicoExame() { return medico; }

    public void setMedicoExame(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPacienteExame() { return paciente; }

    public void setPacienteExame(Paciente paciente) {
        this.paciente = paciente;
    }
}
