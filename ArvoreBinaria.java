package arvorebinaria;

public class ArvoreBinaria {
    private Node raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private Node inserirRec(Node no, int valor) { //caso base
        if (no == null) {
            no = new Node(valor);
            return no;
        }

        if (valor < no.valor) {
            no.esquerda = inserirRec(no.esquerda, valor); // Chamada recursiva esquerda
        } else if (valor > no.valor) {
            no.direita = inserirRec(no.direita, valor); // Chamada recursiva direita
        }
        
        return no;
    }

    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(Node no, int valor) {
        if (no == null) { // Caso base 1: valor não encontrado
            return false;
        }

        if (no.valor == valor) { // Caso base 2: valor encontrado
            return true;
        }

        if (valor < no.valor) {
            return buscarRec(no.esquerda, valor); // Busca recursiva na esquerda
        } else {
            return buscarRec(no.direita, valor); // Busca recursiva na direitaa
        }
    }
 
    public void preOrdem() {
        preOrdemRec(raiz);
        System.out.println(); 
    }

    private void preOrdemRec(Node no) {
        if (no == null) { // Caso base: nó nulo, retorna
            return;
        }

        System.out.print(no.valor + " ");

        preOrdemRec(no.esquerda);   // Recursão na subárvore esquerda

        preOrdemRec(no.direita);    // Recursão na subárvore direita
    }
 
    public void emOrdem() {
        emOrdemRec(raiz);
        System.out.println(); 
    }

    private void emOrdemRec(Node no) {
        if (no == null) {  // Caso base: nó nulo, retorna
            return;
        }
        
        emOrdemRec(no.esquerda);   // Recursão esquerda (primeiro)
 
        System.out.print(no.valor + " ");   // Raiz no meio

        emOrdemRec(no.direita);  // Recursão direita (último)
    }

    public void posOrdem() {
        posOrdemRec(raiz);
        System.out.println(); 
    }

    private void posOrdemRec(Node no) {
        if (no == null) { // Caso base: nó nulo, retorna
            return;
        }

        posOrdemRec(no.esquerda);   // Recursão esquerda (primeiro)

        posOrdemRec(no.direita);    // Recursão direita (segundo)

        System.out.print(no.valor + " ");      // Raiz por último
    }
}
