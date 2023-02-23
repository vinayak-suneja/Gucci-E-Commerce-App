package com.example.assignment7;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
public class Login extends AppCompatActivity {
 EditText username, password;
 ImageButton login_btn, signup_btn;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_login);
 username = findViewById(R.id.username);
 password = findViewById(R.id.password);
 login_btn = findViewById(R.id.login_btn);
 signup_btn = findViewById(R.id.signup_btn);
 SQLiteDatabase db = openOrCreateDatabase("gucci",
Context.MODE_PRIVATE, null);
 db.execSQL("Create Table If Not Exists users(username varchar,
password varchar, email varchar);");
 login_btn.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 String querys="select * from users";
 Cursor cr = db.rawQuery(querys, null);
 String U = username.getText().toString();
 String P = password.getText().toString();
 int RowCount = cr.getCount();
 cr.moveToFirst();
 for(int i=0; i<RowCount;i++)
 {
 boolean ChanceU = U.equals(cr.getString(0));
 boolean ChanceP = P.equals(cr.getString(1));
 if (ChanceU == true && ChanceP == true)
 {
 Toast.makeText(getApplicationContext(),"Welcome " +
username.getText(), Toast.LENGTH_LONG).show();
 Intent Cat = new Intent(getApplicationContext(),
Category.class);
 startActivity(Cat);
 break;
 }
 cr.moveToNext();
 }
 }
 });
 signup_btn.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 Intent Reg = new Intent(getApplicationContext(),
Register.class);
 startActivity(Reg);
 }
 });
 }
 @Override
 public boolean onCreateOptionsMenu(Menu menu) {
 getMenuInflater().inflate(R.menu.menu, menu);
 return true;
 }
 @Override
 public boolean onOptionsItemSelected(@NonNull MenuItem item) {
 int id = item.getItemId();
 if (id == R.id.register) {
 Intent i = new Intent(getApplicationContext(), Register.class);
 startActivity(i);
 }
 if (id == R.id.login) {
 Intent i = new Intent(getApplicationContext(), Login.class);
 startActivity(i);
 }
 if (id == R.id.products) {
 Intent i = new Intent(getApplicationContext(), Category.class);
 startActivity(i);
 }
 if (id == R.id.cart) {
 Intent i = new Intent(getApplicationContext(), Cart.class);
 startActivity(i);
 }
 if (id == R.id.bill) {
 Intent i = new Intent(getApplicationContext(), Bill.class);
 startActivity(i);
 }
 return super.onOptionsItemSelected(item);
}} 
