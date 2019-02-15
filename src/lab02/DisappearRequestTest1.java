package lab02;

/**
 * @Date: 2019/2/15 0015
 * @Author: ren
 * @Description:
 */
public class DisappearRequestTest1 implements Runnable {

    static int i = 0;


    public static void main(String[] args) throws InterruptedException {

        DisappearRequestTest1 instance = new DisappearRequestTest1();

        Thread thread1= new Thread(instance);
        Thread thread2= new Thread(instance);

        thread1.start();
        thread2.start();
        // Join 方法，该线程执行完才能开始
        thread1.join();
        thread2.join();

        System.out.println(i);

    }

    @Override
    public void run() {
        for (int j = 0; j < 100000; j++) {
            i++;
        }
    }
}
