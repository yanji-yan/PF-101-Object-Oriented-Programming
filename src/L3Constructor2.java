public class L3Constructor2 {

    int modelYear;
    String modelName;
    String ownerName;


    public L3Constructor2(int year, String name, String owner)
    {
        modelYear = year;
        modelName = name;
        ownerName = owner;
    }

    public static void main(String[] args)
    {
        L3Constructor2 myCar = new L3Constructor2(1969, "Mustang", "Yanji");
        System.out.println(myCar.modelYear + " " + myCar.modelName + " " + myCar.ownerName);
    }
} // Outputs: 1969 Mustang Juan