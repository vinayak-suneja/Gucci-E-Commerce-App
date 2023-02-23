package com.example.assignment7;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
public class Register extends AppCompatActivity {
 EditText name, mail, pass;
 ImageButton sign_up;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_register);
 name = findViewById(R.id.name);
 mail = findViewById(R.id.mail);
 pass = findViewById(R.id.pass);
 sign_up = findViewById(R.id.sign_up);
 SQLiteDatabase db = openOrCreateDatabase("gucci",
Context.MODE_PRIVATE, null);
 db.execSQL("Create Table If Not Exists users(username varchar,
password varchar, email varchar);");
 sign_up.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 String q = "Insert into users
Values('"+name.getText().toString()+"','"+pass.getText().toString()+"','"+m
ail.getText().toString()+"')";
 db.execSQL(q);
 Toast.makeText(getApplicationContext(),"user " +
name.getText()+ " Added!", Toast.LENGTH_LONG).show();
 name.getText().clear();
 pass.getText().clear();
 mail.getText().clear();
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
