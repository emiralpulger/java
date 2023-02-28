package business.core.logging;

public class FileLogger implements BaseLogger{
    public void log(String data){
        System.out.println("Dosya loglandı : "+ data);
    }
}
