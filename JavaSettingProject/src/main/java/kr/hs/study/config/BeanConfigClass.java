package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.Baseball;
import kr.hs.study.beans.Basketball;
import kr.hs.study.beans.vollyball;

@Configuration
public class BeanConfigClass {

	
	@Bean
	public Baseball b1() {
		Baseball b1 = new Baseball("9명","9회");
		return b1;
	}
	
	@Bean
	public vollyball b2() {
		vollyball b2 = new vollyball();
		b2.setPlay_people("6명");
		b2.setNumber_matches("3");
		return b2;
	}
	
	
	@Bean
	public Basketball b3() {
		Basketball b1 = new Basketball("5명","4");
		return b1;
	}
}
