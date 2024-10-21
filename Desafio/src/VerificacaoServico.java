import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        String nomeServico = scanner.nextLine().trim();
        
        String entradaCliente = scanner.nextLine().trim();
        
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        String resultado = "";
                
        scanner.close();
        
        
        String[] servicos = new String[] {"movel", "fixa", "banda larga", "tv"};
        
        String escolhido = "";
        
        for(int i = 0; i < 4; i++) {
          if (nomeServico.equals(servicos[i])) {
            escolhido = servicos[i];
            break;
          }
        }
        
        
        //verificar se o cliente tem o serviço
        for(int i = 1; i < partes.length; i++) {
            if(partes[i].equals(escolhido)) {
              contratado = true;
              break;
            } else {
            	contratado = false;
            }
          }
        
        if (contratado) {
        	resultado = "Sim";
        } else {
        	resultado = "Nao";
        }
        
        System.out.println(resultado);
        }
}
