package JE_HW_1.Book;

public class Book {
    public static void main(String[] args) {
        Author author = new Author();
        Content content = new Content();
        Title title = new Title();

        title.setTitle("Java9");
        author.setAuthor("Герберт Шилдт");
        content.setContent("Девятое издание");

        title.show();
        author.show();
        content.show();
    }
}
