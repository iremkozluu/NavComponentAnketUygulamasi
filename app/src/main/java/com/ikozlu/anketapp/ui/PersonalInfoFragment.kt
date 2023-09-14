package com.ikozlu.anketapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.ikozlu.anketapp.R
import com.ikozlu.anketapp.common.viewBinding
import com.ikozlu.anketapp.databinding.FragmentPersonalInfoBinding
import com.ikozlu.anketapp.model.UsersModel


class PersonalInfoFragment : Fragment(R.layout.fragment_personal_info) {

    private val binding by viewBinding(FragmentPersonalInfoBinding::bind)

    private val args by navArgs<PersonalInfoFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {

            tvAdSoyad.text = args.nameSurname

            btnContCustom.setOnClickListener {

                val mail = etMail.text.toString()
                val phone = etPhone.text.toString()

                val userInfo = UsersModel(args.nameSurname, mail, phone.toInt())

                val action = PersonalInfoFragmentDirections.personalInfoToCustom(userInfo)
                findNavController().navigate(action)
            }
        }


    }


}