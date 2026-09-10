public class CourseRunner {
    public static void main(String[] args) {
        Instructor instructor = new Instructor("Nima", "Davarpanah", "3-2636");
 
        // Textbook: "Clean Code" (author/publisher made up, as instructed)
        Textbook textbook = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
 
        // Course
        Course course = new Course("Advanced Software Engineering", instructor, textbook);
 
        // Display the course information
        course.print();
    }

}
