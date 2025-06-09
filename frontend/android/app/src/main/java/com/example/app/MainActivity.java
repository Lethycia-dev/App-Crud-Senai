package com.example.app;
import android.webkit.webSettings;
import android.os.Bundle;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        getBrige().getwebView().getSettings().setdomStorageEnabled(true);
     }
}
