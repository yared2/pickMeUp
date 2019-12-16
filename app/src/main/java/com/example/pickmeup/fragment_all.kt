package com.example.pickmeup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_fragment_all.*

class fragment_all : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_all)

    val adapter=MyviewPagerAdapter(supportFragmentManager)
    adapter.addFragment(PostAride(),"post fragment")
    adapter.addFragment(listTrip_frgment(),"avilableTrip")

    viewpager.adapter=adapter
    viewtab.setupWithViewPager(viewpager)

}
class MyviewPagerAdapter(manager: FragmentManager): FragmentPagerAdapter(manager) {
    val fragmentlist=ArrayList<Fragment>()
    val title =ArrayList<String>()

    override fun getItem(position: Int): Fragment {
        return  fragmentlist[position]
    }

    override fun getCount(): Int {
        return fragmentlist.size
    }
    fun addFragment(fragment: Fragment, titleHeading:String){
        fragmentlist.add(fragment)
        title.add(titleHeading)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return title[position]
    }
}
}