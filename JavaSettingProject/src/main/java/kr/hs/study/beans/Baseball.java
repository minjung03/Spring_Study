package kr.hs.study.beans;

public class Baseball implements Sports {
	
	private String play_people;
	private String number_matches;
	
	public Baseball(String play_people, String number_matches) {
		this.play_people = play_people;
		this.number_matches = number_matches;
	}

	public void play() {
		System.out.print("�߱��� "+this.play_people+"�� ������ ����ϸ� ");
	}

	public void stop() {
		System.out.println(this.number_matches+"�� �Ǹ� �����");
	}

}
