package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.auth

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.alpha.qandlidiabetstartup.R
import uz.alpha.qandlidiabetstartup.data.local.SharedPref
import uz.alpha.qandlidiabetstartup.databinding.ScreenSignUpBinding
import uz.alpha.qandlidiabetstartup.presentation.detection.viewmodel.impl.AuthViewModelImpl

class SignUpScreen : Fragment(R.layout.screen_sign_up) {

    private  val binding by viewBinding(ScreenSignUpBinding::bind)
    private val viewModel by viewModels<AuthViewModelImpl>()
    val uuid = SharedPref.getInstance().intExamplePref

//                findNavController().navigate(SignUpScreenDirections.actionSignUpScreenToMenuPage())
    @SuppressLint("ClickableViewAccessibility")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.color1)

    binding.apply {
        btnBack.setOnClickListener {
            findNavController().navigate(R.id.signInScreen)
        }
    }

    viewModel.succesSharedFlow.onEach {

            if (it.uniq_code.length == 7) {
                findNavController().navigate(R.id.verifyScreen)
            }
        }.launchIn(viewLifecycleOwner.lifecycleScope)

    binding.apply {
        // Asl matnni saqlash uchun o'zgaruvchi
        var originalText: String? = null

        inputPassword.setOnTouchListener { _, event ->
            if (event.action == MotionEvent.ACTION_UP) {
                // `drawableEnd`ni olish (index 2)
                val drawableEnd = inputPassword.compoundDrawables[2]

                // Agar `drawableEnd` mavjud bo‘lsa, davom etamiz
                if (drawableEnd != null) {
                    // `drawableEnd` eni
                    val drawableWidth = drawableEnd.intrinsicWidth

                    // Bosish maydonini aniqlash
                    val clickArea = inputPassword.width - inputPassword.paddingEnd - drawableWidth

                    // Bosilgan koordinata `clickArea` ichida ekanligini tekshiramiz
                    if (event.x > clickArea) {
                        // Agar hozirgi matn `****` bo'lsa, original matnni ko'rsatish
                        if (inputPassword.text.toString() == "****") {
                            // Matnni ko‘rsatish (asl matnni qayta tiklash)
                            inputPassword.setText(originalText)
                            inputPassword.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.eyeon, 0)
                        } else {
                            // Aks holda, original matnni saqlab, matnni `****` ga o'zgartirish
                            originalText = inputPassword.text.toString()
                            inputPassword.setText("****")
                            inputPassword.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.eyeoff, 0)
                        }
                        true
                    } else {
                        false
                    }
                } else {
                    false
                }
            } else {
                false
            }
        }

    }

        binding.apply {
            btnSend.setOnClickListener {
                binding.apply {
                    if (inputFamilya.text.isNotEmpty()) {
                        if (inputName.text.isNotEmpty()) {
                            if (inputFatherName.text.isNotEmpty()) {
                                if (inputMail.text.endsWith("@gmail.com")) {
                                    if (inputPhone.text.length in 9..13) { //+ 998 99 798 0412
                                        if (inputPassword.text.length > 6) {
                                            if (uuid != null) {
                                                viewModel.sendData(
                                                    imya = inputName.text.toString(),
                                                    familiya = inputFamilya.text.toString(),
                                                    otchestvo = inputFatherName.text.toString(),
                                                    email = inputMail.text.toString(),
                                                    work = "eryterty",
                                                    phone = "998887766",
                                                    mobile_phone = inputPhone.text.toString(),
                                                    doljnost = "qwerqer",
                                                    apps_name = "diabetai",
                                                    user_device = uuid.toString(),
                                                    role_name = "врач",
                                                    pass = inputPassword.text.toString(),
                                                )
                                            }
                                        } else {
                                            showSnackBar(
                                                inputPassword,
                                                "parol belgilari 6 dan kam bo`lmasligi kerak !"
                                            )
                                        }
                                    } else {
                                        showSnackBar(
                                            inputPhone,
                                            "Telefon raqami to`ldirishda xatolik !"
                                        )
                                    }
                                } else {
                                    showSnackBar(inputMail, "Email xato kiritilgan !")
                                }
                            } else {
                                showSnackBar(inputFatherName, "Otchestvo to`ldirilmagan")
                            }
                        } else {
                            showSnackBar(inputName, "ism to`ldirilmagan")
                        }
                    } else {
                        showSnackBar(inputFamilya, "familiya to`ldirilmagan !")
                    }
                }
            }
        }

//        viewModel.progressSharedFlow.onEach {
//            if (it) binding.verfiedProgress.show() else binding.verfiedProgress.hide()
//        }.launchIn(lifecycleScope)

    }


    private fun showSnackBar(txt: TextView, text: String) {
        val snackbar = Snackbar.make(txt, text, Snackbar.LENGTH_LONG)
        snackbar.show()
    }

}