package singleton;

public class AppHighlander {
    public static void main(String[] args) {
        Highlander h1 = Highlander.getInstance();
        Highlander h2 = Highlander.getInstance();

        if(h1 == h2) {
            System.out.println("h1 == h2");
        }
    }
}