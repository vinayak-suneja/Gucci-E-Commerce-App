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
import android.widget.TextView;
public class Bill extends AppCompatActivity {
 TextView p1, p2, p3, pr1, pr2, pr3, total1, total2, total3, total, bq1,
bq2, bq3;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_bill);
 p1 = findViewById(R.id.p1);
 p2 = findViewById(R.id.p2);
 p3 = findViewById(R.id.p3);
 bq1 = findViewById(R.id.bq1);
 bq2 = findViewById(R.id.bq2);
 bq3 = findViewById(R.id.bq3);
 pr1 = findViewById(R.id.pr1);
 pr2 = findViewById(R.id.pr2);
 pr3 = findViewById(R.id.pr3);
 total1 = findViewById(R.id.total1);
 total2 = findViewById(R.id.total2);
 total3 = findViewById(R.id.total3);
 total = findViewById(R.id.total);
 bq1.setVisibility(View.INVISIBLE);
 bq2.setVisibility(View.INVISIBLE);
 bq3.setVisibility(View.INVISIBLE);
 SQLiteDatabase db = openOrCreateDatabase("Shop",
Context.MODE_PRIVATE, null);
 db.execSQL("Create table If not Exists ProductInfo(Name Varchar,
Price Int)");
 db.execSQL("Create table If not Exists PriceInfo(qnty Varchar,
subprice Int)");
 String query = "select * from ProductInfo";
 Cursor sql = db.rawQuery(query, null);
 try {
 sql.moveToFirst();
 pr1.setText(sql.getString(0));
 p1.setText(sql.getString(1));
 sql.moveToNext();
 pr2.setText(sql.getString(0));
 p2.setText( sql.getString(1));
 sql.moveToNext();
 pr3.setText(sql.getString(0));
 p3.setText(sql.getString(1));
 }
 catch (Exception e){
 }
 String query1 = "select * from PriceInfo";
 Cursor Sql = db.rawQuery(query1, null);
 try {
 Sql.moveToFirst();
 bq1.setText(Sql.getString(0));
 total1.setText(Sql.getString(1));
 Sql.moveToNext();
 bq2.setText(Sql.getString(0));
 total2.setText( Sql.getString(1));
 Sql.moveToNext();
 bq3.setText(Sql.getString(0));
 total3.setText(Sql.getString(1));
 }
 catch (Exception e){
 }
 if (!(pr1.getText().toString().isEmpty())) {
 bq1.setVisibility(View.VISIBLE);
 }
 if (!(pr2.getText().toString().isEmpty())) {
 bq2.setVisibility(View.VISIBLE);
 }
 if (!(pr3.getText().toString().isEmpty())) {
 bq3.setVisibility(View.VISIBLE);
 }
 int possible1 = 0;
 int possible2 = 0;
 int possible3 = 0;
 try {
 possible1 = Integer.parseInt(total1.getText().toString());
 possible2 = Integer.parseInt(total2.getText().toString());
 possible3 = Integer.parseInt(total3.getText().toString());
 int T = possible1 + possible2 + possible3;
 total.setText("$ "+T+"");
 }
 catch (Exception whTy){
 int T = possible1 + possible2 + possible3;
 total.setText("$ "+T+"");
 }
 db.execSQL("drop table PriceInfo");
 db.execSQL("drop table ProductInfo");
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
