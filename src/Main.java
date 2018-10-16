import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws IOException {
		String sql = "INSERT INTO phdj_member (username,`password`,cnname,avatar,thum_avatar,sex,trade,cardtype,cardnum,email,mobile,zipcode,enteruser,bpuserid,bpchannelid,signtime,signnum,regtime,regip,logintime,loginip,delstate,lock_sqid,lock_state,area_id,concern_sqid,referrer,bank_referrer,second_account_status,is_jq,role_id) VALUES (\"%s\",\"nopassword\",\"\",\"\",\"\",0,-1,-1,\"\",\"\",\"%s\",\"\",0,\"\",\"\",0,0,%s,\"\",0,\"\",0,0,0,%s,0,-1,-1,1,1,%s)";
		try (FileWriter fileWriter = new FileWriter(new File("e:/大连.sql"));) {
			Long start = System.nanoTime();
			for (int i = 0; i < 7000; i++) {
				String phone = Phone.getMobile(new 二三线());
				String phoneSql = String.format(sql, phone, phone, getTime(),"2","2");
				fileWriter.append(phoneSql + ";\n");
			}
			Long end = System.nanoTime();
			System.out.println("-----");
			System.out.println(end - start);
		}
	}

	/**
	 * 
	 * @author Kraken 2018年10月15日
	 * @return
	 * 
	 * 		1539273600 12日 周五 0点 
	 * 		1539532800 15日 周一 0点
	 */
	private static String getTime() {
		Long timeLong = 0L;
		while (timeLong < 273600L || timeLong > 532800L) {
			String timeString = String.valueOf(new Random(System.nanoTime()).nextDouble()).substring(3, 3 + 6);
			timeLong = Long.valueOf(timeString);
		}
		return "1539" + timeLong;
	}
}
