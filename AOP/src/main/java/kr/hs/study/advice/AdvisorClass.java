package kr.hs.study.advice;

import org.aspectj.lang.ProceedingJoinPoint;

// Ⱦ�� ���ɻ簡 �� Ŭ����
public class AdvisorClass {
	
	public void beforeMethod() {
		System.out.println("beforeMethod ȣ��");
	}
	
	public void afterMethod() {
		System.out.println("afterMethod ȣ��");
	}
	
	public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("aroundMethod ȣ��1");
		pjp.proceed(); // ���� ����Ͻ� ���� ȣ��(method1())
		System.out.println("aroundMethod ȣ��2");
	}
	
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod ȣ��");
	}
	
	public void afterThrowingMethod(Throwable e) {
		System.out.println("afterThrowingMethod ȣ��");
		System.out.println("e : "+e);
	}

}
