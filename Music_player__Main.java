//package music_player;
import music_player1.*;     //Importing package
import java.util.*;
public class Main 
{

	public static ArrayList<Album> albums = new ArrayList<>();
	
	public static void main(String[] args)
	{
		System.out.println();
		System.out.println("          =====>This project is done by  'RUKMINI.S.B'   '4NI19IS078'   'B SECTION'<=====");
		System.out.println("                     =====>Topic :  Music Player<=====      ");
		System.out.println();
		System.out.println("");
		System.out.println("                 Songs in our music player");
		Song s1 = new Song("Manwa Laage",4.32,"Hindi");  //Creating Parent class object
		s1.Song_info();
		
		
		 System.out.println();
		    System.out.println("==========> Latest Songs are : <==========");
		    
		 //Creating Child class object  (Single Inheritance)
		
	    Latest_songs s2=new Latest_songs();     //Default Constructor
	    s2.Song_details();
	   
	    
		Latest_songs s3=new Latest_songs("Nee Kotiyali Obbane",3.43,"Kannada",2020,"Aananda Audion Video","Shreya Ghoshal","Arjun Janya"); // Parameterized Constructor
	     s3.Song_details(); 
	     
	     //Passing objects as parameters
	     Latest_songs s4=new Latest_songs("Samajavargamana",3.35,"Telugu",2019,"Aditya Music","Sid Sriram","S Thaman"); 
	     Latest_songs s5=new Latest_songs(s4);
	     s5.Song_details();
	     
	     //Creating child class object (Multilevel Inheritance)
	     System.out.println();
	    System.out.println("==========> My Favourite Song among Latest songs is  : <==========");
	     Favourite_songs s6 =new Favourite_songs("Nee Kotiyali Obbaane",3.43,"Kannada",2020,"Aananda Audion Video","Shreya Ghoshal","Arjun Janya","Yograj Bhat","Raju Sundaram","Kotigobba 3","Sudeep and Madonna Sebastian");
	     s6.Song_info();
	     
	     // Interface
	     
	     System.out.println();
	     Evergreen_songs s7=new Evergreen_songs();
           s7. display();

  	     System.out.println();
           Evergreen_songs s8=new Evergreen_songs();
           s8.show("Naguva Nayana");
           
	     //Creating Albums 
           System.out.println();
           System.out.println("==========Adding songs to Playlist 1:========== ");
		
           Album album = new Album("Album_1" , "Shreya Ghoshal");

		  album.addSong("Hoovina Banadanthe",4.5,"Kannada");
		  album.addSong("Ghar More Pardesiya",5.20,"Hindi");
		  album.addSong("Manwa Laage",4.32,"Hindi");
		  album.addSong("Kadhal Anukkal",5.24,"Tamil");
		  album.addSong("Allasani Vaari",4.56, "Telugu");
		  album.addSong("Hoovina Banadanthe",4.5,"Kannada");
		  albums.add(album);
		
		  
		
		  album = new Album("Album_2","Vijay Prakash");
		  
		  album.addSong("Jai Ho",5.19,"Hindi");
		  album.addSong("Idhedho Bagundhe",5.14,"Telugu");
		  album.addSong("Belageddu",3.8,"Kannada");
		  album.addSong("Naani Koni",5.06,"Tamil");
		  album.addSong("Jai Ho",5.19,"Hindi");
		  albums.add(album);
		  
		
		  //Creating Play_list and adding songs from the album 
		 
		  
		  LinkedList<Song> playList_1 = new LinkedList<>();
		  
		 
		  albums.get(0).addToPlayList("Hoovina Banadanthe",playList_1);
		  albums.get(0).addToPlayList("Manwa Laage",playList_1);
		  albums.get(0).addToPlayList("Neenaadena Naa",playList_1);
		  albums.get(1).addToPlayList("Belageddu",playList_1);
		  albums.get(1).addToPlayList("Jai Ho",playList_1);
          albums.get(1).addToPlayList("Idhedho Bagundhe",playList_1); 
          albums.get(1).addToPlayList("Naani Koni",playList_1);

          //Trying to add the song to the play_list which is not in the album
          albums.get(0).addToPlayList("Appa I Love You",playList_1);
		  albums.get(1).addToPlayList("O Baby",playList_1);
		
		 
		  play(playList_1);
		
	
		  LinkedList<Song> playList_2 = new LinkedList<>();
		  play(playList_2);
		  
		System.out.println("");
		  
		
		
			// Exception Handling
		  try
	        {
	        	Class.forName("Trending_songs");
	        }
	        catch(Exception ex)
	        {
	        	System.out.println("ClassNotFoundException   caught here");
	        	ex.printStackTrace();
	        }
		  finally
		  {
			  System.out.println("ClassNOtFoundException is an Example for CheckedException");
		  }
	}
	 private static void play(LinkedList<Song> playList)
	 {
		   Scanner sc= new Scanner(System.in);
		   boolean quit = false;
		   boolean forward = true;
		   ListIterator<Song> listIterator = playList.listIterator();
		  
		   if(playList.size()==0)
		   {
			   System.out.println("This playlist have no song");
			   
		   }
		   else 
		   {
			   System.out.println("");
			   System.out.println("=====>Now playing "+ listIterator.next().toString());
			   System.out.println("");
			   printMenu();
			   
		   }
		   
		  while(!quit)
		  {
			 int action = sc.nextInt();
			 sc.nextLine();
			 switch(action)
			 {
			 case 0:
				 System.out.println("You are quiting from the menu");
				 quit = true;
				 break;
				 
			 case 1:
				 if(!forward)
				 {
					if(listIterator.hasNext())
					{
						listIterator.next();
						
					}
					forward = true;
					
				 }
				 if(listIterator.hasNext())
				 {
					 System.out.println("=====>Playing next song : "+listIterator.next().toString());
					 
				 }
				 else
				 {
					 System.out.println("No song available ,we have reached to the end of the playlist");
					 forward = false;
				 }
				 break;
				 
			 case 2:
				 if(forward)
				 {
					 if(listIterator.hasPrevious())
					 {
						 listIterator.previous();
					 }
					 forward = false;
				 }
				 if(listIterator.hasPrevious())
				 {
					 System.out.println("=====>Playing previous song : "+listIterator.previous().toString());
				 }
				 else
				 {
					 System.out.println ("We are at the first song");
					 forward = false;
				 }
				 break;
				 
			 case 3:
				 if(forward)
				 {
					 if(listIterator.hasPrevious())
					 {
						 System.out.println("=====> Re-Playing the current song "+listIterator.previous().toString());
						 forward = false;
						 
					 }
					 else
					 {
						 System.out.println ("We are at the start of the playlist ");
					 }
				 }
				 else
				 {
					 if(listIterator.hasNext())
					 {
						 System.out.println("=====> Re-Playing the current song "+listIterator.next().toString());
						 forward = true;
					 }
					 else
					 {
						 System.out.println ("We have reached to the end of playlist ");
					 }
				 }
				 break;
				 
				 
			 case 4:
				 printList(playList);
				 break;
				 
			 case 5:
				 printMenu();
				 break;
					 
			 case 6:
				 
				 if(playList.size() >0)
				 {
					 listIterator.remove();
					 if(listIterator.hasNext())
					 {
						System.out.println("Deleted the current song");
						 System.out.println("=====>Now playing "+ listIterator.next().toString());
						 
					 }
					 else 
					 {
						 if(listIterator.hasPrevious())
							 System.out.println("Deleted the current song");
							 System.out.println("=====>Now playing "+ listIterator.previous().toString());
					 }
					 
				 }
				 
			 }
		  }
		  sc.close();
	 }
	 private static void printMenu()
	 {
		 System.out.println("");
		 System.out.println("Available options\n press");
		 System.out.println("0 -  To quit\n"+
		            "1 - To play next song\n"+
				    "2 - To play previous song\n"+
		            "3 - To replay the current song\n"+
				    "4 - To veiw list of all songs in the palylist\n"+
		            "5 - To print all available options\n"+
				    "6 - To delete current song ");
		            
	 }
	 private static void printList(LinkedList<Song> playList)
	 {
		 Iterator<Song> iterator = playList.iterator();
		 System.out.println("----------------------");
		 
		 while(iterator.hasNext())
		 {
			 System.out.println(iterator.next());
		 }
		 System.out.println("----------------------");
	 }
	
}
