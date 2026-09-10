public class FolderRunner {
    public static void main(String[] args) {
 
        Folder phpDemo1 = new Folder("php_demo1");
 
        Folder sourceFiles = new Folder("Source Files");
        phpDemo1.addSubFolder(sourceFiles);
 
        sourceFiles.addSubFolder(new Folder(".phalcon"));
 
        Folder app = new Folder("app");
        sourceFiles.addSubFolder(app);
        app.addSubFolder(new Folder("config"));
        app.addSubFolder(new Folder("controllers"));
        app.addSubFolder(new Folder("library"));
        app.addSubFolder(new Folder("migrations"));
        app.addSubFolder(new Folder("models"));
        app.addSubFolder(new Folder("views"));
 
        sourceFiles.addSubFolder(new Folder("cache"));
 
        Folder publicFolder = new Folder("public");
        sourceFiles.addSubFolder(publicFolder);
        publicFolder.addFile(new FileItem(".htaccess"));
        publicFolder.addFile(new FileItem(".htrouter.php"));
        publicFolder.addFile(new FileItem("index.html"));
 
        phpDemo1.addSubFolder(new Folder("Include Path"));
        phpDemo1.addSubFolder(new Folder("Remote Files"));
 
        // printing out the structure
        System.out.println("Initial structure:");
        phpDemo1.print();
 
        phpDemo1.deleteSubFolder("app");
        System.out.println("\nAfter deleting \"app\":");
        phpDemo1.print();
 
        phpDemo1.deleteSubFolder("public");
        System.out.println("\nAfter deleting \"public\":");
        phpDemo1.print();
    }

}
