import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Server server = new Server(6789);
        Client[] clients = new Client[10];
        for(int i =0; i < 10; i++)
        {
            clients[i] = new Client(6789, server);
        }
        for(Client client : clients)
        {
            new DataOutputStream(client.soc.getOutputStream()).writeBytes("eeee makrena" + '\n');
            System.out.println(new BufferedReader((new InputStreamReader(client.clientSocket.getInputStream()))).readLine());
        }

    }
}