import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
   ServerSocket welcomeSocket;
   Server(int port){
       try {
           this.welcomeSocket = new ServerSocket(port);
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
   public Socket Accept() throws IOException {
       return welcomeSocket.accept();
   }
}
