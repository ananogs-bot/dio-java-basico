
public class SistemaMedida {

	public static void main(String[] args) {

		String sigla = "P";
		
		switch(sigla) {
			case "P", "p": {
				System.out.println("Pequeno");
				break;
			}
			case "M", "m": {
				System.out.println("Médio");
				break;
			}
			case "G", "g": {
				System.out.println("Grande");
				break;
			}
			default:
				System.out.println("Indefinido");
		}
	}

}
