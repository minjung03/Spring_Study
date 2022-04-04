package kr.hs.study.beans;

public class Baseball implements Sports {
	
	private String play_people;
	private String number_matches;
	
	public Baseball(String play_people, String number_matches) {
		this.play_people = play_people;
		this.number_matches = number_matches;
	}

	public void play() {
		System.out.print("야구는 "+this.play_people+"의 선수가 경기하며 ");
	}

	public void stop() {
		System.out.println(this.number_matches+"가 되면 멈춘다");
	}

}
