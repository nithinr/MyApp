package com.nithin.myapp;



import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;



	import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

	 public class MainActivity extends ListActivity { 
	 
	 static final String[] CRICKETERS = new String[] { /*String array holding the cricketer names */
	   "Sachin", "Dravid", "Ganguly", "Sehwag",
	   "Kapil Dev", "Dhoni", "Kohli", "Jadeja",
	   "Bhuvaneshwar", "Ashwin", "Zaheer", "Gambhir",
	   "Shikhar Dhawan", "Praveen", "Shami", "Dinesh","Yusuf Pathan","Irfan Pathan",
	   "Kumble", "Srinath", "Sreesanth", "Uthappa", "Manish Pandey",
	   "Brett Lee", "Ponting", "Hayden", "Mcgrath",
	   "Clarke", "Jayasurya", "Sangakara",
	   "Malinga", "Dilshan","Atapattu","Herath",
	   "Pietersen", "Cook", "Siddle","Panesar","Collingwood","Anderson",
	   "Gayle", "Bravo", "Ryder", "Vettori","Fleming",
	   "Cameroon White", "Saeed Anwar", "Akthar", "Akmal","Younis"
	 };
	   
	   
	 
	   /** Called when the activity is first created. */
	   @Override
	   public void onCreate(Bundle savedInstanceState) {
	       super.onCreate(savedInstanceState);
	       setContentView(R.layout.activity_main);
	        
	       setListAdapter(new ArrayAdapter<String>(this,
	               android.R.layout.simple_list_item_1, CRICKETERS)); /* array adapter is used to connect the string array to the listview*/
	       getListView().setTextFilterEnabled(true); /*this line enables the type filter window */
	   }

	 @Override
	 protected void onListItemClick(ListView l, View v, int position, long id) { /* handling the click of an item in the list */
	  super.onListItemClick(l, v, position, id);
	  
	  new AlertDialog.Builder(this) /*alert dialog box is created */
	   .setTitle("Hello")           /* setting the title of the dialog box to hello */
	   .setMessage("I am " + getListView().getItemAtPosition(position)) /* setting the message to be diaplayed in the dialog box  */
	   .setPositiveButton("OK", 
	     new DialogInterface.OnClickListener() {
	      public void onClick(DialogInterface dialog, int which) {}}
	     )                                               /*Handling the positive button in the dialog box*/
	   .show();
	  
	  
	 }
	 public void nextButton(View button){
		 Intent intent = new Intent(this, Activity2.class);  /* Navigating to the activity 2 */
	        startActivity(intent);
	        
	    } 
	  
	}
    
