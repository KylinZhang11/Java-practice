import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TcpClient {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost",8888);
        System.out.println("连接服务器成功！");

        OutputStream out = socket.getOutputStream();
        out.write("杨二娇我是你奶奶".getBytes());

        out.close();
        socket.close();
    }
}
