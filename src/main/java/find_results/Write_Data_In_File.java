package find_results;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write_Data_In_File {
    public static void main(String[] args) throws IOException {

        FileWriter wr = new FileWriter("C:\\Users\\admin\\Desktop\\javaTestText.txt");
        BufferedWriter bw = new BufferedWriter(wr);

        bw.write("Hello from Java!\n");
        bw.write("This message is coming from Java to here!\n");
        bw.write("Everything is well");

        System.out.println("Done!!!!");
        bw.close();

    }
}
