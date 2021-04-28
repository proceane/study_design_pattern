package adapterTutorial;

/**
 * 4. MediaPlayer를 구체화한 AudioPlayer클래스 생성
 * 음악플레이어에서 동영상을 재생하고싶을때 MediaAdapter클래스를 사용
 * @date 		: 2021. 4. 27.
 */
public class AudioPlayer implements MediaPlayer {
	
	MediaAdapter mediaAdapter;
	
	@Override
	public void play(String audioType, String fileName) {
		
		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Name: " + fileName);
		} else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println("Invalid media. " + audioType + " format not supported");
		}
		
	}

}
