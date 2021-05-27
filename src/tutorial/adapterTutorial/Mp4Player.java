package tutorial.adapterTutorial;

/**
 * 2. AdvancedMediaPlayer를 구체화한 Mp4Player 클래스 생성
 * @date 		: 2021. 4. 27.
 */
public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		//do nothing
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: " + fileName);
	}

}
