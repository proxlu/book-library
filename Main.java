import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu da Biblioteca ---");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Remover livro");
            System.out.println("3. Listar livros");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir newline

            switch (opcao) {
                case 1:
                    System.out.println("Digite o título do livro:");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite o autor do livro:");
                    String autor = scanner.nextLine();
                    System.out.println("Digite o ISBN do livro:");
                    String ISBN = scanner.nextLine();
                    Livro livro = new Livro(titulo, autor, ISBN);
                    biblioteca.adicionarLivro(livro);
                    System.out.println("Livro adicionado com sucesso.");
                    break;
                case 2:
                    System.out.println("Digite o ISBN do livro a ser removido:");
                    String ISBNRemover = scanner.nextLine();
                    if (biblioteca.removerLivro(ISBNRemover)) {
                        System.out.println("Livro removido com sucesso.");
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 3:
                    biblioteca.listarLivros();
                    break;
                case 4:
                    System.out.println("Saindo da biblioteca. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
