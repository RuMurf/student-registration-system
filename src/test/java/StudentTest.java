import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student("John", 19, "23-12-1999");
    }

    @Test
    @DisplayName("Username Test")
    void testUsername() {
        assertEquals(student.getName()+student.getAge(), student.getUsername());
    }
}
