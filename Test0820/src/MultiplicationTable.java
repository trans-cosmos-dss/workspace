
/*
 * 九九乘法表
 * by 丁胜胜
 * time 2019/08/20
 */
public class MultiplicationTable {

	public static void main(String[] args){
		for(int i = 1; i<=9; i++){
		for(int j = 1; j <= i; j++){
			System.out.print(j+"*"+i+"="+ j*i +"\t");
			}
			System.out.println();
		}
	}

}
