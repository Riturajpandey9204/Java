package DesignPattern.Prototype;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creating object via prototype design pattern");
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("198.45.54.06");
        networkConnection.loadImpData();
        System.out.println(networkConnection);

        //cloning imp Data since it is taking time
        NetworkConnection networkConnection1 = null;
        try {
            networkConnection1 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection1);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
