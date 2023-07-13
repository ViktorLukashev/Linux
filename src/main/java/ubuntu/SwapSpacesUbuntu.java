package ubuntu;

public class SwapSpacesUbuntu {
    public static void main(String[] args) {
        SwapSpacesUbuntu ssu = new SwapSpacesUbuntu();
        System.out.println(ssu.checkFreeSwapSpace());
        System.out.println(ssu.checkFreeDiskSpace());
        System.out.println(ssu.creatingSwapFile());
        System.out.println(ssu.setAccessToFile());
        System.out.println(ssu.editFileAsSwapLocation());
        System.out.println(ssu.enablingSwapFile());
        System.out.println(ssu.makeBackupCcopy());
        System.out.println(ssu.swapFileIsAutomaticallyLoaded());
    }

    /**
     * Проверить, есть ли в Ubuntu свободное место подкачки, можно с помощью следующей команды.
     */
    private String checkFreeSwapSpace() {
        return "swapon --show";
    }

    /**
     * Узнать, есть ли свободное место на диске.
     */
    private String checkFreeDiskSpace() {
        return "df -h";
    }

    /**
     * Создания файла подкачки
     */
    private String creatingSwapFile() {
        return "sudo fallocate -l 5G /swapfile";
    }

    /**
     * Установим доступ к файлу только пользователю root:
     */
    private String setAccessToFile() {
        return "sudo chmod 600 /swapfile";
    }

    /**
     * Укажем использовать его как файл подкачки:
     */
    private String editFileAsSwapLocation() {
        return "sudo mkswap /swapfile";
    }

    /**
     * Включаем файл подкачки:
     */
    private String enablingSwapFile() {
        return "sudo swapon /swapfile";
    }

    /**
     * Сделаем резервную копию данного файла
     */
    private String makeBackupCcopy() {
        return "sudo cp /etc/fstab /etc/fstab.bak";
    }

    /**
     * Теперь, нужно сделать так, чтобы файл подкачки автоматом подгружался при запуске системы.
     * Для этого, нужно отредактировать файл /etc/fstab.
     */
    private String swapFileIsAutomaticallyLoaded() {
        return "echo '/swapfile none swap sw 0 0' | sudo tee -a /etc/fstab";
    }
}
