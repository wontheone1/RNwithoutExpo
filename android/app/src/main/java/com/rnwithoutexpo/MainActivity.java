package com.rnwithoutexpo;

import android.view.KeyEvent;
import com.facebook.react.ReactActivity;
import com.github.kevinejohn.keyevent.KeyEventModule;

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is
   * used to schedule rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "RNwithoutExpo";
  }

  @Override // <--- Add this method if you want to react to keyDown
  public boolean onKeyDown(int keyCode, KeyEvent event) {

    // A. Prevent multiple events on long button press
    // In the default behavior multiple events are fired if a button
    // is pressed for a while. You can prevent this behavior if you
    // forward only the first event:
    // if (event.getRepeatCount() == 0) {
    // KeyEventModule.getInstance().onKeyDownEvent(keyCode, event);
    // }
    //
    // B. If multiple Events shall be fired when the button is pressed
    // for a while use this code:
    // KeyEventModule.getInstance().onKeyDownEvent(keyCode, event);
    //
    // Using B.
    KeyEventModule.getInstance().onKeyDownEvent(keyCode, event);

    // There are 2 ways this can be done:
    // 1. Override the default keyboard event behavior
    // super.onKeyDown(keyCode, event);
    // return true;

    // 2. Keep default keyboard event behavior
    // return super.onKeyDown(keyCode, event);

    // Using method #1 without blocking multiple
    super.onKeyDown(keyCode, event);
    return true;
  }
}
