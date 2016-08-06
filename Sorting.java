# Sorting
import java.util.Scanner;


public class Sort{
	public static void main(String[] args) {		
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b[]=new int[a];
int temp=0;
int j=0;
int k=0;
for(int i=0;i<a;i++){
	b[i]=sc.nextInt();
}
for(k=0;k<a;k++){
	for(j=1;j<a-1;j++){
		if(b[j-1]>b[j]){
			temp=b[j-1];
			b[j-1]=b[j];
			b[j]=temp;
			System.out.println(b[j]);
		}
			
			
		b[k]=b[j];			
		}


System.out.println(b[k]);	
	}


	}

}
