package com.example.assignment7;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
public class MainActivity extends AppCompatActivity {
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
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
