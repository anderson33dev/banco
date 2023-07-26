package com.algaworks.banco.app;

import com.algaworks.banco.modelo.*;

public class Principal {

    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("João da Silva");
        titular1.setDocumento("06375600011");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria das Dores");
        titular2.setDocumento("11122255544499");

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaInvestimento minhaConta = new ContaInvestimento(titular1, 547, 222);
        ContaEspecial suaConta = new ContaEspecial(titular2, 982, 555, 1000);

        minhaConta.depositar(15000);
        minhaConta.sacar(1000);
        minhaConta.creditarRendimento(0.8);
        minhaConta.debitarTarifaMensal();

        suaConta.depositar(15000);
        suaConta.sacar(15500);
        suaConta.debitarTarifaMensal();

        caixaEletronico.imprimirSaldo(minhaConta);
        System.out.println();
        caixaEletronico.imprimirSaldo(suaConta);


    }
}
