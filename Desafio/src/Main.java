import java.util.Scanner;

public class Main {

    public static String verificarComboCompleto(String[] servicosContratados, String[] servicos) {

        int parametro = 0;
        
        for (int i = 0; i < servicosContratados.length; i++) {
        	for(int j = 0; j < 3; j++) {
        		if(servicosContratados[i].equals(servicos[j])) {
            		parametro += 1;
        		}
        	}
        }

        if(parametro == 3) {
        	return "Combo Completo";
        } else {
        	return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] servicosContratados = input.split(",");
        String[] servicos = new String[] {"movel", "banda larga", "tv"};

        String resultado = verificarComboCompleto(servicosContratados, servicos);


        System.out.println(resultado);

        scanner.close();
    }
}
