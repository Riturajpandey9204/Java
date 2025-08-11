package SolidPrinciples.LSP.GoodCode;

public class ReadableFile implements ReadOnly{

    public static void main(String[] args) {
        ReadOnly readOnly = new ReadOnly() {
            @Override
            public void read() {
                System.out.println("Reading !!");
            }
        };
    }

    @Override
    public void read() {
        
    }
}
