public class TestaContaComExcecaoChequed {
	public static void main(String[] args) {
		Conta c = new Conta();
		try {
			c.deposita();
		} catch (MinhaExcecao e) {
			System.out.println("Tratamento.....");
			e.printStackTrace();
		}
	}
}