package com.ikozlu.anketapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ikozlu.anketapp.R
import com.ikozlu.anketapp.common.viewBinding
import com.ikozlu.anketapp.databinding.FragmentLoginBinding


class LoginFragment : Fragment(R.layout.fragment_login) {

    private val binding by viewBinding(FragmentLoginBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnStart.setOnClickListener {
            val alinanVeri = binding.etName.text.toString()

            val action = LoginFragmentDirections.loginToPersonalInfo(alinanVeri)
            findNavController().navigate(action)

        }

    }
}