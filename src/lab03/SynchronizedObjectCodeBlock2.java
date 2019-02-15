package lab03;

/**
 * @Date: 2019/2/15 0015
 * @Author: ren
 * @Description: 对象锁示例：代码块形式
 */
public class SynchronizedObjectCodeBlock2 implements Runnable {

    public static void main(String[] args) {
        SynchronizedObjectCodeBlock2 instance = new SynchronizedObjectCodeBlock2();

        Thread thread1 = new Thread(instance);
        Thread thread2 = new Thread(instance);

        thread1.start();
        thread2.start();

        while (thread1.isAlive() || thread2.isAlive()) {
        }

        System.out.println("finish");
    }

    @Override
    public void run() {
        synchronized (this){
            System.out.println("我是对象锁的代码块形式。我叫：" + Thread.currentThread().getName());

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"\t 运行结束");
        }

    }
}
