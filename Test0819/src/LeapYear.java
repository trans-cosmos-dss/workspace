import java.util.Scanner;

/*
 * 闰年判断器
 * by 丁胜胜
 * time 2019/08/19
 */
public class LeapYear {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入有效的年份！(例如2018)");
		int year = scanner.nextInt();
		scanner.close();
		boolean isLeapYear = (year % 4 ==0 && year % 100 !=0)|| year % 400 == 0;
		String msg = isLeapYear? year+"是润年！": year+"不是闰年";
		System.out.println(msg);
	}
}
