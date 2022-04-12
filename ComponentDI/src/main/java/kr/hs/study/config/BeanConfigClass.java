package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.DataBean3;
import kr.hs.study.beans.DataBean4;
import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;

@Component
@ComponentScan(basePackages = "kr.hs.study.beans")
public class BeanConfigClass {
	


}
