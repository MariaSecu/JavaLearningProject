package md.Maria.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileExecutionService {
    public static void main(String[] args) throws IOException {
        File demoFile = new File("src/main/java/md/Maria/filemanagementservice/test1.txt");
        FileManager.createTheFileIfDoesNotExist(demoFile);
        FileManager.createTheFileIfDoesNotExist(demoFile);
        FileManager.printTheFileName(demoFile);
        FileManager.printIfTheFileIsDirectory(demoFile);
        FileManager.informIfTheFileExist(demoFile);
        FileManager.printTheAbsolutePath(demoFile);
        FileManager.deleteTheFileIfExists(demoFile);

        String filePath = "src/main/java/md/Maria/filemanagementservice/workFile.txt";
        OutputFileWriterManager.writeContentIntoFileWriter(filePath, "First content");
        OutputFileWriterManager.writeContentIntoFileUsingBufferWriter(filePath, "second content");

        File fileObject = new File(filePath);
        InputFileReaderManager.printDataFromFileWithBufferReader(fileObject);
        InputFileReaderManager.printDataFromFileUsingFiles(fileObject);
        InputFileReaderManager.printDataFromFile(fileObject);
    }
}
