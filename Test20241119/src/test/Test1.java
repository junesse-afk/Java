package test;

public class Test1 {

	int x = 5;
	
	public static void main(String[] args) {
		//변수 : 기억장소를 정의하고 이름을 부여, 값을 저장 => 이름을 호출
		//함수 : 자주 사용하는 기능을 이름으로 정의하고 => 이름을 호출해서 사용
		
		//객체지향 프로그래밍
		//클래스 : [객체](자동차)를 주제로 정의하고
		//		주제에 맞는 [속성](무게, 색상)을 저장,
		//		주제(구동, 브레이크)에 맞는 [기능](메서드)을 저장
		//멤버변수 : 클래스 안에 있는 변수로 주제에 맞는 특징을 저장
		//멤버함수(메서드) : 클래스 안에 있는 함수로 주제에 맞는 기능을 저장
		//호출 사용 : 클래스.멤버변수; 클래스.메서드()
		//지역변수 선언 : 기억장소에 이름을 부여해서(기억장소 할당)
		//				기억장소에 초기값 할당
		
		//객체(Object) => 모든 대상(사물, 업무)을 파악할 수 있는 주제
		//객체지향 프로그래밍 (OOP -> Object Oriented Progrmming)
		// - 현실 객체를 컴퓨터 프로그램으로 표현하기 위한 프로그래밍 기법
		// - 객체를 중심으로 객체 간의 관계를 통해 프로그램을 구현하는 것
		// - 특징 : 상속성, 추상화, 다형성, 은닉성(캡슐화)
		
		//객체지향 프로그래밍 3단계
		// 1. 분석(객체모델링) > 객체를 분석 > 객체 구성요소(속성, 특징), 동작(기능)
										//추출하는과정
		//ex) 학생 : 학번, 이름, 학년, 사는곳, 국어점수, 점수합계, 점수평균
		// 2. 설계 > 클래스 정의 > 모델링을 통해서 클래스 정의
		// 1) 멤버변수 : 객체 구성요소(속성, 특징)
		// 2) 메서드 : 객체 동작(기능)
		// 3. 구현 : 클래스 변수 선언, 객체 생성 사용
		// -> 객체 생성 : 기억장소 할동(메모리 공간생성)
		// -> 사용 : 기억장소 접근해서 멤버변수, 메서드 호출 사용
		
		//클래스 불러서 사용(클래스 변수 선언, 클래스 객체 생성, 기억장소 할당)

		Student a = new Student(); //출력만하고 리턴값 없음
		System.out.println(a.num);
		a.prn();
		System.out.println(a.sum()); //합계 리턴값 있음
	
	}

	public class Test2 {
		
	}
	
}



