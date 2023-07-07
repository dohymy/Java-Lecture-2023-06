package mysql.ex07_bbs;

import java.util.List;

import mysql.ex07_bbs.dao.ReplyDao;
import mysql.ex07_bbs.entity.Reply;

public class ReplyTest {

	public static void main(String[] args) {
		ReplyDao rDao = new ReplyDao();
		
		Reply r1 = new Reply("첫번째 댓글", "james", 1);
		rDao.insertReply(r1);
		
		List<Reply> list = rDao.getReplyList(10, 0);
		for (Reply r: list)
			System.out.println(r);
		System.out.println("=========================================================");
		
		Reply reply = rDao.getReply(5);
		reply.setComment("변경한 댓글");
		rDao.updateReply(reply);
		System.out.println(reply);
		
		
	}

}
