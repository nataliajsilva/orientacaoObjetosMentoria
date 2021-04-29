package com.mercadolibre.mentoria.poo.escola;

public class Aluno {

    //Propriedades
    public String nome;
    private long documento;
    public Turma turma;
    public GrauEnsino grauEnsino;


    //metódos
    public Long getDocumentoAluno() { return documento; }

    public void setDocumentoAluno(long documento) {

        this.documento = documento;

    }

}
