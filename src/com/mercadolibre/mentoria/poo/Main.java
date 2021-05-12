package com.mercadolibre.mentoria.poo;

import com.mercadolibre.mentoria.poo.ecommerce.*;
import com.mercadolibre.mentoria.poo.escola.*;
import com.mercadolibre.mentoria.poo.hospital.*;
import java.time.LocalDate;
import static com.mercadolibre.mentoria.poo.compartilhado.FormatData.formatarData;


/*  1- Sabendo que em atribuições de objetos a outros referenciamos as variáveis ao mesmo endereço de memória,
    como podemos criar uma cópia independente em um novo endereço na HEAP?


    2- O que são os atributos e métodos estáticos? Como eles são armazenados na memória, se a STACK é limpada
    a cada término de contexto?

    São atributos e métodos estáticos, aqueles que pertencem a classe e não ao objeto. Ou seja, é possivel acessá-lo,
    sem precisar instaciar o objeto. O atributo estático pode ser visualizado sem o obejto ter sido instanciado. E o método
    estático também não precisa ser chamado somente quando um objeto da classe é instaciado.


*/

public class Main {

    public static void main(String[] args) {

        //------------ Ambiente Escolar --------------------//

        Aluno alunaNatalia = new Aluno("329.682.268-27", "Natalia");
        alunaNatalia.turma = Turma.B1;
        alunaNatalia.grauEnsino = GrauEnsino.Fundamental;

        Professor professorGustavo = new Professor("57813110099", "Gustavo");

        Avaliacao avaliacaoMatematica = new Avaliacao();
        avaliacaoMatematica.setAlunoAvaliacao(alunaNatalia);
        LocalDate dataAplicacaoAvaliacao1Matematica = avaliacaoMatematica.dataAplicacao = LocalDate.of(2021, 04, 22);
        formatarData(dataAplicacaoAvaliacao1Matematica);
        avaliacaoMatematica.disciplina = Disciplina.Matematica;
        avaliacaoMatematica.nome = "Operações fracionárias";
        avaliacaoMatematica.setNota(10.0);
        avaliacaoMatematica.setProfessorAvaliacao(professorGustavo);
        avaliacaoMatematica.turma = Turma.B1;

        System.out.println(" " + avaliacaoMatematica.getAlunoAvaliacao().getNomeAluno());
        System.out.println(" " + alunaNatalia.getNomeAluno());
        System.out.println(" " + alunaNatalia.getDocumentoAluno());
        System.out.println(" " + professorGustavo.getDocumentoProfessor());
        System.out.println(" " + avaliacaoMatematica.getNota());

        //------------ Ambiente Hospitalar --------------------//

        Medico medicoAlberto = new Medico("066.626.270-54", "Alberto");
        medicoAlberto.crm = 1234;

        Paciente pacienteClaudia = new Paciente("605.230.200-31","Claudia");
        LocalDate dataNascimentoPaciente = pacienteClaudia.dataNascimento = LocalDate.of(1980, 01, 28);
        formatarData(dataNascimentoPaciente);
        pacienteClaudia.sexo = Sexo.Femenino;
        pacienteClaudia.tipoSanguineo = TipoSanguineo.A;

        Setor setorBranco = new Setor();
        setorBranco.local = "3 andar";
        setorBranco.nome = "Branco";

        Prontuario prontuarioClaudia = new Prontuario();
        prontuarioClaudia.codigoProntuario = 1;
        prontuarioClaudia.setPacienteProntuario(pacienteClaudia);
        LocalDate dataProntuarioClaudia = prontuarioClaudia.dataAtualizacao = LocalDate.of(2021, 04, 30);
        formatarData(dataProntuarioClaudia);

        Consulta consultaOftalmo = new Consulta();
        consultaOftalmo.setProntuarioConsulta(prontuarioClaudia);
        consultaOftalmo.setMedicoConsulta(medicoAlberto);
        consultaOftalmo.setSetorConsulta(setorBranco);
        LocalDate dataConsulta = consultaOftalmo.dataConsulta = LocalDate.of(2021, 04, 30);
        formatarData(dataConsulta);

        Exame exameOftalmo = new Exame();
        exameOftalmo.nome = "Tomografia de coerencia optica";
        exameOftalmo.setSetorExame(setorBranco);

        Medicamento medicamentoOftalmo = new Medicamento();
        medicamentoOftalmo.nome = "Colirio";
        medicamentoOftalmo.fabricante = "Unifarma";
        medicamentoOftalmo.dosagem = "30 ml";

        Receita receita = new Receita();
        receita.setMedicoReceita(medicoAlberto);
        receita.setPacienteReceita(pacienteClaudia);
        LocalDate dataReceita = receita.data = LocalDate.of(2021, 04, 30);
        formatarData(dataReceita);

        System.out.println(" " + consultaOftalmo.getSetorConsulta().nome);

        //------------ Ambiente E-commerce --------------------//

        Cliente clienteSabrina = new Cliente("329.682.268-27","Sabrina");
        clienteSabrina.apelido = "Sabri";
        clienteSabrina.setEmail("sabrina_12@mercadolivre.com");

        LocalDate dataNascimento = clienteSabrina.dataNascimento = LocalDate.of(1976, 07, 17);
        formatarData(dataNascimento);
        clienteSabrina.setCidadeCliente("Osasco");
        clienteSabrina.setEnderecoCliente("Rua chico mendes, 25");
        clienteSabrina.setEstadoCliente(Estado.SaoPaulo);
        clienteSabrina.ativo = true;

        NotaFiscal notaFiscalSabrina = new NotaFiscal();
        notaFiscalSabrina.setValorTotal(130.90);
        System.out.println("Valor total da Nota fiscal: " + notaFiscalSabrina.getValorTotal());

        Pedido pedidoSabrina = new Pedido();
        Pedido pedidoTeste = new Pedido();
        Pedido pedidoTeste3 = new Pedido();
        pedidoSabrina.setClientePedido(clienteSabrina);
        pedidoSabrina.setNotaFiscalPedido(notaFiscalSabrina);
        pedidoSabrina.data = LocalDate.of(2021, 04, 30);
        System.out.println("Valor total do pedido: " + pedidoSabrina.getValorTotalPedido());

        System.out.println("Quantidade pedidos: " + Pedido.getQuantidadePedidos());

        notaFiscalSabrina.setPedidoNotaFiscal(pedidoSabrina);

        Produto produto1 = new Produto();
        produto1.nome = "Prancha cabelo";
        produto1.categoria = Categoria.Eletrodomestico;
        produto1.fabricante = "Philco";
        produto1.setValor(100.90);

        Produto produto2 = new Produto();
        produto2.nome = "Escova de cabelo";
        produto2.categoria = Categoria.Casa;
        produto2.fabricante = "Bella";
        produto2.setValor(30.0);

        ItensPedido itensPedidoSabrina = new ItensPedido();
        itensPedidoSabrina.setPedido(pedidoSabrina);
        itensPedidoSabrina.adicionarProduto(produto1);
        itensPedidoSabrina.adicionarProduto(produto2);

        Pagamento pagamento = new Pagamento();
        pagamento.tipoPagamento = TipoPagamento.CartaoDebito;
        pagamento.setPedidoPagamento(pedidoSabrina);
        boolean pagamentoSabrina = pagamento.confirmacaoPagamento = false;
        pagamento.realizacaoPagamento(pagamentoSabrina);

        Transportadora transportadora1 = new Transportadora("48.017.524/0001-11","Fedex");
        transportadora1.ativo = true;

        Entrega entregaSabrina = new Entrega();
        entregaSabrina.prazoEntrega = LocalDate.of(2021, 05, 5);
        entregaSabrina.setCliente(clienteSabrina);
        entregaSabrina.getCliente().getCidadeCliente();
        entregaSabrina.getCliente().getEstadoCliente();
        entregaSabrina.getCliente().getEnderecoCliente();

    }
}
