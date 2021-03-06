package com.cybrilla.nearby;

import android.app.ProgressDialog;
import android.support.annotation.VisibleForTesting;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by sivaavatar on 11/26/2017.
 */

class CommonActivity extends FragmentActivity {

    @VisibleForTesting
    public ProgressDialog mProgressDialog;

    public void showProgressDialog() {
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(this);
            mProgressDialog.setMessage(getString(R.string.loading));
            mProgressDialog.setIndeterminate(true);
        }

        mProgressDialog.show();
    }

    public void hideProgressDialog() {
        if (mProgressDialog != null && mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        hideProgressDialog();
    }

}