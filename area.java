import java.util.Scanner.*;
public class area{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius");
		int r=sc.nextInt();
		int ar=3.14*r**2;
		System.out.println("area:",ar);
	}
}

