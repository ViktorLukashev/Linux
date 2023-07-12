public class Commands {
    private final String update = "sudo apt-get update";
    private final String upgrade = "sudo apt-get upgrade";
    private final String autoremove = "sudo apt-get autoremove && sudo apt-get autoremove";
    private final String pwd = "pwd"; // вывести текущую директорию

    private final String ls = "ls"; // содержимое директории

    /**
     * Удаление приложения с сохранением персональных настроек
     */
    protected String removeProgramSavePersonSetting(String programName) {
        return "sudo apt-get remove " + programName;
    }

    /**
     * Полная деинсталляция приложения
     */
    protected String removeFullUninstallProgram(String programName) {
        return "sudo apt-get --purge remove " + programName;
    }

    public static void main(String[] args) {
        Commands c = new Commands();
        System.out.println(c.update + " && " + c.upgrade);
    }
}
