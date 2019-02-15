package lab05;

/**
 * @Date: 2019/2/15 0015
 * @Author: ren
 * @Description: 可重入粒度测试：测试时线程级别还是类级别。结论：线程级别
 */
public class SynchronizedSuperClass12 {


    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.doSomeThing();
    }



    public synchronized void doSomeThing() {
        System.out.println("这是 method1");
    }

    public static class TestClass extends SynchronizedSuperClass12{
        @Override
        public synchronized void doSomeThing() {
            System.out.println("我是子类方法");
            super.doSomeThing();
        }
    }
}


