package lab03;

/**
 * @Date: 2019/2/15 0015
 * @Author: ren
 * @Description: 对象锁示例：方法锁形式
 */
public class SynchronizedObjectMethod3 implements Runnable {

    public static void main(String[] args) {
        SynchronizedObjectMethod3 instance = new SynchronizedObjectMethod3();

        Thread thread1 = new Thread(instance);
        Thread thread2 = new Thread(instance);

        thread1.start();
        thread2.start();

        while (thread1.isAlive() || thread2.isAlive()) {
        }

        System.out.println("finish");
    }

    public synchronized void method1(){
        System.out.println("对象锁——方法修饰符形式，线程："+Thread.currentThread().getName());

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
