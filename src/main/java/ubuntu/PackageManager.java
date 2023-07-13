package ubuntu;

public class PackageManager {
    public static void main(String[] args) {
        String vim = "vim";
        PackageManager pm = new PackageManager();
        System.out.println(pm.installProgram(vim));
        System.out.println(pm.removeProgram(vim));
        System.out.println(pm.searchForProgramsOnPK(vim));
        System.out.println(pm.searchRepository(vim));
    }

    private static final String COMMAND_SUDO = "sudo";
    private static final String APT_GET = "apt-get";
    private static final String APT_CACHE = "apt-cache";
    private static final String INSTALL = "install";
    private static final String REMOVE = "remove";
    private static final String POLICY = "policy";
    private static final String SEARCH = "search";

    private String installProgram(String nameProgram) {
        return COMMAND_SUDO + " " + APT_GET + " " + INSTALL + " " + nameProgram;
    }

    private String removeProgram(String nameProgram) {
        return COMMAND_SUDO + " " + APT_GET + " " + REMOVE + " " + nameProgram;
    }

    private String searchForProgramsOnPK(String nameProgram) {
        return APT_CACHE + " " + POLICY + " " + nameProgram;
    }

    private String searchRepository(String nameProgram) {
        return APT_CACHE +" " + SEARCH + " " + nameProgram;
    }
}
