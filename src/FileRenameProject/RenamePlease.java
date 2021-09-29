package FileRenameProject;

import java.io.File;
import java.lang.reflect.Field;

public class RenamePlease {
    public static void main(String[] args) {
        String folderPath = "D:\\Downloads\\anotherOne";
        File folderPathRef = new File(folderPath);
        File[] listOfFiles = folderPathRef.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) {
            String actualFilePath = listOfFiles[i].getPath();
            File f = new File(actualFilePath);
            String newFileName = actualFilePath.contains(".fdmdownload") ? actualFilePath.replace(".fdmdownload", "") : actualFilePath;
            f.renameTo(new File(newFileName));
            System.out.println("D0ne!!!");

        }
    }
}
