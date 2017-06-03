package com.plugtech.singlefragmentactivityexample;

import android.support.v4.app.Fragment;
import android.os.Bundle;

public class ParentActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new ChildFragment();
    }
}
