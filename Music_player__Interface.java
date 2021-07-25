//package music_player;

 interface Interface 
{
      void show(String s);
}

interface Interface_1
{
	public void  display();
	
}
 class Evergreen_songs implements Interface,Interface_1
{
	String Song_1="Kelade Nimageega";
	String Song_2="Nagu Endhide";
	String Song_3="Tunturu Alli Neera Haadu";
	String Song_4="Naguva Nayana";
	
	 public void show(String s)

       {
		 String song=s;
		 System.out.println("======>My Favourite Evergreen song  is ::  "  +song);
		}
	 
	 public void display()
	 {
		 
		 System.out.println("======>Evergreen Song of Kannada are   ::  "+Song_1 + " , "+Song_2 + " , "+Song_3 +" , "+Song_4);
		 
	 }
}
