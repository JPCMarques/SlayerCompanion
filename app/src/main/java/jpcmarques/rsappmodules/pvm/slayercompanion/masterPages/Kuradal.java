package jpcmarques.rsappmodules.pvm.slayercompanion.masterPages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import jpcmarques.rsappmodules.pvm.slayercompanion.R;

public class Kuradal extends MasterPageActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuradal);
    }

    @Override
    public String getTitleBarText() {
        return "Mazchna/Achtryn";
    }

    @Override
    protected int getMonsterArrayID() {
        return R.array.kuradal_monsters;
    }
}
