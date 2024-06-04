package com.example.AllThingsAMD

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupWindow
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    // creates variables for .xml widgets
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout
    private lateinit var profileButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // links .xml widgets to variables
        viewPager = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabLayout)
        profileButton = findViewById(R.id.profileButton)

        // creates adapter for tabview
        val adapter = ViewPagerAdapter(this)
        adapter.addFragment(AboutFrag(), "About")
        adapter.addFragment(CpuFrag(), "CPU")
        adapter.addFragment(GpuFrag(), "GPU")
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) {tab, position ->
            tab.text = adapter.getPageTitle(position)
        }.attach()

        // opens profile page on button click
        profileButton.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}

// creates tabview using fragments
class ViewPagerAdapter(fragmentActivity: AppCompatActivity): FragmentStateAdapter(fragmentActivity) {
    private val fragments = ArrayList<Fragment>()
    private val fragmentTitles = ArrayList<String>()

    fun addFragment(fragment: Fragment, title: String) {
        fragments.add(fragment)
        fragmentTitles.add(title)
    }

    override fun getItemCount(): Int = fragments.size
    override fun createFragment(position: Int): Fragment = fragments[position]
    fun getPageTitle(position: Int): String = fragmentTitles[position]
}
