package md.Maria.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileManager {
    public static void createTheFileIfDoesNotExist(File inputFile) {
        if (inputFile.exists()) {
            System.out.println("The file already exist");
        } else {
            System.out.println("The file doesn't exist");
            try {
                inputFile.createNewFile();
            } catch (IOException e) {
                System.out.println("There is a exception: " + e.getMessage());
            }
        }
    }

    public static void informIfTheFileExist(File file) {
        if (file.exists()) {
            System.out.println("The file is present");
        } else {
            System.out.println("The file is not present");
        }
    }

    public static void printTheFileName(File file) {
        System.out.println("The file name is: " + file.getName());
    }

    public static void printTheAbsolutePath(File file) {
        System.out.println("The file absolute path: " + file.getAbsolutePath());
    }

    public static void printIfTheFileIsDirectory(File inputFile) {
        System.out.println("The file is directory: " + inputFile.isDirectory());
    }

    public static void deleteTheFileIfExists(File file) {
        if (file.exists()) {
            if (file.delete())
                System.out.println("Delete the file");
        } else {
            System.out.println("The file doesn't exist");
        }
    }
}
