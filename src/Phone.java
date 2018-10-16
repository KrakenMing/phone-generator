import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import area.Area;

public class Phone {
	// 判断是否电话格式
	public static boolean isMobileNO(String mobiles) {

		Pattern pattern = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");

		Matcher matcher = pattern.matcher(mobiles);

		return matcher.matches();
	}

	// 返回随机电话号码
	public static String getMobile(Area area) {

		while (true) {
			String randomPhone = randomPhone();
			if (Phone.isMobileNO(randomPhone) && area.inArea(randomPhone)) {
				return randomPhone;
			}

		}

	}

	// 产生随机电话号码格式数字
	public static String randomPhone() {
		String phone = "1";

		Random random = new Random();
		int nextInt = random.nextInt(3);

		if (nextInt == 0) {
			phone = phone + "3" + Phone.randomNumber();
		} else if (nextInt == 1) {
			phone = phone + "5" + Phone.randomNumber();
		} else {
			phone = phone + "8" + Phone.randomNumber();
		}
		return phone;
	}

	// 生成长度为9的随机数
	public static String randomNumber() {

		Random random = new Random();
		int nextInt = random.nextInt(900000000) + 100000000;
		int abs = Math.abs(nextInt);
		String valueOf = String.valueOf(abs);
		return valueOf;
	}
}