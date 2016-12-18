package jpcmarques.rsappmodules.pvm.slayercompanion.masterPages;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import jpcmarques.rsappmodules.pvm.slayercompanion.R;
import jpcmarques.rsappmodules.pvm.slayercompanion.util.TitleBarFragment;

public class TuraelSpria extends MasterPageActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turael_spria);
    }

    @Override
    public String getTitleBarText() {
        return "Turael/Spria";
    }
}
