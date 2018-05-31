
public class Main {

	public static void main(String[] args) {
		MesMessages monMessage = new MesMessages();
		System.out.println(monMessage.getMessage1());
		monMessage.setMessage1("coucou");

		for (int i = 0; i < 10; i++) {
			System.out.println(monMessage.getMessage1());

		}

	}

}