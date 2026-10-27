import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Clinica {

    private Vetor <Paciente> pacientes;
    Scanner entrada = new Scanner(System.in);
    Boolean pacientesCarregados = false;



    public void exibirMenu() throws Exception {
        int selecaoMenu;

        do {
            System.out.println("\n=== Clínica Mack ===");
            System.out.println("1. Carregar pacientes");
            System.out.println("2. Consultar pacientes (CPF)");
            System.out.println("3. Registrar chegada para atendimento");
            System.out.println("4. Exibir fila de espera");
            System.out.println("5. Chamar próximo paciente");
            System.out.println("6. Relatório de atendimentos realizados no dia");
            System.out.println("7. Listar pacientes em ordem alfabética");
            System.out.println("8. Salvar cadastros atualizados em TXT");
            System.out.println("9. Funcionalidade adicional (atualizar futuramente)");
            System.out.println("10. Sair");
            System.out.println("========================================\n");
            System.out.print("Selecione uma opção: ");

            while (entrada.hasNextInt() == false) {
                System.out.println("Opção inválida. Digite um número de 1 a 7.");
                entrada.next();
            }
            selecaoMenu = entrada.nextInt();
            entrada.nextLine();

            switch (selecaoMenu) {

                case 1:
                    if (pacientesCarregados == false) {
                        carregaTXT();
                        System.out.println("Pacientes Carregados");
                    }
                    if (pacientesCarregados == true) {
                        System.out.println("Pacientes já foram carregados.");
                    }
                    break;

                case 2:
                    if (pacientesCarregados == false) {
                        System.out.println("É necessário carregar os pacientes antes de acessar essa opção.");
                        break;
                    }
                    consultarPaciente();
                    break;

                case 3:
                    if (pacientesCarregados == false) {
                        System.out.println("É necessário carregar os pacientes antes de acessar essa opção.");
                        break;
                    }
                    registrarChegada();
                    break;

                case 4:
                    if (pacientesCarregados == false) {
                        System.out.println("É necessário carregar os pacientes antes de acessar essa opção.");
                        break;
                    }
                    exibirFilaEspera();
                    break;

                case 5:
                    if (pacientesCarregados == false) {
                        System.out.println("É necessário carregar os pacientes antes de acessar essa opção.");
                        break;
                    }
                    chamarProxPaciente();
                    break;

                case 6:
                    if (pacientesCarregados == false) {
                        System.out.println("É necessário carregar os espetáculos antes de acessar essa opção.");
                        break;
                    }
                    relatorioDiario();
                    break;

                case 7:
                    if (pacientesCarregados == false) {
                        System.out.println("É necessário carregar os espetáculos antes de acessar essa opção.");
                        break;
                    }
                    listarPacientes();
                    break;

                case 8:
                    if (pacientesCarregados == false) {
                        System.out.println("É necessário carregar os espetáculos antes de acessar essa opção.");
                        break;
                    }
                    atualizarTXT();
                    break;

                case 9:
                    if (pacientesCarregados == false) {
                        System.out.println("É necessário carregar os espetáculos antes de acessar essa opção.");
                        break;
                    }
                    funcAdicional();
                    break;

                case 10:
                    System.out.println("Grupo: Guilherme Pinho - Moabe Guedes\nSistema Finalizado");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
            }

        } while (selecaoMenu != 7);
    }


   


    public void carregaTXT() throws Exception {
        FileReader arquivo = new FileReader("dadosEspetaculos.txt");
        BufferedReader linha = new BufferedReader(arquivo);
        String aux = linha.readLine();
        int cont = 0;
        while (aux != null) {
            String[] vet = aux.split(";");
            Paciente p1 = new Paciente(Integer.parseInt(vet[0]), vet[1], vet[2], vet[3], Double.parseDouble(vet[4]));
            pacientes.add(cont, p1);
            cont++;
            aux = linha.readLine();
        }
        pacientesCarregados = true;
        arquivo.close();
    }

    //Métodos para implementação
     private void consultarPaciente() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultarPaciente'");
    }

    private void registrarChegada() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registrarChegada'");
    }

    private void exibirFilaEspera() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirFilaEspera'");
    }

    private void chamarProxPaciente() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chamarProxPaciente'");
    }

    private void relatorioDiario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'relatorioDiario'");
    }

    private void listarPacientes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarPacientes'");
    }

    private void atualizarTXT() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarTXT'");
    }

    private void funcAdicional() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'funcAdicional'");
    }

}