/*
 	Introduction
 	1. Member 클래스를 부모클래스로 하고 Empolyee와 Company를 자손클래스로 하는 method 클래스를 생성한다
 	2. getter와 setter를 이용하기
 	3. 모든 속성은 private 접근제어자로 생성
 	4. 각 속성값의 조건을 추가해서 입력값 제어하기
 	// 성명은 한글만 가능(정규표현식의 활용)
 	// 비밀번호는 8~15글자의 대소문자, 특수기호, 숫자의 혼합
 	// 아이디, 비밀번호, 성명은 모두 null, 공백이 아니여야 한다.
 */

package inheritance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class M_Member {

	private String id;
	private String passwd;
	private String name;

	public void getId(String id) {
		if(id!=null && !id.trim().isEmpty())
			// 공백이 들어왔을 때의 값을 배제하기 위해서 trim()으로 앞뒤 공백을 제거하고 isEmpth()로 공백여부를 판단가능
			this.id = id;
		else
			System.out.println("아이디를 다시 입력해주세요!!");	
	} 
		
	public void getPasswd(String passwd) {
		if(passwd.checkPwd())
		this.passwd = passwd;
	}
	
	public void getName(String name) {
		if(name!=null && !name.trim().isEmpty()) {
			Pattern p = Pattern.compile("^[가-힣]{2,5}$");
			Matcher m = p.matcher(name);
			boolean b = m.matches();
			if(b)	this.name = name;
		} else
			System.out.println("성명을 다시 입력해주세요!!");	
	}
	
}
