package File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Practice_File {
    public static void main(String[] args) throws IOException {
        String location = "src/File_Handling/test.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(location));
        String firstLine = bufferedReader.readLine();
        System.out.println(firstLine);



    }
}
