package SolidPrinciples.LSP.BadCode;

public class ReadOnlyFile implements File{

    @Override
    public void read() {
        System.out.println("Reading the file!!");
    }

    @Override
    public void write() {
        throw new UnsupportedOperationException("Write can't be done here");
    }
}
