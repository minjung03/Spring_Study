package kr.hs.study.beans;

public class vollyball implements Sports {
	
	private String play_people;
	private String number_matches;
	
	public String getPlay_people() {
		return play_people;
	}

	public void setPlay_people(String play_people) {
		this.play_people = play_people;
	}

	public String getNumber_matches() {
		return number_matches;
	}

	public void setNumber_matches(String number_matches) {
		this.number_matches = number_matches;
	}

	public void play() {
		System.out.print("배구는 "+this.play_people+"의 선수가 경기하며 ");
	}

	public void stop() {
		System.out.println(this.number_matches+"세트를 먼저 획득하면 멈춘다");
	}

}

