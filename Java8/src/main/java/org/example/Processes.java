package org.example;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Processes
    {

        public  static  void a() throws IOException {
            ProcessBuilder processBuilder = new ProcessBuilder();
            processBuilder.command("cmd", "/c", "dir C:\\Users\\admin");

            Process process = processBuilder.start();
            printResults(process);


        }
        public static void printResults(Process process) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }


        /**
         * Prevent construction.
         */
        private Processes()
        {
        }

        public static void main(String[] args) throws IOException {
            a();
            //System.out.println(a);
        }
    }

