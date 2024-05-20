package br.com.tarefaEstruturaDeDados.estruturas;

import br.com.tarefaEstruturaDeDados.model.INomeavel;

public class Arvore {
	 Node root = null;
	    int qtde=0;// Nó pai, ou raíz
	    
	    boolean vazia(Node place){
	        if (place == null)
	            return true;
	        else
	            return false;
	    }
	    void insert(int info, Node place,INomeavel aluno) {             // algoritmo para inserir uma informação
	        if (place == null) {                        // Se o local está vazio, então a árvore está vazia
	            root = new Node(info,aluno);                  // e o root vai receber o novo nó
//	            System.out.print(aluno.toString());           // Imprime a informação inserida
	        }else if (info < place.info) {             // Senão, se a informação é menor do que a do local
	            if (place.left == null) {               // Se o filho da esquerda está vazio
	                place.left = new Node(info,aluno);        // Então insere à esquerda o novo nó
//	                System.out.print(aluno.toString());       // Imprime a informação inserida
	            } else {                                // São, se não for vazio
	                insert(info, place.left,aluno);           // Pula para o filho à esquerda usando a recursividade
	            }
	        } else if (info > place.info) {             // Senão, se a informação é maior que a do local
	            if (place.right == null) {              // Se o filho à direita está vazio
	                  place.right = new Node(info,aluno);       // Insere a informação em um novo nó à direita
//	                  System.out.print(aluno.toString());       // e imprime a informação
	            } else {                                // Senão, se o nó à direita não está vazio
	                insert(info, place.right,aluno);          // Pula para o filho à direita usando a recursividade
	            }
	        }
	    }
	    
	    void preOrder(Node place) {                     // Algoritmo de navegação em pré ordem
	        System.out.print(" " + place.aluno.toString());         // Primeiro imprime a informação do nó
	        if (place.left != null) {                   // Se o filho à esquerda não está vazio
	            preOrder(place.left);                   // Pula para o filho à esquerda pela recursividade
	        }
	        if (place.right != null) {                  // Se filho à direita não está vazio
	            preOrder(place.right);                  // Pula para o filho à direita pela recursividade
	        }
	    }
	    
	    void inOrder(Node place) {                     // Algoritmo de navegação em pré ordem
	        
	 	        if (place.left != null) {                   // Se o filho à esquerda não está vazio
		            inOrder(place.left);                   // Pula para o filho à esquerda pela recursividade
		        }
		        System.out.println(place.aluno.toString());        
		        if (place.right != null) {                  // Se filho à direita não está vazio
		            inOrder(place.right);                  // Pula para o filho à direita pela recursividade
		        }
				

	    }
	    void inOrderPilha(Node place, Pilha pilha) {                     // Algoritmo de navegação em pré ordem
	         
	 	        if (place.left != null) {                   // Se o filho à esquerda não está vazio
		            inOrderPilha(place.left,pilha);                   // Pula para o filho à esquerda pela recursividade
		        }

		        pilha.empilhar(place.aluno);
		        if (place.right != null) {                  // Se filho à direita não está vazio
		            inOrderPilha(place.right,pilha);                  // Pula para o filho à direita pela recursividade
		        }
				

	    }

	    int qtdeElementos(Node place) {
	        qtde++;
	        // Algoritmo de navegação em ordem
	        if (place.left != null) {                   // Se o filho à esquerda não está vazio
	            qtdeElementos(place.left);                    // Pula para o filho à esquerda pela recursividade
	        }
	               // Depois imprime a informação do nó
	        if (place.right != null) {                  // Se filho à direita não está vazio
	            qtdeElementos(place.right);                   // Pula para o filho à direita pela recursividade
	        }
	        return(qtde);
	    }
	    void postOrder(Node place) {                    // Algoritmo de navegação em pós ordem
	        if (place.left != null) {                   // Se o filho à esquerda não está vazio
	            postOrder(place.left);                  // Pula para o filho à esquerda pela recursividade
	        }
	        if (place.right != null) {                  // Se filho à direita não está vazio
	            postOrder(place.right);                 // Pula para o filho à direita pela recursividade
	        }
	        System.out.print(place.aluno.toString());         // Por último, imprime a informação do nó
	    }

}
