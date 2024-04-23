package Controller;

import Model.CreateArrayFromFile;
import Model.MapOfRepeatedWord;
import Service.CounterArray;
import Service.WorkWithFile;

import java.io.IOException;

public class Controller {
    public void start() throws IOException {
        WorkWithFile workWithFile = new WorkWithFile();
        String line = workWithFile.readFile();
        if (line.equals("-1")) {
            System.out.println("Записи отсутсвуют! Дальнейшее выполнение невозможно!");
        } else {
            CreateArrayFromFile createArrayFromFile = new CreateArrayFromFile();
            String[] strArray = createArrayFromFile.createArray(line, " ");
            CounterArray counterArray = new CounterArray(strArray);
            System.out.println(counterArray.toString());
            MapOfRepeatedWord mapOfRepeatedWord = new MapOfRepeatedWord(strArray);
            System.out.println(mapOfRepeatedWord.toString());

        }

//        CreateArrayFromFile createArrayFromFile = new CreateArrayFromFile();
//        //inputArrayString.createArray(line);
    }
}