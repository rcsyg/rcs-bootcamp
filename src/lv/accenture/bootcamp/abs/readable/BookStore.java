package lv.accenture.bootcamp.abs.readable;

import java.util.ArrayList;
import java.util.Collections;

public class BookStore {

    public static void main(String[] args) {
        Readable journal = new Journal("Forbes", "Successful success...", "Forbes Media");
        Readable fictionBook = new Fiction("The Picture of Dorian Gray", "A lot of text inside",
                Collections.singletonList("Oscar Wilde"), "novel");
        Readable nonFictionBook = new NonFiction("Thinking, Fast and Slow", "Subj.",
                Collections.singletonList("Daniel Kahneman"), new ArrayList<>(), "GTD");

        System.out.println("journal = " + journal.describe());
        System.out.println("fictionBook = " + fictionBook.describe());
        System.out.println("nonFictionBook = " + nonFictionBook.describe());

    }

}
