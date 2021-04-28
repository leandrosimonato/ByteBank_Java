public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoLeandro = new Conta(6646,969060);
		contaDoLeandro.deposita(100);
		contaDoLeandro.deposita(50);
		System.out.println(contaDoLeandro.getSaldo());

		boolean conseguiuRetirar = contaDoLeandro.saca(20);
		System.out.println(contaDoLeandro.getSaldo());
		System.out.println(conseguiuRetirar);

		Conta contaDaCarol = new Conta(6644,969063);
		contaDaCarol.deposita(1000);

		boolean sucessoTransferencia = contaDaCarol.transfere(300, contaDoLeandro);

		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");

		} else {
			System.out.println("faltou dinheiro");

		}
		System.out.println(contaDaCarol.getSaldo());
		System.out.println(contaDoLeandro.getSaldo());
	}

}