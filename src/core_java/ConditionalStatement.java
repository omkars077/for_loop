package core_java;

public class ConditionalStatement {

    public static void main(String[] args){
        String post="Developer";
        int age=25;
        if (age<22 && post=="Developer"){
            System.out.println("This is right information");
        }
        else {
            System.out.println("THIS IS WRONG REPORT.");
        }
        String brand="Redmi";
        int price=12000;
        if (price>16000 || brand=="Redmi"){
            System.out.println("This is not high price .");

            }
        else {
            System.out.println("THIS IS SO HIGH PRICE PRODUCT AT THIS RATE.");
        }

        int salary=150000;
        if (!(salary>120000)){
            System.out.println("This is highest salary in this department.");
        }
        else {
            System.out.println("This is not highest salary in this department.");
        }


    }


}
