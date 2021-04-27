package adapterTutorial;

/**
 * 5. main메소드
 * audioPlayer에는 mediaAdapter가 있어서 media도 play가능
 * @date 		: 2021. 4. 27.
 */
public class AdapterPatternDemo {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
	}

}
