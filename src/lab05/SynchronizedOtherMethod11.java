package lab05;

/**
 * @Date: 2019/2/15 0015
 * @Author: ren
 * @Description: 可重入粒度测试：调用类内另外的方法
 */
public class SynchronizedOtherMethod11 {

    int a = 0;

    public static void main(String[] args) {
        SynchronizedOtherMethod11 synchronizedRecursion10 = new SynchronizedOtherMethod11();
        synchronizedRecursion10.method1();
    }

    public synchronized void method1() {
        System.out.println("这是 method1");
        method2();
    }
    public synchronized void method2() {
        System.out.println("这是 method2");
    }
}


