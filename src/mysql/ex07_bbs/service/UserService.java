package mysql.ex07_bbs.service;

import org.mindrot.bcrypt.BCrypt;

import mysql.ex07_bbs.Bcrypt;
import mysql.ex07_bbs.dao.UserDao;
import mysql.ex07_bbs.entity.User;

public class UserService {
	// 로그인
	public static final int CORRECT_LOGIN = 0; // 로그인 성공
	public static final int WRONG_PASSWORD = 1; // 비번 틀림
	public static final int UID_NOT_EXIST = 2; // 없는 ID
	
	public int login(String uid, String pwd) {
		UserDao uDao = new UserDao();
		User user = uDao.getUser(uid);
		if (user == null)	// ID가 없을 경우(다를 경우)
			return UID_NOT_EXIST;
		if (BCrypt.checkpw(pwd, user.getPassword())) 
		// pwd(입력한 비번), getPassword(DB내 비번)을 비교해 패스워드가 같으면
			return CORRECT_LOGIN; // 로그인 성공
		else {
			return WRONG_PASSWORD; // 비번 틀림
		}
	}
}
