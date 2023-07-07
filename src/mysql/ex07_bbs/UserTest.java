package mysql.ex07_bbs;

import java.util.List;

import org.mindrot.bcrypt.BCrypt;

import mysql.ex07_bbs.dao.UserDao;
import mysql.ex07_bbs.entity.User;
import mysql.ex07_bbs.service.UserService;

public class UserTest {

	public static void main(String[] args) {
		UserDao uDao = new UserDao();
		User james = new User("James", "james", "제임스", "james@google.com");
		User maria = new User("Maria", "maria", "마리아", "maria@google.com");
		
		
		uDao.insertUser(james);
		uDao.insertUser(maria);
		 
		List<User> list = uDao.getUserList(10, 0);
		for (User u: list)
			System.out.println(u);
		System.out.println("=================================");
		
		james = uDao.getUser("james");
		maria = uDao.getUser("maria");
		
		// 패스워드 변경
		String jamesPwd = BCrypt.hashpw(james.getPassword(), BCrypt.gensalt());
		String mariaPwd = BCrypt.hashpw(maria.getPassword(), BCrypt.gensalt());
		james.setPassword(jamesPwd);
		System.out.println(james);
		maria.setPassword(mariaPwd);
		uDao.updateUser(james);
		uDao.updateUser(maria);
		
		list = uDao.getUserList(10, 0);
		for (User u: list)
			System.out.println(u);
		System.out.println("=================================");
		
		// 마리아 삭제
		/*
		 * uDao.deleteUser("maria"); list = uDao.getUserList(10, 0); for (User u: list)
		 * System.out.println(u);
		 */
		
		// 로그인
		UserService us = new UserService();
		System.out.println(us.login("James", "james")); // 옳은 로그인
		System.out.println(us.login("James", "maria")); // 비번 틀림
		System.out.println(us.login("brian", "brian")); // 없는 ID
		
	}

}
