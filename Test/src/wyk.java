import java.util.Scanner;

public class wyk {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("输入数字");
		int b = a.nextInt();
		if (b < 100 && b > 0) {
			System.out.println("你还是个人");

		} else {
			System.out.println("你真不是人呀!!!!");
		}

	}
}
