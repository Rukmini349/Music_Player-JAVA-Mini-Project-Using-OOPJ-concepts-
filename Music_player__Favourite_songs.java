//package music_player1;

public class Favourite_songs extends Latest_songs 
{
  protected String Lyricist; 
  private String Song_choreographer;
           String Movie_name;
     String Star_cast;
     
    public  Favourite_songs()
     {
    	     super();
    	     this. Lyricist=null; 
    	     this. Song_choreographer=null;
    	     this.Star_cast=null;
    	     this.Movie_name=null;    	 
     }
    public Favourite_songs(String title, double duration, String language ,int Release_year,String Label,String Singers,String Music_director,String Lyricist, String Song_choreographer, String Movie_name,String Star_cast)
     {
    	 super(title, duration,  language , Release_year, Label, Singers, Music_director);
	     this. Lyricist=Lyricist; 
	     this. Song_choreographer=Song_choreographer;
	     this.Star_cast=Star_cast;
	     this.Movie_name=Movie_name;
     }
     
   public   void Song_info()
     {

 		 super.Song_details();
 		 
 		System.out.println ("                    Lyricist             : "+ Lyricist);
 		System.out.println ("                    Song choreographer   : "+Song_choreographer);
 		System.out.println ("                    Star-cast            : "+Star_cast);
 		System.out.println ("                    Movie Name           : "+Movie_name);
     }
     void MyFav(String fav_song)
     {
    	 System.out.println("My Favourite Song is "+fav_song);
    	 Song_info();
     }
}
