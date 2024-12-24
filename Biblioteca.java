import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public boolean removerLivro(String ISBN) {
        for (Livro livro : livros) {
            if (livro.getISBN().equals(ISBN)) {
                livros.remove(livro);
                return true;
            }
        }
        return false;
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
        } else {
            System.out.println("Lista de livros:");
            for (Livro livro : livros) {
                System.out.println("Título: " + livro.getTitulo());
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("ISBN: " + livro.getISBN());
                System.out.println("------------------------");
            }
        }
    }
}
