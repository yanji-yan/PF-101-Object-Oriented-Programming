abstract class  L9AbstractMain {

public String fname = "Yanji";
public int age = 19;
public abstract void study();


}

class Student extends L9AbstractMain {
    public int graduationYear = 2018;
    public void study() {

        System.out.println("Studying all day long!");
    }
}
