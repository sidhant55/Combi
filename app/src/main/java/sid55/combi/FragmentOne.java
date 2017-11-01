package sid55.combi;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;


public class FragmentOne extends Fragment {

    private WebView webView;
    public FragmentOne() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_one_layout, container, false);
        webView = (WebView) v.findViewById(R.id.webview1);
        webView.loadUrl("https://facebook.com");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());
        return v;
    }

    public int Back() {
        if (webView.canGoBack()) {
            webView.goBack();
            return 0;
        }
        else {
            return 1;
        }
    }

}

