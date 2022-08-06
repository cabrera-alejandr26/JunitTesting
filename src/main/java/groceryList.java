import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.readAllLines;
import static java.nio.file.Files.write;

public class groceryList {
    public static void main(String[] args) throws IOException {
       String fileName = "C:\\Users\\alero\\Downloads\\list.txt";
//        Path dataFile = Paths.get(fileName);

        List<String> lines = Files.readAllLines(Paths.get(fileName));
        List<String> newList = new ArrayList<>();

        for (String line : lines) {
            if (line.equals("")) {
                newList.add("milk");
                continue;
            }
            newList.add(line);
        }

        Files.write(Paths.get("C:\\Users\\alero\\Downloads\\list.txt"), newList);


        String str = "manchester united (with nice players)";
        System.out.println(str.replace("(with nice players)", ""));
        System.out.println(str.indexOf("("));
//        System.out.println(str.substring(0, index));


    }
}
