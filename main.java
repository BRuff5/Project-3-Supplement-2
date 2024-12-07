
public class main {

    /**
     * @return the number of CPU's
     */
    public static int getNumberOfCPUs() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static void main(String[] args) {
        
        System.out.println("Number of CPUs: " + getNumberOfCPUs());
    }
}
