package DesignPattern.Builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUserId("2")
                .setUserName("Ritu")
                .setEmailId("ritu@hg.com")
                .build();
        System.out.println(user);
        User user1 = new User.UserBuilder()
                .setUserId("9")
                .setUserName("Raj")
                .build();
        System.out.println(user1);
    }
}
