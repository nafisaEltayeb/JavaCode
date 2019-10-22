
public class Song {
	private String name;
	private Song nextSong;
	
	public Song(String name) {
		this.name=name;
	}
	public void setNextSong(Song nextSong) {
		this.nextSong=nextSong;
	}
	
	public boolean isRepeatingPlaylist() {
		Song song1 = this.nextSong;
		Song song2 = song1 ==null? null:song1.nextSong;
		while(song2 != null) {
			if(song1==this || song1== song2) {
				return true;
			}
			song1 =song1.nextSong;
			song2= song2.nextSong;
			if(song2 != null) {
				song2=song2.nextSong;
			}
			
		}
		return false;
	}
	public static void main(String[] args) {
		Song first =new Song("Hello");
		Song second=new Song("Eye of the tiger");
		first.setNextSong(second);
		second.setNextSong(first);
		System.out.println(first.isRepeatingPlaylist());
	}

}
