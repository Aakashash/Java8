package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class n {

        public static void main(String args[]) {
            try {
                String line;
                Process p = Runtime.getRuntime().exec("cmd /c dir");
                BufferedReader bri = new BufferedReader
                        (new InputStreamReader(p.getInputStream()));
//                BufferedReader bre = new BufferedReader
//                        (new InputStreamReader(p.getErrorStream()));
                while ((line = bri.readLine()) != null) {
                    System.out.println(line);
                }
                bri.close();
//                while ((line = bre.readLine()) != null) {
//                    System.out.println(line);
//                }
    //            bre.close();
    //            p.waitFor();
                System.out.println("Done.");
            }
            catch (Exception err) {
                err.printStackTrace();
            }
        }
    }

