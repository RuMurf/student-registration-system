import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    @Test
    void testStudent() {
        Student student = new Student();
        student.setName("John");
        student.setAge(19);

        assertEquals("John19", student.getUsername());
    }

}
