package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass {

    /* 메소드이름,리턴 타입, 매개변수의 갯수,타입,순서가 일치해야 성립*/
    @Override
//    public void method2(int num) {} //메소드 이름이 다름
//    public void method(int num) {return 0;} //반환 값이 void인데 인트로만듦
//    public void method2(String num) {} // 매개 변수 자료형이 다름
    public void method(int num) { // 모든게 일치해야 가능

    }
    //* private 메소드 오버라이딩 불가*//
    // @Override
    // private void privateMethod() { } // 접근 제어자가 같거나 더 넓은 범위로 해야 한다.

    /* final 메소드 오버라이딩 불가*/
    // @Override
    //public final void finalMethod() { }

    /* 더 넓은 범위로 이동하는것은 문제가없다*/
    @Override
    public void protectedMethod() {
    }
    /* default 로 변경시 더 좁은 범위로 변경이라 불가능 */
//     void protectedMethod() {
//    }
}
