package az.edu.ada.wm2.courseservice.exception;

public class PrerequisiteNotMetException extends RuntimeException {

    public PrerequisiteNotMetException(Long courseId, Long prerequisiteId, Long studentId) {
        super("Student " + studentId + " has not met prerequisite " + prerequisiteId + " for course " + courseId);
    }
}
