package calculator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_Data_from_File {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\admin\\Desktop\\javaTestText.txt");
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
        //OR instead of while loop
        //scan.useDelimiter("\\Z");
        //System.out.println(scan.next());
    }
}
