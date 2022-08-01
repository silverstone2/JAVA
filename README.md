# JAVA

## 20220721
### eclipse 설치 및 datatype 개념<br>

<기본 데이터 타입(Primitive Data Type)>
  1. 숫자형 타입 : Byte, Short, Int, Long, Float, Double
  2. 논리형 타입 : Bollean
  3. 문자형 타입 : Char
  * 공통점 : 소문자로 시작함

<참조 데이터 타입(Reference Data Type)>
- 기본 데이터 타입과 상반되는 관계
- heap 영역에 실체가 만들어지는데 이 때의 실체는 객체를 말한다.<br>
객체는 데이터의 저장소인 field와 데이터의 기능인 method로 이루어져 있다.
------------------------------------------------------------------------
## 20220722
### 객체와 클래스의 개념<br>

- 참조 데이터타입은 heap 영역에 실체가 만들어는데 이 때의 실체를 객체라고 한다.
- 객체 : Data의 저장소(field) + 기능(method)

* java에는 static, stack, heap 세가지 영역이 존재한다.
  - static 영역 : 해당 영역 위에 클래스가 생성된다. (클래스 통째로 생성이 가능하며 field와 method도 추가 가능)
  - stack 영역 : 지역변수가 생성된다.(field는 heap 영역 안에 만들어지지만 지역변수는 메모리 내 stack 영역에 생성된다)<br>
        -> [참고] 지역변수는 method가 실행 중에 생성되었다가 해당 method가 종료(return)되면 사라진다.
  - heap 영역 : 객체가 만들어진다.

* 클래스의 특징
  1. 객체의 설계도 역할
      - 해당 클래스로 객체를 만들었을 때(new) 어떤 field(저장소)와 어떤 method(기능/동작)를 가지게 할지를 설계할 수 있다.
  2. Data Type 역할
      - 지역변수나 필드를 만들때 선언하는 data type이 역할을 할 수 있다.
      - 변수나 필드의 사용 설명서에 해당된다.
  3. Static field 혹은 Static method를 static 영역에서 포함하는 역할
      - 필요에 따라서 객체에 필드나 메소드를 만들지 않고 클래스 자체에 만들어 놓을 수도 있다.


