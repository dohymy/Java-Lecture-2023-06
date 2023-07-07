package mysql.ex07_bbs;

import java.time.LocalDateTime;
import java.util.List;

import mysql.ex07_bbs.dao.BoardDao;
import mysql.ex07_bbs.entity.Board;

public class BoardTest {
		// SQL 고치면 UserTest를 먼저 실행하고 다른 test를 실행해야 함.
		// 안그러면 foreign key 오류 발생
	public static void main(String[] args) {
		BoardDao bDao = new BoardDao();
		
//		Board b1 = new Board("첫번째 글", "첫번째 글입니다.", "james");
//		Board b2 = new Board("두번째 글", "두번째 글입니다.", "maria");
//		bDao.insertBoard(b1);
//		bDao.insertBoard(b2);
		
		// getBoardList test
		List<Board> list = bDao.getBoardList("title", "첫", 10, 0);
		for (Board b: list)
			System.out.println(b);
		System.out.println("=================================");
		
		bDao.increaseViewCount(5);
		bDao.increaseReplyCount(5);
		Board board = bDao.getBoard(5);
		System.out.println(board);
		System.out.println("=================================");
		
		board.setTitle("변경한 글");
		board.setContent("변경한 글입니다.");
		bDao.updateBoard(board);
		System.out.println(board);
	}

}
