package ch08_Interface.sec01;

public interface RemoteControllerable {
	// 상수(constance)
	public int MAX_VOLUME = 10;		// static final을 생략
	public static final int MIN_VOLUME = 0;
	
	// 추상 메소드
	void turnOn();	// public abstract를 생략
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
}
