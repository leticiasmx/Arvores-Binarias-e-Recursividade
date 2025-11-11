package arvorebinaria;

public class ArvoreBinaria {
    private Node raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private Node inserirRec(Node no, int valor) {
        if (no == null) {
            no = new Node(valor);
            return no;
        }

        if (valor < no.valor) {
            no.esquerda = inserirRec(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserirRec(no.direita, valor);
        }
        
        return no;
    }

    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(Node no, int valor) {
        if (no == null) {
            return false;
        }

        if (no.valor == valor) {
            return true;
        }

        if (valor < no.valor) {
            return buscarRec(no.esquerda, valor);
        } else {
            return buscarRec(no.direita, valor);
        }
    }
 
    public void preOrdem() {
        preOrdemRec(raiz);
        System.out.println(); 
    }

    private void preOrdemRec(Node no) {
        if (no == null) {
            return;
        }

        System.out.print(no.valor + " ");

        preOrdemRec(no.esquerda);

        preOrdemRec(no.direita);
    }
 
    public void emOrdem() {
        emOrdemRec(raiz);
        System.out.println(); 
    }

    private void emOrdemRec(Node no) {
        if (no == null) {
            return;
        }
        
        emOrdemRec(no.esquerda);
 
        System.out.print(no.valor + " ");

        emOrdemRec(no.direita);
    }

    public void posOrdem() {
        posOrdemRec(raiz);
        System.out.println(); 
    }

    private void posOrdemRec(Node no) {
        if (no == null) {
            return;
        }

        posOrdemRec(no.esquerda);

        posOrdemRec(no.direita);

        System.out.print(no.valor + " ");
    }
}
