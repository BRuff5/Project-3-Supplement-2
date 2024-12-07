import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

public class main {

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

    public static void main(String[] args) {
        
        System.out.println("Number of CPUs: " + getNumberOfCPUs());

        System.out.println(getSystemArchitectureAndMemory());
    }
}
