package jpcmarques.rsappmodules.pvm.slayercompanion.masterPages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import jpcmarques.rsappmodules.pvm.slayercompanion.R;

public class DuradelLapalok extends MasterPageActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duradel_lapalok);
    }

    @Override
    public String getTitleBarText() {
        return "Duradel/Lapalok";
    }

    @Override
    protected int getMonsterArrayID() {
        return R.array.duradel_or_lapalok_monsters;
    }
}
