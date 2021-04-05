package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginbutton.setOnClickListener {
            val username= usernameinput.text
            val password= passwordinput.text
            if(TextUtils.isEmpty(username)){
                Toast.makeText(this, "Please enter username",Toast.LENGTH_LONG).show()
            }else if(TextUtils.isEmpty(password)){
                Toast.makeText(this,"please enter password",Toast.LENGTH_LONG).show()
            }else
                    {
//                        Toast.makeText(this,"enter username is ${username}and password is ${password} " ,Toast.LENGTH_LONG).show()
                    loginbutton.setOnClickListener {
                        var status=if(usernameinput.text.toString().equals("subbarao")&&passwordinput.text.toString().equals("Subbupa1"))"logged in successfully" else "Login Failed"
                        Toast.makeText(this,status,Toast.LENGTH_SHORT).show()
                    }
                    }
        }



    }
}