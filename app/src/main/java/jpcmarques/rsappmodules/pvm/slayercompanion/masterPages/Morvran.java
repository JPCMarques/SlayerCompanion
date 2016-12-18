package jpcmarques.rsappmodules.pvm.slayercompanion.masterPages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import jpcmarques.rsappmodules.pvm.slayercompanion.R;

public class Morvran extends MasterPageActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morvran);
    }

    @Override
    public String getTitleBarText() {
        return "Morvran";
    }
}
