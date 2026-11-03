public class Paciente {
    private String CPF;
    private String nome;
    private String dataNascimento;
    private String telefone;
    private String ultimaConsulta;
    private int qtdeConsultas;

    public Paciente (String CPF, String nome, String dataNascimento, String telefone) {
        this.telefone = telefone;
        this.CPF = CPF;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.ultimaConsulta = null;
        this.qtdeConsultas = 0;
    }

    public Paciente (String CPF, String nome, String dataNascimento, String telefone, String ultimaConsulta, int qtdeConsultas) {
        this.telefone = telefone;
        this.CPF = CPF;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.ultimaConsulta = ultimaConsulta;
        this.qtdeConsultas = qtdeConsultas;
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

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }
}