/*Guilherme Gomes Pinho - 10755529
Moabe Guedes - 10748053 */
class BinaryTree {
    
    Node raiz;
    
    public BinaryTree() {
        //cria arvore vazia
        raiz = null;
    }
    
    public boolean isEmpty() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void addRoot (Node x) throws Exception {
        //adicione o nó x como raiz da arvore
        if (raiz != null) {
            throw new Exception("Erro - A árvore já tem uma raiz");
        }
        raiz = x;
    }
    
    public Node root() {
        return raiz;
    }
    
    public boolean isInternal(Node x) {
        //verificar se o nó x é Interno
        if (x.esq != null || x.dir != null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isLeaf (Node x) {
        //verifica se nó x é folha
        if (x.esq == null && x.dir == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void addLeft(Node x, Node y) throws Exception {
        //adiciona o nó x como filho esquerdo de y
        if (hasLeft(y)) {
            throw new Exception ("Erro - o nó já tem filho esquerdo!");
        }
        x.pai = y;
        y.esq = x;
    }
    
    public void addRight(Node x, Node y) throws Exception {
        //adiciona o nó x como filho direito de y
        if (hasRight(y)) {
            throw new Exception ("Erro - o nó já tem filho direito!");
        }
        x.pai = y;
        y.dir = x;
    }
    
    public boolean hasLeft (Node x) {
        //verifica se o nó x tem filho a esquerda
        if (x.esq != null) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean hasRight (Node x) {
        //verifica se o nó x tem filho a direita
        if (x.dir != null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void remove (Node x) {
        //remove o nó x e todos os seus descendentes
        if (raiz == x) {
            raiz = null;
        } else {
            if(x.pai.esq == x) {
                x.pai.esq = null;
            } else {
                x.pai.dir = null;
            }
        }
    }
}