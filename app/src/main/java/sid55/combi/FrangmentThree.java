package sid55.combi;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class FrangmentThree extends Fragment {
    WebView webView;

    public FrangmentThree() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_three_layout, container, false);
        webView=(WebView)v.findViewById(R.id.webview3);
        webView.loadUrl("https://linkedin.com");

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
