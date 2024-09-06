public class Conta_G1M {
    private String numero;
    private String cpf;
    private double saldo;
    private double limite;
    private double limiteUtilizado;

    public Conta_G1M(String numero, String cpf, double  saldo, double limite)
    {
        this.numero = numero;
        this.cpf = cpf;
        this.saldo = saldo;
        this.limite = limite;
        this.limiteUtilizado = this.limite;
    }

    public boolean depositar (double valor)
    {
        if (valor < 0){
         return false;
        }
        if(this.saldo < 0){
            aumentaLimite(valor);
            this.saldo = aplicarTaxa() + valor;
            return true;
        }
        this.saldo += valor;
            return true;
    }

    private void aumentaLimite(double valor)
    {
        if(this.limiteUtilizado < this.limite){
            this.limiteUtilizado += valor;

            if(this.limiteUtilizado > this.limite){
                this.limiteUtilizado = this.limite;
            }
        }
    }

    private  boolean validarSaque(double valor)
    {
        if (valor <= this.saldo + this.limiteUtilizado)
            return true;
        return false;
    }

    public boolean sacar(double valor)
    {
        if (validarSaque(valor)){
            descontarLimite(valor);
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    private  void descontarLimite(double valor)
    {

        if(this.saldo < valor){
            this.limite += this.saldo-valor;
        }
    }

    private double aplicarTaxa( )
    {
        return this.saldo*1.03;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public double getLimiteUtilizado(){
        return this.limiteUtilizado;
    }

    public String imprimirExtrato(){
        return "Saldo: " + this.saldo + "\nLimite Utilizado: " + this.limite + "\nLimite utilizado:" + (this.limite - this.limiteUtilizado);
    }

    public static void main(String[] args) 
    {
        Conta_G1M c = new Conta_G1M("0", "000", 200, 100);
        
        c.sacar(250);
        System.out.println(c.imprimirExtrato());

        c.depositar(25);
        System.out.println(c.imprimirExtrato());

        c.depositar(50);
        System.out.println(c.imprimirExtrato());   
    }
}
