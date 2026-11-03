/*Guilherme Gomes Pinho - 10755529
Moabe Guedes - 10748053 */
public class Node {
    Paciente paciente;
    Node parent;
    Node right;
    Node left;
    
    Node(Paciente paciente) {
        this.paciente = paciente;
        left = right = parent = null;
    }

    public void mostraNo(){
        System.out.print(paciente.getNome() + " ");
    }  
}