import org.junit.*;

public class MainTest {

    @Test
    public void testGetNumberOfCPUs() {
        int cpuCount = main.getNumberOfCPUs();
        assertTrue(cpuCount > 0, "CPU count should be greater than 0");
    }

    @Test
    public void testGetSystemArchitectureAndMemory() {
        String result = main.getSystemArchitectureAndMemory();
        assertTrue(result.contains("Architecture:") && result.contains("Total Memory:"),
                "Result should include architecture and total memory");
    }

    @Test
    public void testCanAllocateMemory() {
        assertTrue(main.canAllocateMemory(20), "Should be able to allocate 20MB if enough memory is free.");

        // Note: Testing with a very high value is not reliable since it depends on the system's current memory state.
        assertFalse(main.canAllocateMemory(10000), "Should not be able to allocate 10000MB under normal conditions.");
    }
}