import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\user\\Desktop\\SkillWill\\";
        String filename = "example";
        createWriteReadFile(filePath,filename);

    }

    public static void createWriteReadFile(String filePath, String FileName) {
        try {
            // Step 1: Create the file
            String fullpath = filePath + FileName;
            File file = new File(fullpath);
            if (file.createNewFile()) {
                System.out.println("File created successfully at: " + fullpath);
            } else {
                System.out.println("File already exists at the specified location.");
            }

            // Step 2: Write to the file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello SkillWill\n");
            writer.write("Hello Friends\n");
            writer.close();
            System.out.println("Content written to the file successfully.");

            // Step 3: Read from the file
            Scanner scanner = new Scanner(file);
            System.out.println("Reading content from the file:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
            System.out.println("Success: File read operation completed.");

        } catch (IOException e) {
            System.out.println("An error occurred while creating, writing, or reading the file.");

        }
    }
}

