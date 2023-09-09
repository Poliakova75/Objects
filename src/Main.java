public class Main {
    public static void main(String[] args) {
        Author harari = new Author("Юваль", "Харари");
        Author pelevin = new Author("Виктор", "Пелевин");

        Book sapiens = new Book("Sapiens", harari, 2011);
        Book stuff = new Book("S.T.U.F.F", pelevin, 2010);

        System.out.println("Книга 1:");
        System.out.println("Название: " + sapiens.getTitle());
        System.out.println("Автор: " + sapiens.getAuthor().getFirstName() + " " + sapiens.getAuthor().getLastName());
        System.out.println("Год публикации: " + sapiens.getPublicationYear());

        System.out.println("\nКнига 2:");
        System.out.println("Название: " + stuff.getTitle());
        System.out.println("Автор: " + stuff.getAuthor().getFirstName() + " " + stuff.getAuthor().getLastName());
        System.out.println("Год публикации: " + stuff.getPublicationYear());

        // Изменяем год публикации первой книги
        sapiens.setPublicationYear(2005);

        System.out.println("\nИзмененная книга 1:");
        System.out.println("Название: " + sapiens.getTitle());
        System.out.println("Автор: " + sapiens.getAuthor().getFirstName() + " " + sapiens.getAuthor().getLastName());
        System.out.println("Год публикации: " + sapiens.getPublicationYear());
    }
}