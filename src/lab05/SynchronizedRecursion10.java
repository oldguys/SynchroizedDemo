package lab05;

/**
 * @Date: 2019/2/15 0015
 * @Author: ren
 * @Description: 可重入，递归锁
 */
public class SynchronizedRecursion10 {

    int a = 0;

    public static void main(String[] args) {
        SynchronizedRecursion10 synchronizedRecursion10 = new SynchronizedRecursion10();
        synchronizedRecursion10.method1();
    }

    public synchronized void method1() {
        System.out.println("这是method：a=" + a);
        if (a == 0) {
            a++;
            method1();
        }
    }
}


