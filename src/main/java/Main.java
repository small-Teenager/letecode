/**
 * @author Search
 * @version 1.0
 * @date 2019/9/12 14:11
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(200 * 300 * 400 * 500);
        System.out.println(200 * 300 * 400 * 500);

            a.start();
            a.join();
            b.start();
            b.join();
            c.start();


    }



    static Thread a = new Thread(new Runnable() {

        @Override
        public void run() {
            System.err.println("aaaa");
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.err.println("a1---a1----");
            System.out.println("t1");
        }
    });
    static Thread b = new Thread(new Runnable() {

        @Override
        public void run() {
            System.err.println("bbbb");
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.err.println("bbbb----");
            System.out.println("t2");
        }
    });
    static Thread c = new Thread(new Runnable() {

        @Override
        public void run() {
            System.err.println("cccc");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.err.println("cccc---cccc");
            System.out.println("t3");
        }
    });
}
