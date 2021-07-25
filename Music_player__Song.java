//package music_player1;


public class Song 
{
	public String title;
	 public double duration ;
	 public String language;
	 
	 public Song(String title, double duration, String language)      // Parameterized Constructor
	 {
		 this.title=title ;
		 this.duration=duration;
		 this.language=language;
	 }
	 
	 public Song()                             // Default Constructor
	 {
		 this.title="Default_song_title";
		 this.duration=0.0;
		 this.language=null;
	 }
	 
	 public Song(Song obj)         //Passing Objects 
	 {
		 this.title=obj.title ;
		 this.duration=obj.duration;
		 this.language=obj.language;
	 }
	 
	 public void Song_info()
	 {    System.out.println();
		 System.out.println("    Song Details  ::");
		 System.out.println("                    Title                : "+title);
		 System.out.println("                    Duration             : "+duration);
		 System.out.println("                    Language             : "+language);
	 }
	 
	 //String Handling
	 
	 public String getTitle()
	 {
		 return title;
	 }
	 public double getDuration()
	 {
		 return duration;
	 }
	 public String getLanguage()
	 {
		 return language;
	 }
	 public String toString()
	 {
		 return "Song{" +
	            "Title ='" + title +'\''+
	            ",Duration = '" + duration +'\''+
	            ",Language = '"+language +'\''+
	            '}';
	 }
	 
}

 