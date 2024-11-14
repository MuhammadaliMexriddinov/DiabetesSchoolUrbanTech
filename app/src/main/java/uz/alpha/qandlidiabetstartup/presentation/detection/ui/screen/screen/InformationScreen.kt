package uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.screen

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.alpha.qandlidiabetstartup.R
import uz.alpha.qandlidiabetstartup.data.remote.model.InfoData
import uz.alpha.qandlidiabetstartup.databinding.ScreenInformationBinding
import uz.alpha.qandlidiabetstartup.presentation.detection.ui.adapter.InformationAdapter
import java.util.ArrayList

class InformationScreen : Fragment(R.layout.screen_information) {

    private val binding by viewBinding(ScreenInformationBinding::bind)
    private lateinit var recyclerView: RecyclerView
    private var mList = ArrayList<InfoData>()
    private lateinit var adapter: InformationAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)






        binding.apply {
            recyclerView.setHasFixedSize(true)
            recyclerView.layoutManager = LinearLayoutManager(requireContext())
            addDataToList()
            adapter = InformationAdapter(mList)
            recyclerView.adapter = adapter
        }


    }

    private fun addDataToList() {
        mList.add(
            InfoData(
                "DIABET AI",
                getString(R.string.info_1)
            )
        )
        mList.add(
            InfoData(
                "FINRDRISC",
                getString(R.string.info_2)
            )
        )
        mList.add(
            InfoData(
                "DR AI",
                getString(R.string.drInfo)
            )
        )
        mList.add(
            InfoData(
                "DIABETIC FOOT",
                getString(R.string.info_4)
            )
        )
    }

}