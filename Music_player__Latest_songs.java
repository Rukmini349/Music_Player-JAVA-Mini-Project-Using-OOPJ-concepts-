//package music_player1;

public class Latest_songs extends Song
{
	
			 public int Release_year;
			 public	String Label;
			 public	String Singers;
			 public	String Music_director;
			 	
			 	public Latest_songs(String title, double duration, String language ,int Release_year,String Label,String Singers,String Music_director)
			 	{
			 		super(title,duration,language);
			 		this.Release_year=Release_year;
			 		this.Label=Label;
			 		this.Singers=Singers;
			 		this.Music_director=Music_director;
			 		
			 	}
			 	public Latest_songs()
			 	{
			 		super();
			 		this.Release_year=0;
			 		this.Label=null;
			 		this.Singers=null;
			 		this.Music_director=null;
			 	}
			 	
			 	public Latest_songs(Latest_songs ob) 
			 	{
			 		super(ob);
			 		this.Release_year=ob.Release_year;
			 		this.Label=ob.Label;
			 		this.Singers=ob.Singers;
			 		this.Music_director=ob.Music_director;
			 	}
			 	 public void Song_details()
			 	 {
			 		 
			 		 super.Song_info();
			 		System.out.println ("                    Release Year         : "+Release_year);
			 		 System.out.println("                    Label                : "+Label);
			 		 System.out.println("                    Singers              : "+Singers);
			 		 System.out.println("                    Music Director       : "+Music_director);
			 	 }
			 }


