package com.example.AllThingsAMD

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CpuFrag.newInstance] factory method to
 * create an instance of this fragment.
 */
class CpuFrag : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val cpuFragView = inflater.inflate(R.layout.fragment_cpu, container, false)
        val cpu1Button = cpuFragView.findViewById<Button>(R.id.cpu1More)
        val cpu2Button = cpuFragView.findViewById<Button>(R.id.cpu2More)
        val cpu3Button = cpuFragView.findViewById<Button>(R.id.cpu3More)
        val cpu4Button = cpuFragView.findViewById<Button>(R.id.cpu4More)
        val cpu5Button = cpuFragView.findViewById<Button>(R.id.cpu5More)
        val cpu6Button = cpuFragView.findViewById<Button>(R.id.cpu6More)
        val cpu7Button = cpuFragView.findViewById<Button>(R.id.cpu7More)
        val cpu8Button = cpuFragView.findViewById<Button>(R.id.cpu8More)
        val cpu9Button = cpuFragView.findViewById<Button>(R.id.cpu9More)
        val cpu10Button = cpuFragView.findViewById<Button>(R.id.cpu10More)

        cpu1Button.setOnClickListener {
            val link = Uri.parse("https://www.amd.com/en/products/processors/desktops/ryzen/7000-series/amd-ryzen-5-7600.html") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, link)
            startActivity(intent)
        }

        cpu2Button.setOnClickListener {
            val link = Uri.parse("https://www.amd.com/en/products/processors/desktops/ryzen/7000-series/amd-ryzen-5-7600x.html") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, link)
            startActivity(intent)
        }

        cpu3Button.setOnClickListener {
            val link = Uri.parse("https://www.amd.com/en/products/processors/desktops/ryzen/7000-series/amd-ryzen-7-7700.html") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, link)
            startActivity(intent)
        }

        cpu4Button.setOnClickListener {
            val link = Uri.parse("https://www.amd.com/en/products/processors/desktops/ryzen/7000-series/amd-ryzen-7-7700x.html") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, link)
            startActivity(intent)
        }

        cpu5Button.setOnClickListener {
            val link = Uri.parse("https://www.amd.com/en/products/processors/desktops/ryzen/7000-series/amd-ryzen-7-7800x3d.html") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, link)
            startActivity(intent)
        }

        cpu6Button.setOnClickListener {
            val link = Uri.parse("https://www.amd.com/en/products/processors/desktops/ryzen/7000-series/amd-ryzen-9-7900.html") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, link)
            startActivity(intent)
        }

        cpu7Button.setOnClickListener {
            val link = Uri.parse("https://www.amd.com/en/products/processors/desktops/ryzen/7000-series/amd-ryzen-9-7900x.html") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, link)
            startActivity(intent)
        }

        cpu8Button.setOnClickListener {
            val link = Uri.parse("https://www.amd.com/en/products/processors/desktops/ryzen/7000-series/amd-ryzen-9-7900x3d.html") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, link)
            startActivity(intent)
        }

        cpu9Button.setOnClickListener {
            val link = Uri.parse("https://www.amd.com/en/products/processors/desktops/ryzen/7000-series/amd-ryzen-9-7950x.html") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, link)
            startActivity(intent)
        }

        cpu10Button.setOnClickListener {
            val link = Uri.parse("https://www.amd.com/en/products/processors/desktops/ryzen/7000-series/amd-ryzen-9-7950x3d.html") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, link)
            startActivity(intent)
        }

        return cpuFragView
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment CpuFrag.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CpuFrag().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
