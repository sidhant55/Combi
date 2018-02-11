package sid55.combi;

import android.app.Activity;
import android.app.FragmentManager;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebViewFragment;
import android.widget.Button;

//comment
public class MainActivity extends Activity {
    boolean status=false;
    Button bn1,bn2,bn3;
    FragmentOne f1;
    FragmentTwo f2;
    FrangmentThree f3;
    home f5;
    int c=0,d=0;
    int current;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        f5 = new home();
        fragmentTransaction.add(R.id.webView, f5);
        fragmentTransaction.commit();

        bn1=(Button)findViewById(R.id.bn1);
        bn2=(Button)findViewById(R.id.bn2);
        bn3=(Button)findViewById(R.id.bn3);
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current=1;
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                f1 = new FragmentOne();
                fragmentTransaction.replace( R.id.webView, f1 ).addToBackStack( "tag" ).commit();

            }
        });
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current=2;
                FragmentManager fragmentManager = getFragmentManager();

                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                f2 = new FragmentTwo();
                fragmentTransaction.replace( R.id.webView, f2 ).addToBackStack( "tag" ).commit();
            }
        });
        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current=3;
                FragmentManager fragmentManager = getFragmentManager();

                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                f3 = new FrangmentThree();
                fragmentTransaction.replace( R.id.webView, f3 ).addToBackStack( "tag" ).commit();
            }
        });
    }

    @Override
    public void onBackPressed()
    {
        if (d==1)
            finish();
        if (current==1) {
            c = f1.Back();
            d = 0;
        }
        else if (current==2) {
            c = f2.Back();
            d = 0;
        }
        else if (current==3) {
            c = f3.Back();
            d = 0;
        }
        if (c==1) {
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            f5 = new home();
            fragmentTransaction.add(R.id.webView, f5);
            fragmentTransaction.commit();
            d=1;
        }

    }
    public void finish1()
    {
        finish();
    }

}
