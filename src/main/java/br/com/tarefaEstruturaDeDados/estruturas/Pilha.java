package br.com.tarefaEstruturaDeDados.estruturas;

import javax.swing.JOptionPane;

import br.com.tarefaEstruturaDeDados.model.INomeavel;

public class Pilha {
	//Declarando os atributos da classe
    int topo;
    int tamanho;
    INomeavel vetor[];
    
    Pilha(int tam){
        topo = -1; //Marca que a pilha está vazia
        tamanho = tam;
        vetor = new INomeavel[tam];
    }
    public boolean vazia(){
        if (topo == -1)
            return true;
        else
            return false;
    }
    public boolean cheia(){
        if(topo == tamanho -1)
            return true;
        else
            return false;
    }
    public void empilhar(INomeavel elem){
        if (cheia() == false){
            topo++;
            vetor[topo]= elem;
        }
        else{

        }
    }
    public Object desempilhar(){
        Object valorDesempilhado;
        if(vazia() == true){
            valorDesempilhado = "Pilha Vazia";
        }
        else{
            valorDesempilhado = vetor[topo]; 
            topo--;
        }
        return valorDesempilhado;
    }
    public void ExibePilha(){
        if(vazia() == true){
        	System.out.println("Essa é a lista");

        }
        else{
            for(int i=topo; i>=0; i--){
                System.out.println("Nome: " + vetor[i].getNome() + "Distancia: " + vetor[i].getDistancia() + "Km");
            }
        }
    }

}
