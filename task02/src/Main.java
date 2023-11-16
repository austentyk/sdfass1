

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.InputStream;
import java.io.*;
import java.net.Socket;






public class Main {

    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("127.0.0.1", 3000);
        long reqID;
        int itemCount;
        float budget;
        int prod_id;
        String title;
        float price;
        int rating;
        float currbudget;

        



        final OutputStream os = socket.getOutputStream();
        final OutputStreamWriter osw = new OutputStreamWriter(os);
        final BufferedWriter bw = new BufferedWriter(osw);
        final InputStream is = socket.getInputStream();
        final InputStreamReader isr = new InputStreamReader(is);
        final BufferedReader br = new BufferedReader(isr);
    
        switch(args.length){

            case 0: {
             System.out.println("Connecting to localhost listening on port 3000");
             socket = new Socket("127.0.0.1", 3000);
             }

            case 1:{
            System.out.printf("Connecting to localhost listening on port %d \n", args[1]);
             socket = new Socket("127.0.0.1", Integer.parseInt(args[1]));
             }

            case 2: {
            System.out.printf("Connecting to %f listening on port %d \n", args[1], args[2]);
            socket = new Socket(args[1], Integer.parseInt(args[2]));
            }

            default:{

            System.out.println("Invalid parameters.");
             System.exit(1); }
        }
        
        

        

        


        String[] lines = br.readLine().trim().split("/n//s");

        String command;

        for (int x = 0; x <= lines.length; x++) {
            command = lines[x];

            switch (command) {

                case ("prod_start"): {
                Product itemOne = new Product(lines[x+1],lines[x+2],lines[x+3],lines[x+4]);

                }
                


            
                default: {}
                


            }

            

        }

        


        
        
        


        

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
