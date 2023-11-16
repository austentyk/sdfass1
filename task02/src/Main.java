

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.InputStream;
import java.io.*;
import java.net.Socket;






public class Main {

    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("127.0.0.1", 3000);

        /* switch(args.length){

            case 0:
             System.out.println("Connecting to localhost listening on port 3000");
             socket = new Socket("127.0.0.1", 3000);
             break;

            case 1:
            System.out.printf("Connecting to localhost listening on port %d \n", args[1]);
             socket = new Socket("127.0.0.1", Integer.parseInt(args[1]));
             break;

            case 2:
            System.out.printf("Connecting to %f listening on port %d \n", args[1], args[2]);
            socket = new Socket(args[1], Integer.parseInt(args[2]));
            break;

            default:

            System.out.println("Invalid parameters.");
         System.exit(1);
        } */
        
        
        final OutputStream os = socket.getOutputStream();
        final OutputStreamWriter osw = new OutputStreamWriter(os);
        final BufferedWriter bw = new BufferedWriter(osw);
        final InputStream is = socket.getInputStream();
        final InputStreamReader isr = new InputStreamReader(is);
        final BufferedReader br = new BufferedReader(isr);
    
        




        String line = br.readLine();
        System.out.printf(">%s\n", line);


        

        os.close();
        osw.flush();
        osw.close();
        isr.close();
        is.close();
        bw.flush();
        socket.close();
        System.out.println("Socket closed");



        
    }
    
}
