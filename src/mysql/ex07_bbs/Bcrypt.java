package mysql.ex07_bbs;

import org.mindrot.bcrypt.BCrypt;

public class Bcrypt {
	// 패스워드
	public static void main(String[] args) {
		String pwd = "123asdf";
		String cryptedPwd = BCrypt.hashpw(pwd, BCrypt.gensalt());
		System.out.println(cryptedPwd.length() + ", " + cryptedPwd);
		// 결과 : 60, $2a$10$01B1jF5FuXUIyVNujJ.iMuF7xqboQ1rz3jQ7wOK.tcx9BoplZnwf6
		
		// 패스워드가 동일한지 확인
		boolean result = BCrypt.checkpw(pwd, cryptedPwd);
		System.out.println(result);
	}

}
