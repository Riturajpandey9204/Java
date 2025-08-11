package SolidPrinciples.LSP.BadCode;

public class Main {
    public static void main(String[] args) {
        File file = new ReadOnlyFile();
        file.read();
        // file.write(); This throws exception as it can't be done in readOnly file.
    }
}
