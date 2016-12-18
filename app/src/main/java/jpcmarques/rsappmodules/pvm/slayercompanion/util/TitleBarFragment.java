package jpcmarques.rsappmodules.pvm.slayercompanion.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import jpcmarques.rsappmodules.pvm.slayercompanion.R;

/**
 * Created by joaop on 17/12/2016.
 */

public class TitleBarFragment extends Fragment {
    TitleBarSupplier supplier;
    ImageView leftIcon, rightIcon;
    TextView text;

    public interface TitleBarSupplier{
        int getLeftDrawableResID();
        int getRightDrawableResID();
        String getTitleBarText();
        View.OnClickListener getLeftIconOnClickListener();
        View.OnClickListener getRightIconOnClickListener();
        View.OnClickListener getTitleTextOnClickListener();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_title_bar, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Activity container = getActivity();

        try {
            supplier = (TitleBarSupplier) container;
        }catch (ClassCastException cce){
            throw new ClassCastException(container.toString() + "must implement TitleBarSupplier");
        }

        leftIcon = (ImageView) view.findViewById(R.id.title_bar_fragment_left_icon);
        rightIcon = (ImageView) view.findViewById(R.id.title_bar_fragment_right_icon);
        text = (TextView) view.findViewById(R.id.title_bar_fragment_text);

        int leftResID = supplier.getLeftDrawableResID();
        int rightResID = supplier.getRightDrawableResID();
        String titleBarText = supplier.getTitleBarText();

        if(leftResID != 0) {
            leftIcon.setBackgroundResource(leftResID);
            leftIcon.setVisibility(View.VISIBLE);
        }

        if(rightResID != 0){
            rightIcon.setBackgroundResource(supplier.getRightDrawableResID());
            rightIcon.setVisibility(View.VISIBLE);
        }

        if(titleBarText != null){
            text.setText(supplier.getTitleBarText());
            text.setVisibility(View.VISIBLE);
        }

        View.OnClickListener liconlistener = supplier.getLeftIconOnClickListener(),
                riconListener = supplier.getRightIconOnClickListener(),
                titleListener = supplier.getTitleTextOnClickListener();

        if(liconlistener != null) leftIcon.setOnClickListener(liconlistener);
        if(riconListener != null) rightIcon.setOnClickListener(riconListener);
        if(titleListener != null) text.setOnClickListener(titleListener);
    }
}
