import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void fiftyNineEqualsF(){
        Grader grader = new Grader();

        assertEquals('D', grader.determineLetterGrade(69));
    }

}