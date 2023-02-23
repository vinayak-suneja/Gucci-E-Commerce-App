package com.example.assignment7;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
public class Category extends AppCompatActivity {
 Spinner category;
 ImageButton submit;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_category);
 category = findViewById(R.id.catergory);
 submit = findViewById(R.id.submit);
 String[] prod = {"Watches","Fashion Jewelry","Décor & Lifestyle"};
 ArrayAdapter<String> c=new
ArrayAdapter<String>(getApplicationContext(),
android.R.layout.simple_spinner_item, prod);

c.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
 category.setAdapter(c);
 category.setOnItemSelectedListener(new
AdapterView.OnItemSelectedListener() {
 @Override
 public void onItemSelected(AdapterView<?> adapterView, View
view, int i, long l) {
 if (i == 0){
 submit.setOnClickListener(new View.OnClickListener() {
 @Override
public void onClick(View view) {
 Intent i = new Intent(getApplicationContext(),
Products.class);
 String n = "1" ;
i.putExtra("list",n);
 startActivity(i);
 }
 });
 }
 if (i == 1){
 submit.setOnClickListener(new View.OnClickListener() {
 @Override
public void onClick(View view) {
 Intent i = new Intent(getApplicationContext(),
Products.class);
 String n = "2" ;
i.putExtra("list",n);
 startActivity(i);
 }
 });
 }
 if (i == 2){
 submit.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 Intent i = new Intent(getApplicationContext(),
Products.class);
 String n = "3" ;
i.putExtra("list",n);
 startActivity(i);
 }
 });
 }
 }
 @Override
 public void onNothingSelected(AdapterView<?> adapterView) {
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
