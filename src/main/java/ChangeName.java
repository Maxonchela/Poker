import java.io.File;

public class ChangeName {
    public void change(){
        File[] filesList;
        File filesPath = new java.io.File("/Users/max/Desktop/for Poker/imgs"); // создаем объект на папку с файлами
        filesList = filesPath.listFiles(); // записываем файлы из папки в массив объектов типа File

        for(int i=0; i<filesList.length; i++){
            String name = filesList[i].getName();
            filesList[i].renameTo(new File("/Users/max/Desktop/for Poker/imgs" + i + ".png"));
        }
    }
}
