import java.util.Scanner;


/*
 * 简单指令
 * by 丁胜胜
 * time 2019/08/19
 */
public class CommandBySwitch {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int command = 0;
		System.out.println("请选择一下家务活：1、刷碗 2、拖地 3、全包");
		command = scanner.nextInt();
		scanner.close();
		switch(command){
			case 1:
				System.out.println("刷碗");
				break;
			case 2:
				System.out.println("拖地");
				break;
			case 3:
				System.out.println("全包");
			default:
				System.out.println("小样！你啥都不想干");
		}
	}
}
