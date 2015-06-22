package geolab.lectures.lecture6.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

import geolab.lectures.lecture6.R;

/**
 * Created by Jay on 6/17/2015.
 */
public class DialogA extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
                .setTitle("Alert Dialog Example")
                .setIcon(R.mipmap.ic_launcher)
                .setMessage("Qachbara Dondurma ?")
                .setPositiveButton("5 Lari", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity(), "Positive", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("5 ara 100", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity(), "Negative", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNeutralButton("Vabshe 10 girs", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity(), "Neutral", Toast.LENGTH_SHORT).show();
                    }
                }).show();
    }
}
