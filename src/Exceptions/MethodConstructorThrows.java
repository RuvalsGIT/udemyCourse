package Exceptions;

import java.nio.file.Path;
import java.nio.file.Paths;

public class MethodConstructorThrows {
    public static void main(String[] args) {
    try{
        new Chessprogramm();
    }
    catch(NullPointerException e){
        System.err.println("NullPointerException");
    }
    }
}

class Chessprogramm{
    Configuration configuration = new Configuration();
}

class Configuration {
    String filename;
    public Configuration(){
        Path path = Paths.get(filename);
    }
}
