import java.io.File;
import java.io.IOException;

public class ShellCommandHandler {
    private File currentDirectory;

    public ShellCommandHandler() {
        this.currentDirectory = new File(System.getProperty("user.dir"));
    }

    public void printWorkingDirectory() {
        System.out.println(currentDirectory.getAbsolutePath());
    }

    public void listDirectory() {
        File[] files = currentDirectory.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("(empty)");
            return;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("[DIR] " + file.getName());
            } else {
                System.out.println("[FILE] " + file.getName());
            }
        }
    }

    public void changeDirectory(String name) {
        if (name == null) {
            System.out.println("Usage: cd [directory_name]");
            return;
        }

        File newDir;
        if (name.equals("..")) {
            newDir = currentDirectory.getParentFile();
        } else {
            newDir = new File(currentDirectory, name);
        }

        if (newDir != null && newDir.exists() && newDir.isDirectory()) {
            currentDirectory = newDir;
        } else {
            System.out.println("Directory not found: " + name);
        }
    }

    public void makeDirectory(String name) {
        if (name == null) {
            System.out.println("Usage: mkdir [directory_name]");
            return;
        }

        File dir = new File(currentDirectory, name);
        if (dir.exists()) {
            System.out.println("Directory already exists.");
        } else if (dir.mkdir()) {
            System.out.println("Directory created: " + name);
        } else {
            System.out.println("Failed to create directory.");
        }
    }

    public void createFile(String name) {
        if (name == null) {
            System.out.println("Usage: touch [file_name]");
            return;
        }

        File file = new File(currentDirectory, name);
        if (file.exists()) {
            System.out.println("File already exists.");
        } else {
            try {
                if (file.createNewFile()) {
                    System.out.println("File created: " + name);
                } else {
                    System.out.println("Failed to create file.");
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public void printHelp() {
        System.out.println("Available commands:");
        System.out.println("pwd          - Print the current working directory");
        System.out.println("ls           - List files and directories");
        System.out.println("cd [dir]     - Change to specified directory");
        System.out.println("mkdir [dir]  - Create a new directory");
        System.out.println("touch [file] - Create a new file");
        System.out.println("help         - Show this help message");
        System.out.println("exit         - Exit the shell");
    }

    public File getCurrentDirectory() {
        return currentDirectory;
    }
}
