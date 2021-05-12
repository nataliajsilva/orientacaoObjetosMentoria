package com.mercadolibre.mentoria.poo.hospital;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Receita {

    //Propriedades
    private Medico medico;
    private Paciente paciente;
    public LocalDate data;
    private List<Medicamento> medicamentos = new ArrayList();
    public String posologia;

    //Métodos
    public Medico getMedicoReceita() {
        return  medico;
    }

    public void setMedicoReceita(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPacienteReceita() {
        return  paciente;
    }

    public void setPacienteReceita(Paciente paciente) {
        this.paciente = paciente;
    }

    public void adicionarMedicamentos(Medicamento medicamento) {
        this.medicamentos.add(medicamento);
    }

    public List<Medicamento> getMedicamentos() { return medicamentos; }
}
