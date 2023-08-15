package com.example.todolist.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.todolist.R
import com.example.todolist.TaskAadapter
import com.example.todolist.TaskViewModel
import com.example.todolist.databinding.FragmentTaskBinding


class TaskFragment : Fragment() {
    private val viewModel: TaskViewModel by viewModels()
    private var _binding: FragmentTaskBinding? = null
    private lateinit var adapter: TaskAadapter
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentTaskBinding.inflate(inflater, container, false)
        binding.apply {

            btn.setOnClickListener {
                findNavController().navigate(R.id.action_taskFragment_to_addFragment)
            }
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
