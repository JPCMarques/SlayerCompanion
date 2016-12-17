package jpcmarques.rsappmodules.pvm.slayercompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import jpcmarques.rsappmodules.pvm.slayercompanion.masterPages.Chaeldar;
import jpcmarques.rsappmodules.pvm.slayercompanion.masterPages.DuradelLapalok;
import jpcmarques.rsappmodules.pvm.slayercompanion.masterPages.Kuradal;
import jpcmarques.rsappmodules.pvm.slayercompanion.masterPages.MazchnaAchtryn;
import jpcmarques.rsappmodules.pvm.slayercompanion.masterPages.Morvran;
import jpcmarques.rsappmodules.pvm.slayercompanion.masterPages.Sumona;
import jpcmarques.rsappmodules.pvm.slayercompanion.masterPages.Turael;
import jpcmarques.rsappmodules.pvm.slayercompanion.masterPages.Vannaka;

public class MainActivity extends AppCompatActivity {
    //Title bar
    private View options, info;

    //Text
    private TextView welcomeText, masterSelectionText;

    //Master list items
    private View turaelSpria, mazchnaAchtryn, vannaka, chaeldar, sumona, duradelLapalok, kuradal, morvran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        //Title bar
       /* options = findViewById(R.id.activity_main_options);
        info = findViewById(R.id.activity_main_info_icon);
        //Text
        welcomeText = (TextView) findViewById(R.id.activity_main_welcome_text);
        masterSelectionText = (TextView) findViewById(R.id.activity_main_master_selection_text);
        //Master list items
        turaelSpria = findViewById(R.id.activity_main_master_list_turael_spria);
        mazchnaAchtryn = findViewById(R.id.activity_main_master_list_mazchna_achtryn);
        vannaka = findViewById(R.id.activity_main_master_list_vannaka);
        chaeldar = findViewById(R.id.activity_main_master_list_chaeldar);
        sumona = findViewById(R.id.activity_main_master_list_sumona);
        duradelLapalok = findViewById(R.id.activity_main_master_list_duradel_lapalok);
        kuradal = findViewById(R.id.activity_main_master_list_kuradal);
        morvran = findViewById(R.id.activity_main_master_list_morvran);*/
    }

    public void turaelSpria(View v){
        Intent intent = new Intent(this, Turael.class);
        startActivity(intent);
    }

    public void mazchnaAchtryn(View v){
        Intent intent = new Intent(this, MazchnaAchtryn.class);
        startActivity(intent);
    }

    public void vannaka(View v){
        Intent intent = new Intent(this, Vannaka.class);
        startActivity(intent);
    }

    public void chaeldar(View v){
        Intent intent = new Intent(this, Chaeldar.class);
        startActivity(intent);
    }

    public void sumona(View v){
        Intent intent = new Intent(this, Sumona.class);
        startActivity(intent);
    }

    public void duradelLapalok(View v){
        Intent intent = new Intent(this, DuradelLapalok.class);
        startActivity(intent);
    }

    public void kuradal(View v){
        Intent intent = new Intent(this, Kuradal.class);
        startActivity(intent);
    }

    public void morvran(View v){
        Intent intent = new Intent(this, Morvran.class);
        startActivity(intent);
    }
}
