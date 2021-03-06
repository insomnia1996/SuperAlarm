package superalarm.firsttry;

import android.app.Activity;
import android.content.Intent;;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Button;

public class WelcomeActivity extends Activity {
    private EditText aUserName, aPassWord;
    private Button aLogin, aRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        aUserName = (EditText) findViewById(R.id.EtxtUserName);
        aPassWord = (EditText) findViewById(R.id.EtxtPassWord);
        aLogin = (Button) findViewById(R.id.BtnLogin);
        aRegister = (Button) findViewById(R.id.BtnRegister);

        aLogin.setOnClickListener(BtnLoginOnClick);
        aRegister.setOnClickListener(BtnRegisterOnClick);
        }

        //点击“登录”按钮，接收讯息：用户名+密码
        private View.OnClickListener BtnLoginOnClick=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String thisUserName = aUserName.getText().toString();
                String thisPassWord = aPassWord.getText().toString();

                //下接密码判断机制……
            }
        };
            //点击“注册”按钮，跳转至注册信息填写界面
            private View.OnClickListener BtnRegisterOnClick = new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent it = new Intent();
                    it.setClass(WelcomeActivity.this, LoginActivity.class);
                    startActivity(it);
                    //finish();
                }
            };
        }
