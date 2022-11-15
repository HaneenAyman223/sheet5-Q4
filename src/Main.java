import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // write your code here
        File myfile = new File("MyNewFile.txt");

        if(!myfile.exists()) return;


        //myfile.delete();
        File myfile2 = new File("MyNewFile2.txt");
        PrintWriter myprint = new PrintWriter(myfile2);
        Scanner x= new Scanner(myfile);
        int i=0;
        while (x.hasNext())
        {
            String s1 = x.next();
            if(s1!="error") myprint.print(s1+" ");
        }

        myprint.close();


    }
}
