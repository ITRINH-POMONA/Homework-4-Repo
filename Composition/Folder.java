import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    private List<FileItem> files;
    private List<Folder> subFolders;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.subFolders = new ArrayList<>();
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }
 
    // Get method (accessor)
    public String getName() {
        return name;
    }
 
    // Adds a file that this folder owns
    public void addFile(FileItem file) {
        files.add(file);
    }


    // getters
    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }
 
    public List<FileItem> getFiles() {
        return files;
    }
 
    public List<Folder> getSubFolders() {
        return subFolders;
    }

    // deletes a subfolder that's within this folder
    public boolean deleteSubFolder(String folderName) {
        for (int i = 0; i < subFolders.size(); i++) {
            Folder folder = subFolders.get(i);
            if (folder.getName().equals(folderName)) {
                folder.deleteAllContents();
                subFolders.remove(i);
                return true;
            }
        }
        for (Folder folder : subFolders) {
            if (folder.deleteSubFolder(folderName)) {
                return true;
            }
        }
        return false;
    }

    // empties all files and subfolders within this folder
    private void deleteAllContents() {
        for (Folder folder : subFolders) {
            folder.deleteAllContents();
        }
        subFolders.clear();
        files.clear();
    }

    // prints folder name, and recursively prints all subfolders and files based on depth
    public void print(int depth) {
        System.out.println("  ".repeat(depth) + "+ " + name);
 
        for (Folder folder : subFolders) {
            folder.print(depth + 1);
        }
 
        for (FileItem file : files) {
            file.print(depth + 1);
        }
    }

    public void print() {
        print(0);
    }
}
