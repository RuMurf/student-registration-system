import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModuleTest {
    private Module module;

    @BeforeEach
    void setUp() {
        module = new Module("Programming", "CT101");
    }

    @Test
    void getName() {
        assertEquals("Programming", module.getName());
    }

    @Test
    void setName() {
        module.setName("Software Engineering");
        assertEquals("Software Engineering", module.getName());
    }

    @Test
    void getId() {
        assertEquals("CT101", module.getId());
    }

    @Test
    void setId() {
        module.setId("CT304");
        assertEquals("CT304", module.getId());
    }
}