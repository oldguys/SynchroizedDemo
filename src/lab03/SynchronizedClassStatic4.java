package lab03;

/**
 * @Date: 2019/2/15 0015
 * @Author: ren
 * @Description: 类锁的第一种形式：static形式
 */
public class SynchronizedClassStatic4 implements Runnable {

    public static void main(String[] args) {
        SynchronizedClassStatic4 instance1 = new SynchronizedClassStatic4();
        SynchronizedClassStatic4 instance2 = new SynchronizedClassStatic4();

        Thread thread1 = new Thread(instance1);
        Thread thread2 = new Thread(instance2);

        thread1.start();
        thread2.start();

        while (thread1.isAlive() || thread2.isAlive()) {
        }

        System.out.println("finish");
    }

    public static synchronized void method1(){
        System.out.println("类锁的第一种形式：static形式，线程："+Thread.currentThread().getName());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结束，线程："+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        method1();
    }
}
