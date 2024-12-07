import org.junit.*;

public class MainTest {

    @Test
    public void testGetNumberOfCPUs() {
        int cpus = main.getNumberOfCPUs();
        assertTrue("Number of CPUs should be greater than 0", cpus > 0);
    }

    @Test
    public void testGetSystemArchitectureAndMemory() {
        String systemInfo = main.getSystemArchitectureAndMemory();
        
        assertNotNull("System architecture and memory info should not be null", systemInfo);
        assertTrue("System info should contain 'Architecture'", systemInfo.contains("Architecture:"));
        assertTrue("System info should contain 'Total Memory:'", systemInfo.contains("Total Memory:"));
    }

    private void assertTrue(String number_of_CPUs_should_be_greater_than_0, boolean b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void assertNotNull(String system_architecture_and_memory_info_shoul, String systemInfo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}