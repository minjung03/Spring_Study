package kr.hs.study.beans;

public class Basketball implements Sports {
	
	private String play_people;
	private String number_matches;
	
	public Basketball(String play_people, String number_matches) {
		this.play_people = play_people;
		this.number_matches = number_matches;
	}

	public void play() {
		System.out.print("농구는 "+this.play_people+"의 선수가 경기하며 ");
	}

	public void stop() {
		System.out.println(this.number_matches+"쿼터가 되면 멈춘다");
	}

}
