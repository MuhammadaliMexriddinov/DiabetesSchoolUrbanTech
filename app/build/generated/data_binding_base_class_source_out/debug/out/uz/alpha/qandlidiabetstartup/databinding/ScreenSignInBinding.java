// Generated by view binder compiler. Do not edit!
package uz.alpha.qandlidiabetstartup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

public final class ScreenSignInBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView btnNext;

  @NonNull
  public final TextView btnParol;

  @NonNull
  public final AppCompatButton btnSignIn;

  @NonNull
  public final AppCompatButton btnSignInDoctor;

  @NonNull
  public final TextView btnSignUp;

  @NonNull
  public final LinearLayout fieldMain;

  @NonNull
  public final ImageView imgIcon;

  @NonNull
  public final TextView txtDescription;

  @NonNull
  public final EditText txtName;

  @NonNull
  public final EditText txtParol;

  private ScreenSignInBinding(@NonNull ConstraintLayout rootView, @NonNull TextView btnNext,
      @NonNull TextView btnParol, @NonNull AppCompatButton btnSignIn,
      @NonNull AppCompatButton btnSignInDoctor, @NonNull TextView btnSignUp,
      @NonNull LinearLayout fieldMain, @NonNull ImageView imgIcon, @NonNull TextView txtDescription,
      @NonNull EditText txtName, @NonNull EditText txtParol) {
    this.rootView = rootView;
    this.btnNext = btnNext;
    this.btnParol = btnParol;
    this.btnSignIn = btnSignIn;
    this.btnSignInDoctor = btnSignInDoctor;
    this.btnSignUp = btnSignUp;
    this.fieldMain = fieldMain;
    this.imgIcon = imgIcon;
    this.txtDescription = txtDescription;
    this.txtName = txtName;
    this.txtParol = txtParol;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ScreenSignInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ScreenSignInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.screen_sign_in, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ScreenSignInBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnNext;
      TextView btnNext = ViewBindings.findChildViewById(rootView, id);
      if (btnNext == null) {
        break missingId;
      }

      id = R.id.btnParol;
      TextView btnParol = ViewBindings.findChildViewById(rootView, id);
      if (btnParol == null) {
        break missingId;
      }

      id = R.id.btnSignIn;
      AppCompatButton btnSignIn = ViewBindings.findChildViewById(rootView, id);
      if (btnSignIn == null) {
        break missingId;
      }

      id = R.id.btnSignInDoctor;
      AppCompatButton btnSignInDoctor = ViewBindings.findChildViewById(rootView, id);
      if (btnSignInDoctor == null) {
        break missingId;
      }

      id = R.id.btnSignUp;
      TextView btnSignUp = ViewBindings.findChildViewById(rootView, id);
      if (btnSignUp == null) {
        break missingId;
      }

      id = R.id.fieldMain;
      LinearLayout fieldMain = ViewBindings.findChildViewById(rootView, id);
      if (fieldMain == null) {
        break missingId;
      }

      id = R.id.imgIcon;
      ImageView imgIcon = ViewBindings.findChildViewById(rootView, id);
      if (imgIcon == null) {
        break missingId;
      }

      id = R.id.txtDescription;
      TextView txtDescription = ViewBindings.findChildViewById(rootView, id);
      if (txtDescription == null) {
        break missingId;
      }

      id = R.id.txtName;
      EditText txtName = ViewBindings.findChildViewById(rootView, id);
      if (txtName == null) {
        break missingId;
      }

      id = R.id.txtParol;
      EditText txtParol = ViewBindings.findChildViewById(rootView, id);
      if (txtParol == null) {
        break missingId;
      }

      return new ScreenSignInBinding((ConstraintLayout) rootView, btnNext, btnParol, btnSignIn,
          btnSignInDoctor, btnSignUp, fieldMain, imgIcon, txtDescription, txtName, txtParol);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
