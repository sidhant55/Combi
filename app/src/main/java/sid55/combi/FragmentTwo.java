package sid55.combi;


import android.os.Bundle;
import android.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {

    WebView webView;

    public FragmentTwo() {
        // Required empty public constructor
    }

    public WebView webview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_two_layout, container, false);
        webView = (WebView) v.findViewById(R.id.webview2);
        webView.loadUrl("http://www.twitter.com/");

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
