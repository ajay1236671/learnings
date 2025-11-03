package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.*;

@Tag("repeatetd")
public interface ModelRepeatedTests {

    @BeforeEach
    default void beforeEachConsoleOutput(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + " | " + repetitionInfo.getCurrentRepetition());
    }
}
