import java.lang.classfile.ClassSignature;

public class SyncTicketDemo {
    public static void main(String[] args) {
        TicketTask task = new TicketTask();

        Thread window1 = new Thread(task, "窗口1");
        Thread window2 = new Thread(task, "窗口2");
        Thread window3 = new Thread(task, "窗口3");

        window1.start();
        window2.start();
        window3.start();
    }
}
class TicketTask implements Runnable{
    private int tickets = 100;
    private final Object lock = new Object();
    public void run(){
        while (true){
            synchronized (lock){
                if(tickets > 0){
                    System.out.println(Thread.currentThread().getName() + " 卖出了第 " + tickets + " 张票");
                    tickets--;
                }else break;
            }
        }
    }
}
