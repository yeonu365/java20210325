package yuCloudStudying.Dieci;

public class UnoSongTest {
	public static void main(String[] args) {
		Song s0 = new Song("별헤는 밤", "유재하");
		Song s1 = new Song("비상", "임재범");
		Song s2 = new Song("비밀", "박완규");
		
		Song[] songs = {s0, s1, s2};
		
		for(int i=0; i <songs.length; i++ ) {
			System.out.println(songs[i].toStr());
		}
		
	}
}

class Song {
	String name;
	String singer;
	
	public Song(String n, String s) {
		name =n;
		singer =s;
		
	}

	String toStr() {
		return String.format("Song {name: %s, singer: %s }", name, singer);
		}
	
	
}