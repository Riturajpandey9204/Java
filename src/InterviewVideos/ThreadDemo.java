package InterviewVideos;

public class ThreadDemo {
    public static void main(String[] args) {
        // By Extending Thread class
        MyThread thread1 = new MyThread();
        thread1.start();
        // By implementing runnable interface, here we need to use "Thread"
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);// this is a additional things we need to do.
        thread2.start();
    }
}
