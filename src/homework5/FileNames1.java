package homework5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class FileNames1 {

    public static void main(String[] args) {

        fileLinesOperations();
    }

    public static void fileLinesOperations() {
        File file = new File("src/homework5/files/Txt1.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader buffReader = new BufferedReader(fileReader);
            ArrayList<String> readList = new ArrayList<>();
            String line;
            while((line = buffReader.readLine()) != null) {
                readList.add(line);
            }

            Collections.sort(readList, Collections.reverseOrder());

            FileWriter fileWriter = new FileWriter("src/homework5/files/Txt2.txt");

            for(String lines: readList) {
                fileWriter.write(lines);
                fileWriter.write("\n");

                System.out.println(lines);
            }
            fileWriter.close();
            buffReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void inputLinesOperation() {
    }

}