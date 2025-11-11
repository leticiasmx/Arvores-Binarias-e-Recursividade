# Arvores-Binarias-e-Recursividade

#  O que é recursividade?
Recursividade é uma técnica de programação onde uma função chama a si mesma para resolver um problema. Em vez de usar loops iterativos, a recursividade divide um problema complexo em subproblemas menores do mesmo tipo, até chegar a um caso base que pode ser resolvido diretamente.

# Como a recursividade é usada na percorrência (travessia) de uma árvore binária?
Na travessia de árvores binárias, a recursividade é natural porque cada nó pode ser visto como a raiz de uma subárvore.
Para percorrer uma árvore:
Caso base: Quando o nó atual é null (chegamos a uma folha ou árvore vazia);
Chamada recursiva: A função chama a si mesma para as subárvores esquerda e direita.

# Qual a diferença entre recursão e laço (for/while)?
Recursão: cada função chama a si mesma para resolver versões menores do mesmo problema, até chegar num caso base simples. É elegante para problemas naturalmente hierárquicos como árvores, mas consome mais memória devido à pilha de chamadas;
Laços: repetem o mesmo bloco de código de forma linear, controlando a repetição através de variáveis. São mais eficientes em memória e performance, mas podem tornar o código menos intuitivo para certos problemas.


