package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.pages.tests

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.tapadoo.alerter.Alerter
import uz.alpha.qandlidiabetstartup.R
import uz.alpha.qandlidiabetstartup.data.local.room.AppDatabase
import uz.alpha.qandlidiabetstartup.data.local.room.DiseaseEntity
import uz.alpha.qandlidiabetstartup.databinding.ScreenFindriskBinding
import uz.alpha.qandlidiabetstartup.presentation.detection.ui.dialog.DialogResult
import uz.alpha.qandlidiabetstartup.presentation.detection.ui.dialog.ResultFindDialog
import uz.alpha.qandlidiabetstartup.utils.Extension
import uz.alpha.qandlidiabetstartup.utils.InfoData
import uz.alpha.qandlidiabetstartup.utils.getCurrentDate


class FindRiskScreen : Fragment(R.layout.screen_findrisk) {


    private val binding by viewBinding(ScreenFindriskBinding::bind)
    private var spinner1 = arrayOf<Int>(0)
    private var spinner2 = arrayOf<Int>(0)
    private val dao = AppDatabase.getInstance().noteDao()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.green_special)

        val list1 = arrayOf("-", getString(R.string.male), getString(R.string.female))
        val list2 = arrayListOf("")
        val list3 = arrayOf("-", getString(R.string.yes), getString(R.string.no))
        val list4 = arrayOf("-", getString(R.string.yes), getString(R.string.no))
        val list5 = arrayOf("-", getString(R.string.yes), getString(R.string.no))
        val list6 = arrayOf("-", getString(R.string.yes), getString(R.string.no))
        val list7 = arrayOf("-", getString(R.string.main16_1), getString(R.string.main16_2), getString(R.string.main16_3))


        var txt1 = ""
        var txt2 = ""
        var txt3 = ""
        var txt4 = ""
        var txt5 = ""

