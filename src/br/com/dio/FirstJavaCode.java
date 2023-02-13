package br.com.dio;
import br.com.dio.model.Gato;
public class FirstJavaCode {
    public static void main(String[] args) {

        Gato gato = new Gato();

        System.out.println(gato);

        book = new Book(name:
    }
}

class Book {
    private String name;
    private Integer numPages;

    public Book(String name, Integer numPages) {
        this.name = name;
        this.numPages = numPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumPages() {
        return numPages;
    }

    public void setNumPages(Integer numPages) {
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", numPages=" + numPages +
                '}';
    }
}
