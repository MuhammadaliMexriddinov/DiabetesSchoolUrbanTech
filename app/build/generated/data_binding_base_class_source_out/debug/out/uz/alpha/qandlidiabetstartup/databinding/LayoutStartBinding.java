// Generated by view binder compiler. Do not edit!
package uz.alpha.qandlidiabetstartup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import uz.alpha.qandlidiabetstartup.R;

public final class LayoutStartBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton btnStart;

  @NonNull
  public final CheckBox checkbox;

  @NonNull
  public final ConstraintLayout field1;

  @NonNull
  public final ImageView imageLogo;

  @NonNull
  public final ConstraintLayout m1;

  @NonNull
  public final TextView txt1;

  @NonNull
  public final TextView txt2;

  @NonNull
  public final TextView txt3;

  private LayoutStartBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatButton btnStart,
      @NonNull CheckBox checkbox, @NonNull ConstraintLayout field1, @NonNull ImageView imageLogo,
      @NonNull ConstraintLayout m1, @NonNull TextView txt1, @NonNull TextView txt2,
      @NonNull TextView txt3) {
    this.rootView = rootView;
    this.btnStart = btnStart;
    this.checkbox = checkbox;
    this.field1 = field1;
    this.imageLogo = imageLogo;
    this.m1 = m1;
    this.txt1 = txt1;
    this.txt2 = txt2;
    this.txt3 = txt3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutStartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutStartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_start, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutStartBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnStart;
      AppCompatButton btnStart = ViewBindings.findChildViewById(rootView, id);
      if (btnStart == null) {
        break missingId;
      }

      id = R.id.checkbox;
      CheckBox checkbox = ViewBindings.findChildViewById(rootView, id);
      if (checkbox == null) {
        break missingId;
      }

      id = R.id.field1;
      ConstraintLayout field1 = ViewBindings.findChildViewById(rootView, id);
      if (field1 == null) {
        break missingId;
      }

      id = R.id.image_logo;
      ImageView imageLogo = ViewBindings.findChildViewById(rootView, id);
      if (imageLogo == null) {
        break missingId;
      }

      id = R.id.m1;
      ConstraintLayout m1 = ViewBindings.findChildViewById(rootView, id);
      if (m1 == null) {
        break missingId;
      }

      id = R.id.txt1;
      TextView txt1 = ViewBindings.findChildViewById(rootView, id);
      if (txt1 == null) {
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

      return new LayoutStartBinding((ConstraintLayout) rootView, btnStart, checkbox, field1,
          imageLogo, m1, txt1, txt2, txt3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
