package com.lucky.myactvity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
class NewActivity : AppCompatActivity() {
    private lateinit var etMobile_Number: EditText
    private lateinit var et_Password: EditText
    private lateinit var txtForgetPassword:TextView
    private lateinit var txtRegister: TextView
    private lateinit var btnLogin: Button
    private val validMobileNumber= "0123456789"
    private val validPassword = arrayOf("lucky","akash","himanshu")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        title="Log In"
        etMobile_Number=findViewById(R.id.etMobileNumber)
        et_Password=findViewById(R.id.etPassword)
        btnLogin=findViewById(R.id.btnLogin)
        txtRegister=findViewById(R.id.txtRegister)
        txtForgetPassword=findViewById(R.id.txtForgetPassword)



        btnLogin.setOnClickListener {
            val mobileNumber=etMobile_Number.text.toString()
            val password=et_Password.text.toString()
         if ((mobileNumber == validMobileNumber) && (validPassword.contains(password))){
             val intent=Intent(this@NewActivity, MainActivity::class.java)
             startActivity(intent)
         }else{
             Toast.makeText(
                 this@NewActivity,
                 "Incorrect Credentials",
                 Toast.LENGTH_LONG
             ).show()
         }
        }
    }
}
