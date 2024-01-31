package com.ohgiraffer.section01.literal;

public class Application01 {

    public static void main(String[] args) {

        /*수업목표. 여러가지 값의 형태를 출력할 수 있다.*/

        /*목차. 1 숫자형태의 값 */
        System.out.println(123);

        /*목차. 1-1. 실수 형태의 값 출력*/
        System.out.println(1.23);

        /*목차. 2. 문자 형태의 값 출력 */
        System.out.println('a');        // 문자 형태의 값은 홀따옴표(single-quotation)으로 감싸주어야 한다.
//        System.out.println('ab');     // 두 개 이상은 문자로 취급하지 않기 때문에 에러가 발생한다.
//        System.out.println('');       // 아무 문자도 기록되지 않는 경우도 에러가 발생한다.
        System.out.println('1');      // 숫자 값 이지만 홀따옴표로 감싸져 있는 경우는 문자 '1'이라고 판단한다.

        /*목차. 3. 문자열 형태의 값 출력 */
        System.out.println("안녕하세요 조평훈 입니다");
        
    }

}
