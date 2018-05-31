

public class Main {

	public static void main(String[] args) {
		MesMessages monMessage = new MesMessages();
		System.out.println(monMessage.getMessage1());
		monMessage.setMessage1("coucou");
		System.out.println(monMessage.getMessage1());
	}

}
