// Generated by view binder compiler. Do not edit!
package uz.alpha.qandlidiabetstartup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import uz.alpha.qandlidiabetstartup.R;

public final class ScreenScoreFindBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnMenu;

  @NonNull
  public final TextView txt2;

  @NonNull
  public final TextView txt3;

  @NonNull
  public final TextView txtTitle;

  private ScreenScoreFindBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnMenu,
      @NonNull TextView txt2, @NonNull TextView txt3, @NonNull TextView txtTitle) {
    this.rootView = rootView;
    this.btnMenu = btnMenu;
    this.txt2 = txt2;
    this.txt3 = txt3;
    this.txtTitle = txtTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ScreenScoreFindBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ScreenScoreFindBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.screen_score_find, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ScreenScoreFindBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnMenu;
      Button btnMenu = ViewBindings.findChildViewById(rootView, id);
      if (btnMenu == null) {
        break missingId;
      }

      id = R.id.txt2;
      TextView txt2 = ViewBindings.findChildViewById(rootView, id);
      if (txt2 == null) {
        break missingId;
      }

      id = R.id.txt3;
      TextView txt3 = ViewBindings.findChildViewById(rootView, id);
      if (txt3 == null) {
        break missingId;
      }

      id = R.id.txtTitle;
      TextView txtTitle = ViewBindings.findChildViewById(rootView, id);
      if (txtTitle == null) {
        break missingId;
      }

      return new ScreenScoreFindBinding((ConstraintLayout) rootView, btnMenu, txt2, txt3, txtTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}