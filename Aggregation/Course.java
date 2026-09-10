public class Course {
    private String name;
    private Instructor instructor;
    private Textbook textbook;

    public Course(String name, Instructor instructor, Textbook textbook) {
        this.name = name;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }
 
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
 
    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }

    // getters
    public String getName() {
        return name;
    }
 
    public Instructor getInstructor() {
        return instructor;
    }
 
    public Textbook getTextbook() {
        return textbook;
    }

    
    public void print() {
        System.out.println("Course: " + getName());
        System.out.println("Instructor: " + instructor.getFirstName()
                + " " + instructor.getLastName());
        System.out.println("Textbook: \"" + textbook.getTitle()
                + "\" by " + textbook.getAuthor());
    }

}