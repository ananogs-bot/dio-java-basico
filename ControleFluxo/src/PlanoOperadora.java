
public class PlanoOperadora {

	public static void main(String[] args) {
		String plano = "M";
		
		/* if(plano == "B" || plano == "b") {
			System.out.println("100 minutos de ligação");
		} else if (plano == "M" || plano == "m") {
			System.out.println("100 minutos de ligação");
			System.out.println("Whats e Instagram grátis");
		} else if (plano == "T" || plano == "t") {
			System.out.println("100 minutos de ligação");
			System.out.println("Whats e Instagram grátis");
			System.out.println("5GB YouTube");
		} */
		
		switch (plano) {
			case "T", "t": {
				System.out.println("5GB de YouTube + ");	
			}
			
			case "M", "m": {
				System.out.println("WhatsApp e Instagram grátis +");
			}
			
			case "B", "b": {
				System.out.println("100 minutos de ligação!");
				break;
			}
		}
	}
}
