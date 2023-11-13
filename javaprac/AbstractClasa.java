package javaprac;
abstract class abs {
  
    abstract String runs();

    public String run(String name) {
        return "hello " + name;
    }

}

class Asd extends abs {

    @Override
    String runs() {

        return "hello";
    }
}

public class AbstractClasa {

    public static void main(String args[]) {
                                                                            
        Asd asd=new Asd();
        abs as=asd;
        System.out.println(as.runs());
        
        
    
    }
}
