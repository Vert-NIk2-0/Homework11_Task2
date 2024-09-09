import javax.swing.*;
import java.io.*;
import java.nio.file.Files;

public class UploadingFileTread implements Runnable{
    private static final Object lock = new Object();

    @Override
    public void run() {
        String fileName = Thread.currentThread().getName() + ".txt";
        File file = new File(fileName);
        file.deleteOnExit(); //Для того, чтобы на компе у тебя не мусорить. А также просто "поиграться" командами)
        try (
                Writer writer = new FileWriter(file);
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
        ) {
            writer.write("New file created by " + Thread.currentThread().getName());
            writer.flush();

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
