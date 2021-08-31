
public class Pg5_musicimplement extends Pg4_MusicPlayer{

	public static void main(String[] args) {
		Pg5_musicimplement ob = new Pg5_musicimplement();
		ob.play();
		ob.pause();
		ob.stop();
		ob.replay();
	}

	@Override
	void pause() {
		System.out.println("i am overriding the pause");
		
	}
	@Override
	void replay() {
		System.out.println("i am overriding the replay");		
	}
}
