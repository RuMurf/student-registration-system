import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student("John", 19, "23-12-1999", "1234");
    }

    @Test
    @DisplayName("Username Test")
    void testUsername() {
        assertEquals(student.getName()+student.getAge(), student.getUsername());
    }

    @Test
    void getName() {
        assertEquals("John", student.getName());
    }

    @Test
    void setName() {
        student.setName("Pat");
        assertEquals("Pat", student.getName());
    }

    @Test
    void getAge() {
        assertEquals(19, student.getAge());
    }

    @Test
    void setAge() {
        student.setAge(21);
        assertEquals(21, student.getAge());
    }

    @Test
    void getDob() {
        assertEquals("23-12-1999", student.getDob());
    }

    @Test
    void setDob() {
        student.setDob("21-02-2003");
        assertEquals("21-02-2003", student.getDob());
    }

    @Test
    void getId() {
        assertEquals("1234", student.getId());
    }

    @Test
    void setId() {
        student.setId("6969");
        assertEquals("6969", student.getId());
    }
}
