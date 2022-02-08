import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String stringPath = scanner.nextLine();

        File path = new File(stringPath);

        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getParent: " + path.getPath());

        File[] folders = path.listFiles(File::isDirectory); //list only folders
        System.out.println("Folders: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("Files: ");
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(stringPath + "\\test").mkdir();
        System.out.println("Directory created successfully: " + success);

        scanner.close();
    }
}
