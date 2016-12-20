package jpcmarques.rsappmodules.pvm.slayercompanion.masterPages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import jpcmarques.rsappmodules.pvm.slayercompanion.R;

public class Vannaka extends MasterPageActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vannaka);
    }

    @Override
    public String getTitleBarText() {
        return "Vannaka";
    }

    @Override
    protected int getMonsterArrayID() {
        return R.array.vannaka_monsters;
    }
}
