import java.util.Scanner;
import java.util.InputMismatchException;
public class Steps {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int cases= sc.nextInt();
		for(int z=0; z<cases;z++) {
			long x= sc.nextLong();
			long y= sc.nextLong();
			long differ = returndiffer(x, y);
			System.out.println(stepoutput(differ));
		}
	sc.close();
	}
	static long returndiffer(long x,long y) {
		if (y<x) return -1;
		return y-x;
	}
	static long stepoutput(long differ){		//input距離,return 走幾步
		if(differ<0) return -1;
			long maxD=0;	//走k步最多可以走的距離
			long pluse=1;	//調整最多可走距離
			long outPut=0;		//初始化要印出的步數
			for(long k=0; k<=differ;k++) {	//用k控制迴圈最多跑幾次, k: 走幾步
				if(k==0) {maxD=0;}	//走0步
				else if(k%2==1) {maxD=maxD+pluse;}	//走奇數步
				else {maxD=maxD+pluse;pluse+=1;}	//走偶數步
				//System.out.println("maxD "+maxD);
				if(maxD==differ) {return k;}
				else if(maxD>differ) {return k;}
			}
		return outPut;
	}
	
}
/*走0步: 0*****走k步最多可以走的距離
1: 1 ( 前一項+1
2: 1+1   		=2 ( 前一項+1
3: 1+2+1			=4 ( 前一項+2
4: 1+2+2+1		=6 ( 前一項+2
5: 1+2+3+2+1		=9 ( 前一項+3
6: 1+2+3+3+2+1	=12 ( 前一項+3
7: 1+2+3+4+3+2+1 =16 ( 前一項+4
8: 1+2+3+4+4+3+2+1 =20 ( 前一項+4
*/