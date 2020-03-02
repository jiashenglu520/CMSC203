import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Birthday {
    public static void main(String[] args) {
        List<Toy> toys = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String option=null;
        String name;
        int age;
        String toyName;
        // Displays welcome message
        JOptionPane.showMessageDialog(null,"Welcome to the Toy Company to choose gifts for young children.");
        do{
            // Accepts name and age
            name = JOptionPane.showInputDialog(null, " Enter the name of the child: ");
            age = Integer.parseInt(JOptionPane.showInputDialog(null, "How old is the child (between 1 - 10): "));
             
            //Rubrics of the age
            System.out.println("Age Range:");
            System.out.println(" plushie: 0 to 2 years");
            System.out.println(" book: 4 to 7 years");
            System.out.println(" block: 3 to 5 years");

            //Accept the toy name
            toyName  = JOptionPane.showInputDialog(null, " Choose a toy: plushie, blocks, or book:  ");
            Toy toy = new Toy(toyName,age);
            while (!toy.ageOK()){
                age = Integer.parseInt(JOptionPane.showInputDialog(null, "change the Age:"));
                toy.setAge(age);
            }
             
            //Checking the additional items
            String flag;
            flag = JOptionPane.showInputDialog(null, "Do you want a card with the gift? Yes or No:");
            toy.addCard(flag);
            flag = JOptionPane.showInputDialog(null, "Do you want a ballon with the gift? Yes or No:");
            toy.addBalloon(flag);
            toys.add(toy);
             
            //If want more toys
            option = JOptionPane.showInputDialog(null, "Do you want another toy? Yes or No:");
        }while (!option.equalsIgnoreCase("no"));

        int orderId = 100000 + new Random().nextInt(900000);

       // System.out.println("------------------- The Order --------------------------");
        //System.out.println("--------------------------------------------------------");

        System.out.println("BIRTHDAY GIFTS ");
        
        double orderTotal=0;
        //System.out.print(String.format("%-15s%-15s%-15s\n","Name","Toy Name","Cost"));
        for (Toy toy:toys){
          System.out.println("The gift for "+name +" "+toy.getAge()+ " Years old is " + toy.getToy()+ "$" +toy.getCost());
           // System.out.print(String.format("%-15s%-15s%-13.2f\n",name,toy.getToy(),toy.getCost()));
            orderTotal+=toy.getCost();
        }
       // System.out.println("---------------------------------------------------------");
        System.out.println(String.format("The total cost of your order is "+ orderTotal));
        System.out.println("Order Number "+orderId);
        System.out.println("Programmer: Jiasheng");
    }
}


