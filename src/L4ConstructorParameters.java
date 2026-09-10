public class L4ConstructorParameters {
int modelYear;
String modelName;
String ownerName;

public L4ConstructorParameters(int year, String name, String owner)
{
    modelYear=year;
    modelName=name;
    ownerName=owner;
}

    public static void main(String[] args) {

    L4ConstructorParameters myCar = new L4ConstructorParameters(1969, "Mustang", "Geo");
        System.out.println(myCar.modelYear + " " + myCar.modelName + " " + myCar.ownerName);
}
}
