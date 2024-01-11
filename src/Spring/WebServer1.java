package Spring;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//간단한 8080 웹서버 생성
public class WebServer1 {
    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(8081);
            System.out.println("8081 서비스 시작");
            while (true){
                try(Socket socket = serverSocket.accept()){
                    String httpRes = "HTTP/1.1 200 OK\r\n\r\n" + "Hello World";
                    socket.getOutputStream().write(httpRes.getBytes("UTF-8"));
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
