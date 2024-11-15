// Generated by view binder compiler. Do not edit!
package uz.alpha.qandlidiabetstartup.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import uz.alpha.qandlidiabetstartup.R;

public final class PageDoctorChatBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final LinearLayout btn1;

  @NonNull
  public final LinearLayout btn2;

  @NonNull
  public final LinearLayout btn3;

  @NonNull
  public final LinearLayout btnDiabeticFoot;

  @NonNull
  public final CircleImageView profileImage;

  @NonNull
  public final CircleImageView profileImage2;

  @NonNull
  public final CircleImageView profileImage3;

  @NonNull
  public final TextView txtTitle;

  private PageDoctorChatBinding(@NonNull ConstraintLayout rootView, @NonNull LinearLayout btn1,
      @NonNull LinearLayout btn2, @NonNull LinearLayout btn3, @NonNull LinearLayout btnDiabeticFoot,
      @NonNull CircleImageView profileImage, @NonNull CircleImageView profileImage2,
      @NonNull CircleImageView profileImage3, @NonNull TextView txtTitle) {
    this.rootView = rootView;
    this.btn1 = btn1;
    this.btn2 = btn2;
    this.btn3 = btn3;
    this.btnDiabeticFoot = btnDiabeticFoot;
    this.profileImage = profileImage;
    this.profileImage2 = profileImage2;
    this.profileImage3 = profileImage3;
    this.txtTitle = txtTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PageDoctorChatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PageDoctorChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.page_doctor_chat, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PageDoctorChatBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn1;
      LinearLayout btn1 = ViewBindings.findChildViewById(rootView, id);
      if (btn1 == null) {
        break missingId;
      }

      id = R.id.btn2;
      LinearLayout btn2 = ViewBindings.findChildViewById(rootView, id);
      if (btn2 == null) {
        break missingId;
      }

      id = R.id.btn3;
      LinearLayout btn3 = ViewBindings.findChildViewById(rootView, id);
      if (btn3 == null) {
        break missingId;
      }

      id = R.id.btnDiabeticFoot;
      LinearLayout btnDiabeticFoot = ViewBindings.findChildViewById(rootView, id);
      if (btnDiabeticFoot == null) {
        break missingId;
      }

      id = R.id.profile_image;
      CircleImageView profileImage = ViewBindings.findChildViewById(rootView, id);
      if (profileImage == null) {
        break missingId;
      }

      id = R.id.profile_image2;
      CircleImageView profileImage2 = ViewBindings.findChildViewById(rootView, id);
      if (profileImage2 == null) {
        break missingId;
      }

      id = R.id.profile_image3;
      CircleImageView profileImage3 = ViewBindings.findChildViewById(rootView, id);
      if (profileImage3 == null) {
        break missingId;
      }

      id = R.id.txtTitle;
      TextView txtTitle = ViewBindings.findChildViewById(rootView, id);
      if (txtTitle == null) {
        break missingId;
      }

      return new PageDoctorChatBinding((ConstraintLayout) rootView, btn1, btn2, btn3,
          btnDiabeticFoot, profileImage, profileImage2, profileImage3, txtTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
