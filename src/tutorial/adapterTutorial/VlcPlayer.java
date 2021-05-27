package tutorial.adapterTutorial;

/**
 * 2. AdvancedMediaPlayer를 구체화한 VicPlayer 클래스 생성
 * @date 		: 2021. 4. 27.
 */
public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		//do nothing
	}

}
