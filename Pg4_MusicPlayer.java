
public abstract class Pg4_MusicPlayer {
	void play()
	{
		System.out.println("Song is playing");
	}
	abstract void pause();
	void stop()
	{
		System.out.println("Song is stopped");
	}
	abstract void replay();
}
