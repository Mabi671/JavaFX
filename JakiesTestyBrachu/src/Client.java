import java.io.IOException;
import java.net.Socket;

public class Client {
    Socket soc;
    Socket clientSocket;
    Client(int port, Server server) throws IOException {
        clientSocket = new Socket("localhost", port);
        soc = server.Accept();
    }

}
