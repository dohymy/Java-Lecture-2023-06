package ch06;

public class Ex07_MelonExample {

	public static void main(String[] args) {
		// 방법 1
		Melon m1 = new Melon();
		m1.setRank(1);
		m1.setImgUrl("https://cdnimg.melon.co.kr/cm2/album/images/112/40/232/11240232_20230509151820_500.jpg/melon/resize/120/quality/80/optimize");
		m1.setTitle("퀸카 (Queencard)");
		m1.setArtist("(여자)아이들");
		m1.setAlbum("I feel");
		System.out.println(m1);
	// Melon 파일에서 지정한 순서대로 나온다 (rank, title, artist, album, imgurl)
		
		// 방법 2
		Melon m2 = new Melon(2, "I AM", "IVE (아이브)", "I've Ive", "");
		System.out.println(m2);
		
		// array 만들기 (m1, m2 묶기)
		Melon[] melonCharts = new Melon[2];
		melonCharts[0] = m1;
		melonCharts[1] = m2;
		for (Melon m: melonCharts)
			System.out.println(m);
	}

}
