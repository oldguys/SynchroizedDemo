package lab06;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Date: 2019/2/12 0012
 * @Author: ren
 * @Description:
 */
public class SynchronizedToLock13 {

    Lock lock = new ReentrantLock();

    public synchronized void method1(){
        System.out.println("我是Synchronized形式的锁");
    }

    public void method2(){
        lock.lock();
        try {
            System.out.println("我是Lock形式的锁");
        }finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) {
        SynchronizedToLock13 synchroizedToLock13 = new SynchronizedToLock13();

        synchroizedToLock13.method1();
        synchroizedToLock13.method2();
    }
}
