/*Guilherme Gomes Pinho - 10755529
Moabe Guedes - 10748053 */
public class Paciente {
    private String CPF;
    private String nome;
    private String dataNascimento;
    private int telefone;
    private String ultimaConsulta;
    private int qtdeConsultas;

    public Paciente (String CPF, String nome, String dataNascimento, int telefone) {
        this.telefone = telefone;
        this.CPF = CPF;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.ultimaConsulta = null;
        this.qtdeConsultas = 0;
    }

    public void mostraPaciente() {
        System.out.println("CADASTRO DE PACIENTES");
        System.out.println("====================");
        System.out.println("CPF: " + CPF);
        System.out.println("NOME: " + nome);
        System.out.println("DATA DE NASCIMENTO: " + dataNascimento);
        System.out.println("TELEFONE: " + telefone);
        System.out.println("ULTIMA CONSULTA: " + ultimaConsulta);
        System.out.println("QUANTIDADE DE CONSULTAS: " + qtdeConsultas);
    }

}