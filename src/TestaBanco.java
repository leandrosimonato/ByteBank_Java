public class TestaBanco {
	public static void main(String[] args) {
		Cliente leandro = new Cliente();
		leandro.setNome("Leandro Simonato");
		leandro.setCpf("222.222.222.-22");
		leandro.setProfissao("programador");

		Conta contaDoPaulo = new Conta(6646,969060);
		contaDoPaulo.deposita(100);

		contaDoPaulo.setTitular(leandro);
		System.out.println(contaDoPaulo.getTitular().getNome());
		System.out.println(contaDoPaulo.getTitular());

	}
}