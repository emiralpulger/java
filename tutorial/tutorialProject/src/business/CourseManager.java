package business;

import business.core.logging.BaseLogger;
import dataAccess.CourseDao;
import entities.Course;

import java.util.ArrayList;


public class CourseManager {
    private CourseDao courseDao;
    private BaseLogger[] loggers;
    private ArrayList<String> courseNames = new ArrayList<>();

    public CourseManager(CourseDao courseDao, BaseLogger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) {
        if (course.getUnitPrice() < 0) {
            System.out.println("Kursun fiyatı 0'dan küçük olamaz : "+ course.getUnitPrice());
        } else if (courseNames.size() == 0) {
            courseNames.add(course.getCourseName());
            courseDao.add(course);
            for (BaseLogger logger : loggers) {
                logger.log(course.getCourseName());
            }
        } else {
            for (String k : courseNames) {
                if (k.equals(course.getCourseName())) {
                    System.out.println("Bu kurs zaten mevcut : "+ k);
                    break;
                } else {
                    courseDao.add(course);
                    for (BaseLogger logger : loggers) {
                        logger.log(course.getCourseName());
                    }
                }
            }
        }
    }
}