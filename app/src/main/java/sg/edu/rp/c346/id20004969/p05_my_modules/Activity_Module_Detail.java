package sg.edu.rp.c346.id20004969.p05_my_modules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_Module_Detail extends AppCompatActivity {
    TextView Semester;
    TextView Credit;
    TextView Module_code;
    TextView AcademicYear;
    TextView Ven;
    TextView Module_name;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__module__detail);
        AcademicYear = findViewById(R.id.Acad);
        Semester = findViewById(R.id.sem);
        Credit = findViewById(R.id.credit);
        Module_name = findViewById(R.id.ModName);
        Ven = findViewById(R.id.venue);
        back = findViewById(R.id.btnback);
        Module_code = findViewById(R.id.ModCode);

        Intent received = getIntent();
        String ModCode = received.getStringExtra("ModuleCode");
        String ModName = received.getStringExtra("ModuleName");
        int AcadYear = received.getIntExtra("AcademicYear",0);
        int Sem = received.getIntExtra("Semester",0);
        int Creditz = received.getIntExtra("ModuleCredit",0);
        String Venue = received.getStringExtra("Venue");

        Module_code.setText("Module code : " + ModCode);
        Module_name.setText("Module Name : " + ModName);
        AcademicYear.setText("Academic Year : " + AcadYear);
        Semester.setText("Semester : " + Sem);
        Credit.setText("Module Credit : " + Creditz);
        Ven.setText("Venue : " + Venue);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                finish(); // back to the home page
            }
        });

    }
}