package br.com.tarefaEstruturaDeDados.estruturas;

import br.com.tarefaEstruturaDeDados.model.INomeavel;

public class IntNoSimples {
    INomeavel valor;
    IntNoSimples prox;
    public IntNoSimples(INomeavel ValorNo){
        valor = ValorNo;
        prox = null;
    }

}