//        binding.apply {
//            numbersJ.minValue = 0
//            numbersJ.maxValue = list1.size - 1
//            numbersJ.wrapSelectorWheel = false
//            numbersJ.displayedValues = list1
//
//            numbersJ.setOnValueChangedListener { _, _, newVal ->
//                //  textView.text = "Выбранное значение: ${list1[newVal]}"
//            }
//        }


        binding.apply {
            numbers.minValue = 20
            numbers.maxValue = 100

            btnBack.setOnClickListener {
                findNavController().navigateUp()
            }

            numbers.setOnValueChangedListener { _, _, newVal ->
                //  textView.text = "Выбранное значение: ${list1[newVal]}"
            }
        }

        /**
         * spinner2
         * */
        for (i in 50..120) {
            spinner2 += i
        }
        val s2: ArrayAdapter<*> = ArrayAdapter<Any?>(
            requireContext(),
            android.R.layout.simple_selectable_list_item,
            spinner2
        )

        binding.numbers2.adapter = s2

        binding.numbers2.onItemSelectedListener=object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                InfoData.spinnerFramingham2=spinner2[p2].toString()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }


        /**
         * spinner3
         * */
        for (i in 60..150) {
            spinner1 += i
        }
        val s1: ArrayAdapter<*> = ArrayAdapter<Any?>(
            requireContext(),
            android.R.layout.simple_selectable_list_item,
            spinner1
        )

        binding.numbers3.adapter = s1

        binding.numbers3.onItemSelectedListener=object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                InfoData.spinnerFramingham1=spinner1[p2].toString()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }

        binding.apply {
            numbers4.minValue = 0
            numbers4.maxValue = list3.size - 1
            numbers4.wrapSelectorWheel = false
            numbers4.displayedValues = list3

            numbers4.setOnValueChangedListener { _, _, newVal ->
                //  textView.text = "Выбранное значение: ${list1[newVal]}"
                txt1 = list3[newVal]
            }
        }

        binding.apply {
            numbers5.minValue = 0
            numbers5.maxValue = list4.size - 1
            numbers5.wrapSelectorWheel = false
            numbers5.displayedValues = list4

            numbers5.setOnValueChangedListener { _, _, newVal ->
                //  textView.text = "Выбранное значение: ${list1[newVal]}"
                txt2 = list4[newVal]
            }
        }

        binding.apply {
            numbers7.minValue = 0
            numbers7.maxValue = list5.size - 1
            numbers7.wrapSelectorWheel = false
            numbers7.displayedValues = list5

            numbers7.setOnValueChangedListener { _, _, newVal ->
                //  textView.text = "Выбранное значение: ${list1[newVal]}"
                txt3 = list5[newVal]
            }
        }


        binding.apply {
            numbers8.minValue = 0
            numbers8.maxValue = list6.size - 1
            numbers8.wrapSelectorWheel = false
            numbers8.displayedValues = list6

            numbers8.setOnValueChangedListener { _, _, newVal ->
                //  textView.text = "Выбранное значение: ${list1[newVal]}"
                txt3 = list6[newVal]
            }
        }

        binding.apply {
            numbers9.minValue = 0
            numbers9.maxValue = list7.size - 1
            numbers9.wrapSelectorWheel = false
            numbers9.displayedValues = list7

            numbers9.setOnValueChangedListener { _, _, newVal ->
                //  textView.text = "Выбранное значение: ${list1[newVal]}"
                txt3 = list7[newVal]
            }
        }


        binding.btnScore.setOnClickListener {
            var ball = 0

            binding.apply {

                if (binding.numbers.value >= 45 && binding.numbers.value <= 54) ball += 2
                if (binding.numbers.value >= 55 && binding.numbers.value <= 64) ball += 3
                if (binding.numbers.value >= 65) ball += 4


                if (InfoData.spinnerFramingham2.toInt() > 25 && InfoData.spinnerFramingham2.toInt() <= 30) ball += 1
                if (InfoData.spinnerFramingham2.toInt() > 30) ball += 2


                if (InfoData.spinnerFramingham1.toInt() > 80 && InfoData.spinnerFramingham1.toInt() < 94) ball += 0
                if ((InfoData.spinnerFramingham1.toInt() > 94 && InfoData.spinnerFramingham1.toInt() < 102) || (InfoData.spinnerFramingham1.toInt() > 80 && InfoData.spinnerFramingham1.toInt() < 88)) ball += 3
                if (InfoData.spinnerFramingham1.toInt() > 88 && InfoData.spinnerFramingham1.toInt() < 102) ball += 4


                if (numbers4.value == 1) ball += 2
                else if (numbers4.value == 0 || numbers4.value == 2) ball += 0
                if (numbers5.value == 1) ball += 1
                else if (numbers5.value == 0 || numbers5.value == 2) ball += 0
                if (numbers7.value == 1) ball += 2
                else if (numbers7.value == 0 || numbers7.value == 2) ball += 0
                if (numbers8.value == 1) ball += 5
                else if (numbers8.value == 0 || numbers8.value == 2) ball += 0
                if (numbers9.value == 0) ball +=     0
                else if (numbers9.value == 1) ball += 3
                else if (numbers9.value==2) ball+=5

                Extension.ball = ball


                if (binding.numbers.value != 0 && InfoData.spinnerFramingham2.toInt() != 0 && InfoData.spinnerFramingham1!="0" && binding.numbers4.value != 0 && binding.numbers5.value != 0 && binding.numbers7.value != 0 && binding.numbers8.value != 0 && binding.numbers9.value != 0 ) {
                    if (ball == 0) {
                        Alerter.create(requireActivity()).setText(getString(R.string.alerter))
                            .setBackgroundColorRes(R.color.purple_200).show()
                    } else {
                       // showResultDialog()
                        showDialog()

                    }

                } else{
                    Alerter.create(requireActivity()).setText(getString(R.string.alerter))
                        .setBackgroundColorRes(R.color.purple_200).show()
                }


            }


        }


    }

    private fun showResultDialog() {
        val dialog = ResultFindDialog()
        dialog.show(childFragmentManager, "")
    }

    fun showDialog(){
        InfoData.myCustomChecker="1"
        var text ="-"
        var textDescription ="-"
        if (Extension.ball<7){
            text=getString(R.string.f1)
            textDescription=getString(R.string.find_1)
            dao.insert(DiseaseEntity(0, getString(R.string.find_1), getCurrentDate()))
        }
        if (Extension.ball>=7 &&  Extension.ball<=11){
            text=getString(R.string.f1)
            textDescription=getString(R.string.find_2)
            dao.insert(DiseaseEntity(0, getString(R.string.find_2), getCurrentDate()))
        }
        if (Extension.ball>=12 && Extension.ball<=14){
            text=getString(R.string.f2)
            textDescription=getString(R.string.find_3)
            dao.insert(DiseaseEntity(0, getString(R.string.find_3), getCurrentDate()))

        }

        if (Extension.ball>=15 && Extension.ball<=20){
            text=getString(R.string.f3)
            textDescription=getString(R.string.find_4)
            dao.insert(DiseaseEntity(0, getString(R.string.find_4), getCurrentDate()))
        }

        if (Extension.ball>20){
            text=getString(R.string.f3)
            textDescription=getString(R.string.find_5)
            dao.insert(DiseaseEntity(0, getString(R.string.find_5), getCurrentDate()))
        }
        val dialog = DialogResult(requireContext(), text  , textDescription)
        dialog.show()
        Toast.makeText(requireContext(), Extension.ball.toString(), Toast.LENGTH_SHORT).show()


        dialog.setMainClickListener {
            findNavController().navigateUp()
            dialog.dismiss()
        }
    }


}