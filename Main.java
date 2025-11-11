package arvorebinaria;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        
        System.out.println("Inserção dos valores");
        int[] valores = {50, 30, 70, 20, 40, 60, 80};
        
        for (int valor : valores) {
            System.out.println("Inserindo: " + valor);
            arvore.inserir(valor);
        }
        
        System.out.println("percursos");
        
        System.out.print("Pré-ordem: ");
        arvore.preOrdem();
        
        System.out.print("Em ordem: ");
        arvore.emOrdem();
        
        System.out.print("Pós-ordem: ");
        arvore.posOrdem();
        
        System.out.println("busca de valores");
        int[] buscaValores = {40, 90, 20, 100};
        
        for (int valor : buscaValores) {
            boolean encontrado = arvore.buscar(valor);
            System.out.println("Valor " + valor + ": " + (encontrado ? "Encontrado" : "Não encontrado"));
        }
        
        System.out.println("Estrutura da árvore");
        System.out.println("       50");
        System.out.println("     /    \\");
        System.out.println("   30      70");
        System.out.println("  /  \\    /  \\");
        System.out.println("20   40  60   80");
    }
}
