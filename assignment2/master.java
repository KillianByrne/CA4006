import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


/**
* Written by Martin Ombura Jr. <@martinomburajr>
*/
public class master{

    int socket = 9991;

    public static void main(String[] args) {
        Runnable server1 = new node(9991);
        Thread serverthread1 = new Thread(server1);
        serverthread1.start();
        Runnable server2 = new node(9992);
        Thread serverthread2 = new Thread(server2);
        serverthread2.start();
        
        
    }
}
