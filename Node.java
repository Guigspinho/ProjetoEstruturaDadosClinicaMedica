public class Node {
    String pasta;
    Node pai;
    Node dir;
    Node esq;
    
    public Node (String pasta) {
        this.pasta = pasta;
        pai = dir = esq = null;
    }
    
    public void mostraNode() {
        System.out.println(pasta + " - ");
    }
}