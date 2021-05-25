package sg.edu.rp.c346.id20004969.p05_my_modules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView c346;
    TextView c349;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c346 = findViewById(R.id.C346);
        c349 = findViewById(R.id.C349);

        c346.setOnClickListener(new View.OnClickListener() { // textview
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,Activity_Module_Detail.class);
                intent.putExtra("ModuleCode","C346");
                intent.putExtra("ModuleName","Android Programming");
                intent.putExtra("AcademicYear",2020);
                intent.putExtra("Semester",2);
                intent.putExtra("ModuleCredit",6);
                intent.putExtra("Venue","W62E");


                startActivity(intent);
            }
        });
        c349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this,Activity_Module_Detail.class);
                intent.putExtra("ModuleCode","C208");
                // informs second activity to display information
                intent.putExtra("ModuleName","Web App Development");
                intent.putExtra("AcademicYear",2020);
                intent.putExtra("Semester",2);
                intent.putExtra("ModuleCredit",6);
                intent.putExtra("Venue","HBL");

                startActivity(intent);
            }
        });
    }
}