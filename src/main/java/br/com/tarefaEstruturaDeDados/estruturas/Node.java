package br.com.tarefaEstruturaDeDados.estruturas;

import br.com.tarefaEstruturaDeDados.model.INomeavel;

public class Node {
    int info;                   // Informação tipo inteiro
    INomeavel aluno;
    Node left;                  // Filho à esquerda
    Node right;                 // FIlho à direita
    Node(int info, INomeavel aluno) {            // Inicializa os atributos da classe
        this.info = info;       // Inicializa a informação com o parâmetro recebido
        this.aluno = aluno;
        this.left = null;       // Inicializa o filho à esquerda como vazio
        this.right = null;      // Inicializa o filho à direita como vazio
    }

}
