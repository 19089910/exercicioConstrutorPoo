package Account;

public class conta {
    private int numero;
    private String titular;
    private double saldo;

    public conta(int numero, String titular, double saldoInicial){
        this.numero = numero;
        this.titular = titular;
        setSaldo(saldoInicial);/**isso e empapsulamento :                          da para ver uma linha onde os valores vao passar sendo
        //double depositoInical(X) = sc.nextDouble();-->                          (inica recebemdo um valor do usuario e armazenada em uma variavel "temporaria")
        //conta = new conta(...,depositoInical(X));-->                            (valor associado como parametro ao pelo construtor(que e publico) onde permite endentrar na classe conta)
        //public conta(...,double saldoInicial(Y)){-->                            (no contrutrotor e associado como parametro para dentro do construtor)
        //setSaldo(Z)(saldoInicial(X)); -->                                       (o valor e passado como parametro para o set)
        //public void setSaldo(z)(Double saldo(X)) {this.saldo(A) = saldo(X);}--> (por paametro e repassado para saldo variavel interna da classe conta)
        //private double saldo;                                                   (a declaracao da variavel conta)
        */
    }
    public conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Integer getNumero() {
        return numero;
    }
    public String getTitular() {
        return titular;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


    public void depodito(double valorDeposito){
        saldo += valorDeposito;
    }
    public void saque(double valorSaldo){
        saldo -= valorSaldo + 5.0;
    }

    public String toString() {
        return "conta " + numero +
                ", titular: " + titular +
                ", saldo: " + String.format("%.2f",saldo);
    }

}
