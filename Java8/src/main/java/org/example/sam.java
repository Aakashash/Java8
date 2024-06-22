package org.example;

import java.io.*;

public class sam {
    public static void main(String[] args) {
        try {
            String ss = null;
            Process p = Runtime.getRuntime().exec("cmd.exe /c start dir ");
//            BufferedWriter writeer = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
//            writeer.write("dir");
//            writeer.flush();
            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

            System.out.println("Here is the standard output of the command:\n");
            while ((ss = stdInput.readLine()) != null) {
                System.out.println(ss);
            }
            System.out.println("Here is the standard error of the command (if any):\n");
            while ((ss = stdError.readLine()) != null) {
                System.out.println(ss);
            }

        } catch (IOException e) {
            System.out.println("FROM CATCH" + e.toString());
        }

    }

}
