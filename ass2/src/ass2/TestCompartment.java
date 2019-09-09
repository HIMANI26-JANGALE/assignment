package ass2;
import java.util.*;
public class TestCompartment {
	public static void main(String[] args) {
		Compartment c1[]=new Compartment[10];
		Random rand=new Random();
		int randNo;
	//	Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++){
			//randomno=((max - min )+min) +1;
			randNo=rand.nextInt((4 - 1) + 1) + 1;

			if(randNo==1)
				c1[i]=new general();
			else if(randNo==2)
				c1[i]=new Ladies();
			else if(randNo==3)
				c1[i]=new FirstClass();
			else if(randNo==4)
				c1[i]=new Luggaga();
			
			c1[i].notice();
		}
		}
	}



