package ufpb.br.sisbanco;

public class Banco {
private String nome;
private String cnpj;
private Conta [] contas;
private int maxContas;
private int numContas;
public Banco() {
this.nome = "";
this.cnpj = "";
this.maxContas = 1000;
this.contas = new Conta[maxContas];
this.numContas = 0;
}
public Banco(String nome, String cnpj, Conta[] contas) {
this.nome = nome;
this.cnpj = cnpj;
this.setContas(contas);

}
public void abrirConta(String cpfTitular, String numConta, String numAgencia, double
saldoInicial) {

Conta c = new Conta(cpfTitular, numConta, numAgencia,saldoInicial);
this.contas[numContas] = c;
numContas++;
//TODO: Lembrar de checar limite máximo e se conta existe
}
public double sacarDeConta(String numConta, String numAgencia, double valor) {
for (int k=0; k<this.numContas; k++) {
if (this.contas[k].getNumeroConta().equals(numConta) &&

this.contas[k].getNumeroAgencia().equals(numAgencia)) {
return this.contas[k].debitar(valor);
}
}
//TODO: tratar erro
return -1;
}
public double depositarEmConta(String numConta, String numAgencia, double valor) {
for (int k=0; k<this.numContas; k++) {
if (this.contas[k].getNumeroConta().equals(numConta) &&

this.contas[k].getNumeroAgencia().equals(numAgencia)) {
return this.contas[k].creditar(valor);
}
}
//TODO: tratar erro
return -1;
}
public Conta[] getContas() {
return this.contas;
}
public void setContas(Conta [] contas) {
this.contas = contas;
this.maxContas = this.contas.length;
this.numContas = 0;
for (int k=0; k<maxContas; k++) {
if (this.contas[k] == null) {
break;
} else {
this.numContas++;
}
}
}
public String getNome() {
return this.nome;
}
public String getCnpj() {
return this.cnpj;
}
public void setNome(String nome) {
this.nome = nome;
}
public void setCnpj(String cnpj) {

this.cnpj = cnpj;
}
}
