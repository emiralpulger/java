package business;

import business.core.logging.BaseLogger;
import dataAccess.InstructorDao;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
    private InstructorDao instructorDao;
    private BaseLogger[] loggers;
    private List<String> instructorName = new ArrayList<>();

    public InstructorManager(InstructorDao instructorDao,BaseLogger[] loggers){
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor){
        if (instructorName.size()==0){
            instructorName.add(instructor.getInstructorName());
            instructorDao.add(instructor);
            for (BaseLogger logger : loggers){
                logger.log(instructor.getInstructorName());
            }
        }else {
            for (String name : instructorName){
                if (name.equals(instructor.getInstructorName())){
                    System.out.println("Eğitmen zaten var : " + instructor.getInstructorName());
                    break;
                }else {
                    instructorDao.add(instructor);
                    for (BaseLogger logger : loggers){
                        logger.log(instructor.getInstructorName());
                    }
                }
            }
        }
    }
}
