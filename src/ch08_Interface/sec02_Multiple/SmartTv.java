package ch08_Interface.sec02_Multiple;
import ch08_Interface.sec01.RemoteControllerable;

public class SmartTv implements RemoteControllerable, Searchable {
	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url + "을/를 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("SmartTV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("SmartTV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControllerable.MAX_VOLUME)
			this.volume = RemoteControllerable.MAX_VOLUME;
		else if (volume < RemoteControllerable.MIN_VOLUME)
			this.volume = RemoteControllerable.MIN_VOLUME;
		else
			this.volume = volume;
		
		System.out.println("현재 SmartTV 볼륨: " + this.volume);
	}

}
