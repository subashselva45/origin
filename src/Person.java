import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Person {
    String name;
    int age;
    float height;

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void eat(String food){
        System.out.println("eating" + food);
    }
    public static void printGreeting(){
        System.out.println("Greetings from Person");
    }



}
