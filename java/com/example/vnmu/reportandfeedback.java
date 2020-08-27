package com.example.vnmu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Message;
import android.renderscript.ScriptGroup;
import android.text.InputType;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class reportandfeedback extends AppCompatActivity {

    //khai báo các biến
    private RadioGroup radioGroup;
    private RadioButton radioButton1, radioButton2, radioButton3, radioButton4, radioButton5;
    private EditText editText;
    private Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportandfeedback);
        //Ánh xạ đối chiếu các ID
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        radioButton4 = (RadioButton) findViewById(R.id.radioButton4);
        radioButton5 = (RadioButton) findViewById(R.id.radioButton5);
        editText = (EditText) findViewById(R.id.editText1);
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);



        btn1.setOnClickListener(new View.OnClickListener() { //nhận sự kiện click
            @Override
            public void onClick(View view) {
                String XacNhan = "Cảm ơn bạn đã nhận xét";
                if (radioButton1.isChecked()) {
                    Toast.makeText(getApplicationContext(), XacNhan, Toast.LENGTH_SHORT).show(); //khi người dùng click vào button, sẽ tự động hiện lên 1 dòng thông báo là biến XacNhan đã khai báo dạng String ở trên
                    ClearCheck();
                } else if (radioButton2.isChecked()) {
                    Toast.makeText(getApplicationContext(), XacNhan, Toast.LENGTH_SHORT).show();// như trên
                    ClearCheck();
                } else if (radioButton3.isChecked()) {
                    Toast.makeText(getApplicationContext(), XacNhan, Toast.LENGTH_SHORT).show();
                    ClearCheck();
                } else if (radioButton4.isChecked()) {
                    Toast.makeText(getApplicationContext(), XacNhan, Toast.LENGTH_SHORT).show();
                    ClearCheck();
                } else if (radioButton5.isChecked()) {
                    Toast.makeText(getApplicationContext(), XacNhan, Toast.LENGTH_SHORT).show();
                    ClearCheck();
                } else {
                    Toast.makeText(getApplicationContext(), "Mời bạn chọn", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() { //nhận sự kiện click vào button 2
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString().trim();
                if (text.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Mời bạn nhập ký tự!!!", Toast.LENGTH_SHORT).show();
                } else{
                    editText.setText("");
                    Toast.makeText(getApplicationContext(), "Cảm ơn bạn đã phản hồi!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void ClearCheck(){
        radioGroup.clearCheck();
    }
}