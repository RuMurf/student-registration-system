import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    Course course;
    @BeforeEach
    void setUp() {
        course = new Course("Computer Science");
    }

    @Test
    void getName() {
        assertEquals("ComputerScience", course.getName());
    }

    @Test
    void setName() {
        course.setName("Psychology");
        assertEquals("Psychology", course.getName());
    }
}