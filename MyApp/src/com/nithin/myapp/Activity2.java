package com.nithin.myapp;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends Activity{
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);

        Button next = (Button) findViewById(R.id.Button2);   /*setting up the button in activity 2 */
        next.setOnClickListener(new View.OnClickListener() {  /* handling the click of the button */
            public void onClick(View view) {
                Intent intent = new Intent(); 
                setResult(RESULT_OK, intent); /*Sendng the result back to MainActivity */
                finish();
            }

        });
}
}
