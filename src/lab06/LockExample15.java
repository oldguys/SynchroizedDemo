package lab06;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Date: 2019/2/12 0012
 * @Author: ren
 * @Description:
 */
public class LockExample15 {




    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();

        lock.lock();
        lock.unlock();
        lock.tryLock();
        lock.tryLock(1000, TimeUnit.SECONDS);
    }
}
