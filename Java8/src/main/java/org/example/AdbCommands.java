package org.example;

import java.io.*;

public class AdbCommands {
    public static void main(String[] args) {
        String command = "cmd";
        Process p;
        try {
            p = Runtime.getRuntime().exec(command);
            //new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
            new Thread(new SyncPipe(p.getInputStream(), System.out)).start();
            PrintWriter stdin = new PrintWriter(p.getOutputStream());
            stdin.println("time");
            stdin.close();
            p.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}



