package net.daum.jeremy6019.work1;

public class BillboardMain1 {

	public static void main(String[] args) {
		//순위, 노래제목을 저장하는 변수
		int rank =1; //정수저장 
		String song = "Despacito";
		int lastweek = 1; //지난주 순위 변수 
		String imagesrc="https://www.billboard.com/images/pref_images/q61808osztw.jpg";
		String artist="luis fonsi";
		String sf=String.format("%d, %s, %d, %s, %s",rank, song,lastweek,imagesrc,artist);
		System.out.println(sf);

	}

}
