package com.example.AllThingsAMD

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [GpuFrag.newInstance] factory method to
 * create an instance of this fragment.
 */
class GpuFrag : Fragment() {
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
        val gpuFragView = inflater.inflate(R.layout.fragment_gpu, container, false)
        val gpu1Button = gpuFragView.findViewById<Button>(R.id.gpu1More)
        val gpu2Button = gpuFragView.findViewById<Button>(R.id.gpu2More)
        val gpu3Button = gpuFragView.findViewById<Button>(R.id.gpu3More)
        val gpu4Button = gpuFragView.findViewById<Button>(R.id.gpu4More)
        val gpu5Button = gpuFragView.findViewById<Button>(R.id.gpu5More)
        val gpu6Button = gpuFragView.findViewById<Button>(R.id.gpu6More)

        gpu1Button.setOnClickListener {
            val link = Uri.parse("https://www.amd.com/en/products/graphics/desktops/radeon/7000-series/amd-radeon-rx-7600.html") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, link)
            startActivity(intent)
        }

        gpu2Button.setOnClickListener {
            val link = Uri.parse("https://www.amd.com/en/products/graphics/desktops/radeon/7000-series/amd-radeon-rx-7600-xt.html") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, link)
            startActivity(intent)
        }

        gpu3Button.setOnClickListener {
            val link = Uri.parse("https://www.amd.com/en/products/graphics/desktops/radeon/7000-series/amd-radeon-rx-7700-xt.html") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, link)
            startActivity(intent)
        }

        gpu4Button.setOnClickListener {
            val link = Uri.parse("https://www.amd.com/en/products/graphics/desktops/radeon/7000-series/amd-radeon-rx-7800-xt.html") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, link)
            startActivity(intent)
        }

        gpu5Button.setOnClickListener {
            val link = Uri.parse("https://www.amd.com/en/products/graphics/desktops/radeon/7000-series/amd-radeon-rx-7900xt.html") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, link)
            startActivity(intent)
        }

        gpu6Button.setOnClickListener {
            val link = Uri.parse("https://www.amd.com/en/products/graphics/desktops/radeon/7000-series/amd-radeon-rx-7900xtx.html") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, link)
            startActivity(intent)
        }

        return gpuFragView
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment GpuFrag.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            GpuFrag().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}