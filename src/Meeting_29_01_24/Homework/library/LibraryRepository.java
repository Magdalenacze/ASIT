package Meeting_29_01_24.Homework.library;

import java.io.*;
import java.util.List;

public class LibraryRepository {

    private ObjectOutputStream bookOutput;
    private ObjectInputStream bookInput;

    public LibraryRepository() throws IOException {
        bookInput = new ObjectInputStream(new FileInputStream("libraryRepository"));
    }

    public void writingToAFile(List<Book> books) {
        try
        {
            bookOutput = new ObjectOutputStream(new FileOutputStream("libraryRepository"));
            bookOutput.writeObject(books);
            bookOutput.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public List<Book> readingFromfile() {
        try {
            List<Book> books = (List<Book>) bookInput.readObject();
            bookInput.close();
            return books;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
