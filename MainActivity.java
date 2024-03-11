package kr.ac.myapplication20203455;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
// 전역변수 영역 위젯의 객체참조 변수를 선언 위젯을 사용하려면 객체참조변수 선언
    EditText edtNum1, edtNum2;
    Button btnAdd;
    TextView textResult;
    String num1, num2; //임시변수 a,b
    Integer sum;
    // 클래스 사용에러 위치에서 alt+enter 자동으로 클래스 추가
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //화면을 열자마자 위젯이 사용하게 설정되어 있어야함, 인스턴스 생성, 클릭이벤트 설정완료
        //모든 위젯은 클래스라서 인스턴스 생성해서 사용
        edtNum1=(EditText) findViewById(R.id.edtNum1); //R.jar 파일의id 필드에서 메모리 할당
        edtNum2=(EditText) findViewById(R.id.edtNum2);
        btnAdd=(Button) findViewById(R.id.add);//이번 안드로이드 스투디오의 버그 에러선이 나오는데, 오류가 아님
        textResult=(TextView) findViewById(R.id.textResult);
        //시나리오 버튼을 누르면 입력란1,2 
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //클릭했을때 동작을 기술
                num1 = edtNum1.getText().toString();//임시변수 입력란에 글자 가져와서 String 형으로 변환
                num2 = edtNum2.getText().toString();
                //연산+ 산술연산
                sum =Integer.parseInt(num1)+Integer.parseInt(num2);//합을 구해짐 TextView 계산결과: 1S String 타입
                textResult.setText("계산결과"+sum.toString());
            }
        });
                
                
                
    }
}