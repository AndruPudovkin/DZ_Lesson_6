package view_LSP;


import data_SRP.Student;
import data_SRP.StudentGroup;

import java.util.List;
import java.util.logging.Logger;

public class StudentViewLSP implements UserView_LSP<Student> {

    Logger logger = Logger.getLogger(StudentViewLSP.class.getName());

    @Override
    public void sendOnConsole(List<Student> students) {
        for(Student user: students){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

}
