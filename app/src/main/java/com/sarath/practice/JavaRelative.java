package com.sarath.practice;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by sarath on 11/22/2016.
 */

public class JavaRelative extends AppCompatActivity {

    RelativeLayout relativeLayout;
    EditText etUsername,etPassword;
    TextView tvUsername,tvPassword,tvMessage;
    Button btnLogin;
    RelativeLayout.LayoutParams mDimensions,userDimensions,userValueDimensions,passwordDimensions,passwordValueDimensions,loginDimensions;
    int etUsernameId=1,etPasswordId=2,tvUsernameId=3,tvPasswordId=4,tvMessageId=5,btnLoginId=6;
    private int paddingValue=0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        messageTextView();
        userNameTextView();
        userNameEditText();
        passwordTextView();
        passwordEditText();
        loginButton();
        relativeLayout.addView(tvMessage,mDimensions);
        relativeLayout.addView(tvUsername,userDimensions);
        relativeLayout.addView(etUsername,userValueDimensions);
        relativeLayout.addView(tvPassword,passwordDimensions);
        relativeLayout.addView(etPassword,passwordValueDimensions);
        relativeLayout.addView(btnLogin,loginDimensions);
        setContentView(relativeLayout);
    }
    private void init(){
        relativeLayout = new RelativeLayout(this);

        RelativeLayout.LayoutParams mainDimensions = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.MATCH_PARENT);
        relativeLayout.setLayoutParams(mainDimensions);
        etUsername = new EditText(this);
        etPassword = new EditText(this);
        tvUsername = new TextView(this);
        tvPassword = new TextView(this);
        tvMessage  = new TextView(this);
        btnLogin = new Button(this);
    }
    private void messageTextView(){
         mDimensions = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        mDimensions.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        tvMessage.setPadding(paddingValue,100,paddingValue,paddingValue);
        tvMessage.setText("Please Login First");
        tvMessage.setId(tvMessageId);
        tvMessage.setLayoutParams(mDimensions);
    }
    private void userNameTextView(){
     userDimensions = new RelativeLayout.LayoutParams(
             RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
     userDimensions.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
     userDimensions.addRule(RelativeLayout.BELOW,tvMessageId);
     tvUsername.setText("User Name");
     tvUsername.setId(tvUsernameId);
    }
    private void userNameEditText(){
      userValueDimensions = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
              RelativeLayout.LayoutParams.WRAP_CONTENT);
       etUsername.setId(etUsernameId);
        userValueDimensions.addRule(RelativeLayout.BELOW,tvMessageId);
      userValueDimensions.addRule(RelativeLayout.RIGHT_OF,tvUsernameId);
      userValueDimensions.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
    }
    private void passwordTextView(){
     passwordDimensions =  new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        passwordDimensions.addRule(RelativeLayout.BELOW,etUsernameId);
        passwordDimensions.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
     tvPassword.setText("Password");
     tvPassword.setId(tvPasswordId);
    }
    private void passwordEditText(){
        passwordValueDimensions = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        passwordValueDimensions.addRule(RelativeLayout.BELOW,etUsernameId);
        passwordValueDimensions.addRule(RelativeLayout.RIGHT_OF,tvPasswordId);
        passwordValueDimensions.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        etPassword.setId(etPasswordId);
    }
    private void loginButton(){
        loginDimensions = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        loginDimensions.addRule(RelativeLayout.BELOW,etPasswordId);
        loginDimensions.addRule(RelativeLayout.CENTER_HORIZONTAL);
        btnLogin.setText("Login");
        btnLogin.setId(btnLoginId);
        //btnLogin.setGravity(Gravity.CENTER_VERTICAL);
    }
}
