package c1;

// import java.io.*;

public class e10 {
    public static void main(String[] args) {
        // try {
        //     Runtime rt = Runtime.getRuntime();
        //     Process pr = rt.exec("ls -sail");

        //     BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));

        //     String line=null;

        //     while((line=input.readLine()) != null) {
        //         System.out.println(line);
        //     }

        //     int exitVal = pr.waitFor();
        //     System.out.println("Exited with error code "+exitVal);

        // } catch(Exception e) {
        //     System.out.println(e.toString());
        //     e.printStackTrace();
        // }
        // // https://www.linglom.com/programming/java/how-to-run-command-line-or-execute-external-application-from-java/
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
    }    
}