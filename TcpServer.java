import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端已启动，等待客户端连接");

        Socket socket = serverSocket.accept();
        System.out.println("有客人连进来了！IP是" + socket.getInetAddress().getHostAddress());

        InputStream in = socket.getInputStream();
        byte[] buffer = new byte[1024];
        int len = in.read(buffer);

        System.out.println("客户端消息是:" + new String(buffer,0,len));

        in.close();
        socket.close();
        serverSocket.close();
    }
}
