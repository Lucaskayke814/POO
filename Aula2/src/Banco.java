public class Banco {
    public static void main(String[] args) {
        contaBancaria cli1;
        cli1 = new contaBancaria("Lucas", 1314, 631588);
        cli1.depositar(1000);
        System.out.print("Saldo: "+ cli1.mostraSaldo());
    }
}
