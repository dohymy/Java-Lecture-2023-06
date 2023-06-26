package ch08_Interface.sec01;

public class Audio implements RemoteControllerable{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControllerable.MAX_VOLUME) 
			this.volume = RemoteControllerable.MAX_VOLUME;
		else if (volume < RemoteControllerable.MIN_VOLUME)
			this.volume = RemoteControllerable.MIN_VOLUME;
		System.out.println("현재 TV 볼륨: " + this.volume);
	}

}
