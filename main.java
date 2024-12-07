import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

public class main{

    /**
     * @return the number of CPU's
     */
    public static int getNumberOfCPUs() {
        return Runtime.getRuntime().availableProcessors();
    }

    /**
     * Retrieves the system architecture and total memory
     * @return a string describing the system architecture and total memory in gigabytes
     */


    public static String getSystemArchitectureAndMemory() {
        OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();
        long totalMemoryBytes = Runtime.getRuntime().maxMemory();
        double totalMemoryGB = (double) totalMemoryBytes / (1024 * 1024 * 1024);

        return String.format("Architecture: %s, Total Memory: %.2f GB",
                osBean.getArch(), totalMemoryGB);
    }

    /**
     * Check if system can allocate memory
     * @param memoryInMB the amount of memory 
     */
    public static boolean canAllocateMemory(int memoryInMB) {
        long freeMemoryBytes = Runtime.getRuntime().freeMemory();
        long requestedMemoryBytes = (long) memoryInMB * 1024 * 1024;
        return freeMemoryBytes >= requestedMemoryBytes;
    }

    public static void main(String[] args) {
        
        System.out.println("Number of CPUs: " + getNumberOfCPUs());

        System.out.println(getSystemArchitectureAndMemory());

        int memoryToAllocateMB = 500; // Example: Check for 500MB
        System.out.println("Can allocate " + memoryToAllocateMB + "MB? " +
                (canAllocateMemory(memoryToAllocateMB) ? "Yes" : "No"));
    }
}
