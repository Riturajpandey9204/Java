package DesignPattern.Prototype;

public class NetworkConnection implements Cloneable{
    private String ip;
    private String impData;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImpData() {
        return impData;
    }

    public void setImpData(String impData) {
        this.impData = impData;
    }

    public void loadImpData() throws InterruptedException {
        this.impData = "Imp data";
        // this is taking 5 mins
        Thread.sleep(2000);
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", impData='" + impData + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
