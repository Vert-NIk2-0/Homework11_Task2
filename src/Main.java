public class Main {
    public static void main(String[] args) {
        UploadingFileTread file = new UploadingFileTread();
        Thread thread1 = new Thread(file, "File1");
        Thread thread2 = new Thread(file, "File2");
        Thread thread3 = new Thread(file, "File3");
        Thread thread4 = new Thread(file, "File4");
        Thread thread5 = new Thread(file, "File5");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

    }
}
