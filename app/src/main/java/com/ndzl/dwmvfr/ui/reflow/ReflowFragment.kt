package com.ndzl.dwmvfr.ui.reflow

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.ndzl.dwmvfr.databinding.FragmentReflowBinding

class ReflowFragment : Fragment() {

    private var _binding: FragmentReflowBinding? = null

    val TAG = "lifecycle-ReflowFragment"

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "ReflowFragment-onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val reflowViewModel =
            ViewModelProvider(this).get(ReflowViewModel::class.java)

        _binding = FragmentReflowBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textReflow
        reflowViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i(TAG, "ReflowFragment-onViewCreated")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.i(TAG, "ReflowFragment-onViewStateRestored")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "ReflowFragment-onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "ReflowFragment-onResume")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i(TAG, "ReflowFragment-onSaveInstanceState")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "ReflowFragment-onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "ReflowFragment-onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        Log.i(TAG, "ReflowFragment-onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "ReflowFragment-onDestroy")
    }

}