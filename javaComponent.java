

public class javaComponent {

    
    private static String stringVariableName;
    // private static을 쓰는 이유 : 해당 클래스에서만 접근 가능하며 static(정적 -> 고정된 값)이기에 생성자 없이 사용가능 -> static 메모리와 heap 메모리에 대한 이해 추가 설명
    // 다른 클래스에서 발생하는 코딩으로 접근도 X, 값 변경도 X () 
    
    public String variableNameReturn(){
        stringVariableName = "Hi!";
        return stringVariableName;
    }

}

// public 접근 제한: public 접근 제한은 모든 패키지에서 아무런 제한 없이 생성자 호출 가능
 
// protected 접근 제한: protected 접근 제한은 default 접근 제한과 마찬가지로 같은 패키지에 속하는 클래스에서 생성자를 호출할 수 있도록 합니다. 차이점으로 다른 패키지에 속한 클래스가 해당 클래스의 자식(child) 클래스라면 생성자 호출 가능 i.e 
 
// default 접근 제한: default 접근 제한은 같은 패키지에서는 아무런 제한 없이 생성자를 호출할 수 있으나, 다른 패키지에서는 생성자를 호출할 수 없음
 
// private 접근 제한: private 접근 제한은 동일한 패키지이건 다른 패키지이건 상관없이 생성자를 호출하지 못하도록 제한. 오로지 클래스 내부에서만 생성자 호출 또는 객체 생성 가능