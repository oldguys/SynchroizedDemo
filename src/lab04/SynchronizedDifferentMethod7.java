package lab04;

/**
 * @Date: 2019/2/15 0015
 * @Author: ren
 * @Description: 同时访问同步方法和非同步方法
 */
public class SynchronizedDifferentMethod7 implements Runnable {

    public static void main(String[] args) {
        SynchronizedDifferentMethod7 instance1 = new SynchronizedDifferentMethod7();

        Thread thread1 = new Thread(instance1);
        Thread thread2 = new Thread(instance1);

        thread1.start();
        thread2.start();

        while (thread1.isAlive() || thread2.isAlive()) {
        }

        System.out.println("finish");
    }

    public synchronized void method1(){

        System.out.println("加锁方法 method1，线程："+Thread.currentThread().getName());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结束，线程："+Thread.currentThread().getName());
    }

    public synchronized void method2(){

        System.out.println("加锁方法 method2，线程："+Thread.currentThread().getName());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结束，线程："+Thread.currentThread().getName());
    }

    @Override
    public void run() {

        if(Thread.currentThread().getName().equals("Thread-0")){
            method1();
        }else{
            method2();
        }
    }
}
