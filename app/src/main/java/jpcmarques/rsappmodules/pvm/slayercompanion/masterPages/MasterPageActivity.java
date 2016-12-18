package jpcmarques.rsappmodules.pvm.slayercompanion.masterPages;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

import jpcmarques.rsappmodules.pvm.slayercompanion.R;
import jpcmarques.rsappmodules.pvm.slayercompanion.util.TitleBarFragment;

/**
 * Created by joaop on 17/12/2016.
 */

public abstract class MasterPageActivity extends AppCompatActivity implements TitleBarFragment.TitleBarSupplier {

    @Override
    public int getLeftDrawableResID() {
        return R.drawable.ic_back;
    }

    @Override
    public int getRightDrawableResID() {
        return 0;
    }

    @Override
    public View.OnClickListener getLeftIconOnClickListener() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        };
    }

    @Override
    public View.OnClickListener getRightIconOnClickListener() {
        return null;
    }

    @Override
    public View.OnClickListener getTitleTextOnClickListener() {
        return null;
    }
}
