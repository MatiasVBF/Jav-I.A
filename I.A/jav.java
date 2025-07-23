import java.util.Scanner;

public class CopilotoConversador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("👋 Olá! Sou seu Copiloto Java. Em que posso te ajudar hoje?");
        
        boolean conversando = true;

        while (conversando) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Dicas de estudo");
            System.out.println("2 - Sugestão de série");
            System.out.println("3 - Piada para animar");
            System.out.println("0 - Sair");

            String escolha = scanner.nextLine();

            switch (escolha) {
                case "1":
                    System.out.println("📚 Dica: Experimente usar o método de Pomodoro para manter o foco nos estudos.");
                    break;
                case "2":
                    System.out.println("🎬 Que tal assistir 'Dark'? Mistério, viagem no tempo e muitas reviravoltas.");
                    break;
                case "3":
                    System.out.println("😄 Por que o Java nunca é convidado para festas? Porque ele sempre trava na hora de dançar!");
                    break;
                case "0":
                    System.out.println("Até mais! 👋");
                    conversando = false;
                    break;
                default:
                    System.out.println("❌ Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
