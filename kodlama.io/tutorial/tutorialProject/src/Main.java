import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import business.core.logging.BaseLogger;
import business.core.logging.DatabaseLogger;
import business.core.logging.FileLogger;
import business.core.logging.MailLogger;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.HibernateInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {
    public static void main(String[] args) {

        BaseLogger[] loggers = {new DatabaseLogger(),new MailLogger(),new FileLogger()};

        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers);

        Category category1 = new Category(1,"Proglamama");
        categoryManager.add(category1);
        System.out.println("-------------------------------------");
        Category category2 = new Category(2,"Proglamama");
        categoryManager.add(category2);

        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(),loggers);

        Instructor instructor1 = new Instructor(1,"Emiralp");
        instructorManager.add(instructor1);

        Instructor instructor2 = new Instructor(2,"Emiralp");
        instructorManager.add(instructor2);

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);

        Course course1 = new Course(1,200,"Java");
        courseManager.add(course1);

        Course course2 = new Course(2,-2,"Java");
        courseManager.add(course2);
    }
}
