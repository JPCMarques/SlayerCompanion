package jpcmarques.rsappmodules.pvm.slayercompanion.masterPages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import jpcmarques.rsappmodules.pvm.slayercompanion.R;

public class Chaeldar extends MasterPageActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chaeldar);
    }

    @Override
    public String getTitleBarText() {
        return "Chaeldar";
    }

    @Override
    protected int getMonsterArrayID() {
        return R.array.chaeldar_monsters;
    }
}
