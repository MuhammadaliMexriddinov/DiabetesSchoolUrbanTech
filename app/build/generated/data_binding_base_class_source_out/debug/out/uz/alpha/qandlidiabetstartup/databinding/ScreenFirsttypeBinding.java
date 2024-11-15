// Generated by view binder compiler. Do not edit!
package uz.alpha.qandlidiabetstartup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import uz.alpha.qandlidiabetstartup.R;

public final class ScreenFirsttypeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView btnBack;

  @NonNull
  public final LinearLayout btnBread;

  @NonNull
  public final LinearLayout btnIndtructor;

  @NonNull
  public final ImageView btnInfo;

  @NonNull
  public final LinearLayout btnInsulin;

  @NonNull
  public final LinearLayout btnpdf;

  @NonNull
  public final ConstraintLayout f1;

  private ScreenFirsttypeBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView btnBack,
      @NonNull LinearLayout btnBread, @NonNull LinearLayout btnIndtructor,
      @NonNull ImageView btnInfo, @NonNull LinearLayout btnInsulin, @NonNull LinearLayout btnpdf,
      @NonNull ConstraintLayout f1) {
    this.rootView = rootView;
    this.btnBack = btnBack;
    this.btnBread = btnBread;
    this.btnIndtructor = btnIndtructor;
    this.btnInfo = btnInfo;
    this.btnInsulin = btnInsulin;
    this.btnpdf = btnpdf;
    this.f1 = f1;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ScreenFirsttypeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ScreenFirsttypeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.screen_firsttype, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ScreenFirsttypeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnBack;
      ImageView btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.btnBread;
      LinearLayout btnBread = ViewBindings.findChildViewById(rootView, id);
      if (btnBread == null) {
        break missingId;
      }

      id = R.id.btnIndtructor;
      LinearLayout btnIndtructor = ViewBindings.findChildViewById(rootView, id);
      if (btnIndtructor == null) {
        break missingId;
      }

      id = R.id.btnInfo;
      ImageView btnInfo = ViewBindings.findChildViewById(rootView, id);
      if (btnInfo == null) {
        break missingId;
      }

      id = R.id.btnInsulin;
      LinearLayout btnInsulin = ViewBindings.findChildViewById(rootView, id);
      if (btnInsulin == null) {
        break missingId;
      }

      id = R.id.btnpdf;
      LinearLayout btnpdf = ViewBindings.findChildViewById(rootView, id);
      if (btnpdf == null) {
        break missingId;
      }

      id = R.id.f1;
      ConstraintLayout f1 = ViewBindings.findChildViewById(rootView, id);
      if (f1 == null) {
        break missingId;
      }

      return new ScreenFirsttypeBinding((ConstraintLayout) rootView, btnBack, btnBread,
          btnIndtructor, btnInfo, btnInsulin, btnpdf, f1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
