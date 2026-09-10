public class FileItem {
    private String name;

    public FileItem(String name){
        this.name = name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // getter
    public String getName() {
        return name;
    }
    
    public void print(int depth) {
        System.out.println("  ".repeat(depth) + "- " + name);
    }

}