package uz.alpha.qandlidiabetstartup.presentation.detection.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.pages.school.SchoolPage
import uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.pages.school.type2.food.GreenPage
import uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.pages.school.type2.food.RedPage
import uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.pages.school.type2.food.YellowPage
import uz.alpha.qandlidiabetstartup.presentation.detection.ui.screen.pages.tests.TestPage

class FoodsAdapter (fm: FragmentActivity) : FragmentStateAdapter(fm) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> GreenPage()
            1-> YellowPage()
            else-> RedPage()
        }
    }
}