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
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
public class Products extends AppCompatActivity {
 CheckBox prod1, prod2, prod3;
 TextView price1, price2, price3;
 ImageButton atc;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_products);
 atc = findViewById(R.id.atc);
 prod1 = findViewById(R.id.prod1);
 prod2 = findViewById(R.id.prod2);
 prod3 = findViewById(R.id.prod3);
 price1 = findViewById(R.id.price1);
 price2 = findViewById(R.id.price2);
 price3 = findViewById(R.id.price3);
 String s ="0";
 SQLiteDatabase db = openOrCreateDatabase("Shop",
Context.MODE_PRIVATE, null);
 db.execSQL("Create table If not Exists ProductInfo(Name Varchar,
Price Int)");
 Bundle bundle = getIntent().getExtras();
 try {
 s = bundle.getString("list");
 } catch (Exception e) {
 s = "0";
 Toast.makeText(getApplicationContext(), "Exception =" + e + "",
 Toast.LENGTH_SHORT).show();
 }
 switch (s) {
 case "1":
 String aprod1 = "G-Timeless watch Green 36mm";
 int P1 = 1500;
 String aprod2 = "G-Timeless watch Gold 36mm";
 int P2 = 1150;
 String aprod3 = "Grip watch 40mm";
 int P3 = 1650;
 prod1.setText(aprod1);
 price1.setText("$ " + P1);
 prod2.setText(aprod2);
 price2.setText("$ " + P2);
 prod3.setText(aprod3);
 price3.setText("$ " + P3);
 atc.setOnClickListener(new View.OnClickListener() {
 @Override
public void onClick(View view) {
 if (prod1.isChecked()) {
 String A = "Insert into ProductInfo Values('" +
aprod1 + "','" + P1 + "')";
 db.execSQL(A);
 }
if (prod2.isChecked()) {
 String B = "Insert into ProductInfo Values('" +
aprod2 + "','" + P2 + "')";
 db.execSQL(B);
 }
if (prod3.isChecked()) {
 String C = "Insert into ProductInfo Values('" +
aprod3 + "','" + P3 + "')";
 db.execSQL(C);
 }
 Intent c = new Intent(getApplicationContext(),
Cart.class);
 startActivity(c);
 }
 });
 break;
 case "2":
 String bprod1 = "Lion head ring with crystal";
 int bP1 = 430;
 String bprod2 = "Crystal heart bracelet";
 int bP2 = 530;
 String bprod3 = "Feline head cufflinks with Interlocking
G";
 int bP3 = 295;
 prod1.setText(bprod1);
 price1.setText("$ " + bP1);
 prod2.setText(bprod2);
 price2.setText("$ " + bP2);
 prod3.setText(bprod3);
 price3.setText("$ " + bP3);
 atc.setOnClickListener(new View.OnClickListener() {
 @Override
public void onClick(View view) {
 if (prod1.isChecked()) {
 String A = "Insert into ProductInfo Values('" +
bprod1 + "','" + bP1 + "')";
 db.execSQL(A);
 }
if (prod2.isChecked()) {
 String B = "Insert into ProductInfo Values('" +
bprod2 + "','" + bP2 + "')";
 db.execSQL(B);
 }
if (prod3.isChecked()) {
 String C = "Insert into ProductInfo Values('" +
bprod3 + "','" + bP3 + "')";
 db.execSQL(C);
 }
 Intent c = new Intent(getApplicationContext(),
Cart.class);
 startActivity(c);
 }
 });
 break;
 case "3":
 String cprod1 = "Inventum medium murano candle";
 int cP1 = 325;
 String cprod2 = "Gucci zodiac map trinket tray";
 int cP2 = 330;
 String cprod3 = "Rose mug";
 int cP3 = 300;
 prod1.setText(cprod1);
 price1.setText("$ " + cP1);
 prod2.setText(cprod2);
 price2.setText("$ " + cP2);
 prod3.setText(cprod3);
 price3.setText("$ " + cP3);
 atc.setOnClickListener(new View.OnClickListener() {
 @Override
public void onClick(View view) {
 if (prod1.isChecked()) {
 String A = "Insert into ProductInfo Values('" +
cprod1 + "','" + cP1 + "')";
 db.execSQL(A);
 }
if (prod2.isChecked()) {
 String B = "Insert into ProductInfo Values('" +
cprod2 + "','" + cP2 + "')";
 db.execSQL(B);
 }
if (prod3.isChecked()) {
 String C = "Insert into ProductInfo Values('" +
cprod3 + "','" + cP3 + "')";
 db.execSQL(C);
 }
 Intent c = new Intent(getApplicationContext(),
Cart.class);
 startActivity(c);
 }
 });
 break;
 }
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
