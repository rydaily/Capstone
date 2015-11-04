package cs.campusquest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnLogIn, btnRegister, btnRegisterSubmit;
    ImageView imgCrossroad;
    EditText txtUsername, txtEmail, txtPassword, txtConfirmPassword;
    boolean isCrossroadShifted, isCrossroadShiftedLeft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogIn = (Button) findViewById(R.id.idBtnLogIn);
        this.btnRegister = (Button) findViewById(R.id.idBtnRegister);
        this.btnRegisterSubmit = (Button) findViewById(R.id.idBtnRegisterSubmit);
        this.imgCrossroad = (ImageView) findViewById(R.id.imageView3);
        this.txtUsername = (EditText) findViewById(R.id.idTxtUsername);
        this.txtEmail = (EditText) findViewById(R.id.idTxtEmail);
        this.txtPassword = (EditText) findViewById(R.id.idTxtPassword);
        this.txtConfirmPassword = (EditText) findViewById(R.id.idTxtConfirmPassword);
        this.isCrossroadShifted = false;
        this.isCrossroadShiftedLeft = false;
    }

    public void goToHomeActivity(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void register(View v){
        if (!isCrossroadShifted){
            //shift everything to the right
            this.imgCrossroad.setTranslationX(280f);
            this.btnLogIn.setTranslationX(280f);
            this.btnRegister.setTranslationX(280f);

            //show the text fields and submit button
            this.txtUsername.setVisibility(View.VISIBLE);
            this.txtEmail.setVisibility(View.VISIBLE);
            this.txtPassword.setVisibility(View.VISIBLE);
            this.txtConfirmPassword.setVisibility(View.VISIBLE);
            this.btnRegisterSubmit.setVisibility(View.VISIBLE);
            this.isCrossroadShifted = true;
            this.isCrossroadShiftedLeft = false;

            //reset offset incase login was clicked first
            this.txtUsername.setTranslationX(0f);
            this.txtPassword.setTranslationX(0f);
            this.btnRegisterSubmit.setTranslationX(0f);
        } else {
            //unshift everything (normalize)
            this.imgCrossroad.setTranslationX(0f);
            this.btnLogIn.setTranslationX(0f);
            this.btnRegister.setTranslationX(0f);

            //hide text fields and submit button
            this.txtUsername.setVisibility(View.INVISIBLE);
            this.txtEmail.setVisibility(View.INVISIBLE);
            this.txtPassword.setVisibility(View.INVISIBLE);
            this.txtConfirmPassword.setVisibility(View.INVISIBLE);
            this.btnRegisterSubmit.setVisibility(View.INVISIBLE);
            this.isCrossroadShifted = false;
        }

    }

    public void login(View v){
        if (!isCrossroadShifted){
            //shift everything to the left
            this.imgCrossroad.setTranslationX(-280f);
            this.btnLogIn.setTranslationX(-280f);
            this.btnRegister.setTranslationX(-280f);

            //show the text fields and submit button
            this.txtUsername.setVisibility(View.VISIBLE);
            this.txtPassword.setVisibility(View.VISIBLE);
            this.btnRegisterSubmit.setVisibility(View.VISIBLE);
            this.isCrossroadShifted = true;
            this.isCrossroadShiftedLeft = true;

            //shift the text fields by the offset*2
            this.txtUsername.setTranslationX(560f);
            this.txtPassword.setTranslationX(560f);
            this.btnRegisterSubmit.setTranslationX(560f);
        } else {
            //unshift everything (normalize)
            this.imgCrossroad.setTranslationX(0f);
            this.btnLogIn.setTranslationX(0f);
            this.btnRegister.setTranslationX(0f);

            //hide text fields and submit button
            this.txtUsername.setVisibility(View.INVISIBLE);
            this.txtPassword.setVisibility(View.INVISIBLE);
            this.txtEmail.setVisibility(View.INVISIBLE);
            this.txtConfirmPassword.setVisibility(View.INVISIBLE);
            this.btnRegisterSubmit.setVisibility(View.INVISIBLE);
            this.isCrossroadShifted = false;
        }
    }

    public void submit(View v){
        //first figure out if the user is trying to register or login
        //use isCrossroadShifted and isCrossroadShiftedLeft
        if (isCrossroadShifted && isCrossroadShiftedLeft){
            submitLogin();
        } else if (isCrossroadShifted && !isCrossroadShiftedLeft){
            submitRegister();
        }
    }

    public void submitRegister(){
        //do validation?
        //then submit if client-side validation passes
    }

    public void submitLogin(){
        //try to login, if server validates username/password then proceed to home activity
        //needs to save sessionid in appstate
        //userid saved in appstate?

        //temporary clientside login
        if (this.txtUsername.getText().toString().equals("ryanslaptop") && this.txtPassword.getText().toString().equals("isawesome")){
            //clientside login successful
            goToHomeActivity();
        }
    }
}
