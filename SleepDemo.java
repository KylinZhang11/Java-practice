public class SleepDemo {
    public static void main(String[] args) throws Exception{
        for (int i = 5; i > 0; i--){
            System.out.println("倒计时：" + i);
            Thread.sleep(1000);
        }
        System.out.println("嘀嘀嘀 倒计时结束");
    }
}
