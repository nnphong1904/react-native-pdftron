package com.pdftron.reactnative.nativeviews;

import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.pdftron.reactnative.R;
import com.pdftron.collab.ui.viewer.CollabViewerTabHostFragment2;
public class RNCollabViewerCtrlTabHostFragment extends CollabViewerTabHostFragment2 {
    @Override
    protected void initViews() {
        super.initViews();
        mSwitcherButton = mToolbar.findViewById(R.id.switcher_button);
        Toolbar.LayoutParams layoutParams = new Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT);
        layoutParams.gravity = Gravity.CENTER;
        TextView title = mSwitcherButton.findViewById(R.id.title);
        Typeface bold = Typeface.createFromAsset(getContext().getAssets(), "fonts/Axiforma-Bold.otf");
        title.setTypeface(bold);
        title.setTextSize(20);
        mSwitcherButton.setLayoutParams(layoutParams);
        
    }
} 
