package Day49;

public class WarmUp {
    public static void main(String[] args) {

        AudioBook a1 = new AudioBook();
        a1.author = "Zlatan Ibrahimovic";
        a1.audioLength = 3;
        a1.chapterCount = 7;
        a1.pageCount = 300;
        a1.price = 12.99;
        a1.printAuthor();
        a1.play();

        PaperBook p1 = new PaperBook();
        p1.author = "Nido Ozil";
        p1.pageCount = 34;
        p1.chapterCount = 8;
        p1.weight = .750f;
        p1.hardCover = true;
        p1.printAuthor();





    }
}
