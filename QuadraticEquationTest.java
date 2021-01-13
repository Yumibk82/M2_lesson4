import java.util.Scanner;
public class QuadraticEquationTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first factor a ");
        double a=input.nextDouble();
        System.out.println("Enter second factor b ");
        double b=input.nextDouble();
        System.out.println("Enter third factor c ");
        double c=input.nextDouble();

        QuadraticEquation ob=new QuadraticEquation(a,b,c);
        ob.getDiscriminant();
        if(ob.getDiscriminant()>0){
            System.out.println("The equation has 2 roots are "+ob.getRoot1()+" "+ob.getRoot2());
        }else if(ob.getDiscriminant()==0){
            System.out.println("The equation has 1 root "+ob.getRoot1());
        }else System.out.println("The equation has no roots");


    }
}
