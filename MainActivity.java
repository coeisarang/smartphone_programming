package kr.ac.baekseok.pet20203455;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t1; //좋아하는 위젯을 사용하려면 객체참조변수 선언 빨간줄이 뜨면 Alt+enter 로 import class 한다.
    CheckBox chkAgree;
    RadioGroup rGroup;
    RadioButton rdoDog, rdoCat, rdoRabbit; //라디오 버튼 강아지, 고양이, 토끼
    Button btnOK; //선택완료
    ImageView imgPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 위젯 인스터턴스 생성
        t1=(TextView) findViewById(R.id.t1);
        chkAgree=(CheckBox) findViewById(R.id.ChkAgree);
        rGroup=(RadioGroup) findViewById(R.id.Rground1);
        rdoDog=(RadioButton) findViewById(R.id.RdoDog);
        rdoCat=(RadioButton)findViewById(R.id.RdoCat);
        rdoRabbit=(RadioButton)findViewById(R.id.RdoRabbit);

        btnOK=(Button) findViewById(R.id.btnOK);
        imgPet=(ImageView)findViewById(R.id.imgPet);

        //시작함(체크박스) 체크를 하면 위젯이 나타남(좋아하는 ~, 라디오 그룹, 선택완료 버튼, 이미지뷰)
        //체크를 체크변경 하면(이벤트) 설정) 체크가 true 인지 확인해서 보이기/숨기기

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //isChecked() 체크가 되어 있으면 false
                if(chkAgree.isChecked()==true){
                    t1.setVisibility(View.VISIBLE);  //보이기
                    rGroup.setVisibility(View.VISIBLE);
                    btnOK.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                }//if
                else{
                    t1.setVisibility(View.INVISIBLE);
                    rGroup.setVisibility(View.INVISIBLE);
                    btnOK.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }//else


            }
        });//chkAgree
        btnOK.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int checkedRadio=rGroup.getCheckedRadioButtonId();//정수형
                if(checkedRadio==R.id.RdoDog)imgPet.setImageResource(R.drawable.cat2);
                else if(checkedRadio==R.id.RdoCat)imgPet.setImageResource(R.drawable.cat2);
                else if(checkedRadio==R.id.RdoRabbit)imgPet.setImageResource(R.drawable.rabbit);
                else Toast.makeText(getApplicationContext(), "동물 먼저 선택하세요", Toast.LENGTH_SHORT).show(); //위에서 아이디가 없으면 표시
            }//onClick()
        }));//btnOK



    }//onCreate()
}//MainActivity
