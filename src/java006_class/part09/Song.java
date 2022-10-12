package java006_class.part09;

public class Song {
String title;
String artist;
String album;
String[] composer;
int year;
int track;
public Song(String title, String artist, String album, String[] composer, int year, int track) {

	this.title = title;
	this.artist = artist;
	this.album = album;
	this.composer = composer;
	this.year = year;
	this.track = track;
}


public void show() {
	
System.out.println("노래제목 :"+title);
System.out.println("가수 : "+artist);
System.out.println("앨범 : "+album);
System.out.println("작곡가 :"+composer[0]+","+composer[1]);
/*
System.out.printf("작곡가:");
for(int i=0;composer.length;i++){
char chk=i<composer.length-1 ? ',' : '\n';
System.out.printf("%s%c",composer[i],chk);
 */
System.out.println("년도 :" +year);
System.out.println("트랙 :" +track);


}

}
