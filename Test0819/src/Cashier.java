import java.util.Scanner;

/*
 * 简单收款程序
 * by 丁胜胜
 * time 2019/08/19
 */
public class Cashier {
	public static void main (String[] args){
		// 输入数据
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入商品单价！");
		double price = scanner.nextDouble();
		System.out.println("请输入商品数量！");
		double number = scanner.nextDouble();
		System.out.println("请输入付款金额！");
		double money = scanner.nextDouble();
//		scanner.close();
		double totalPrice = 1.0;
		totalPrice = price*number;
		if(totalPrice<=1000 && totalPrice>=500){
			System.out.println("商品给您打8折！！！！！");
			totalPrice = totalPrice*0.8;
		}else if(totalPrice>1000){
			System.out.println("商品给您打6折！！！！！");
			totalPrice = totalPrice*0.6;
		}else{
			System.out.println("商品不打折");
		}
		if(money>=totalPrice){
			double change = money - totalPrice;
			System.out.println("应收金额：" + totalPrice + "  找零金额：" + change);
		}else{
			System.out.println("输入付款金额有误，请重新输入！");
//			Scanner s = new Scanner(System.in);
			double moneyTwo = scanner.nextDouble();
			double change = moneyTwo - totalPrice;
			System.out.println("应收金额：" + totalPrice + "  找零金额：" + change);
		}
		scanner.close();

	}

}
