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
import com.ikozlu.anketapp.databinding.FragmentCustomBinding
import com.ikozlu.anketapp.model.ResultModel
import com.ikozlu.anketapp.model.UsersModel


class CustomFragment : Fragment(R.layout.fragment_custom) {

    private val binding by viewBinding(FragmentCustomBinding::bind)

    private val args by navArgs<CustomFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding){
            tvFullNameCustom.text = args.personalInfo.nameSurname

            btnGoFinal.setOnClickListener {
                val age = etAge.text.toString()
                val height = etHeight.text.toString()
                val weight = etWeight.text.toString()
                val water = etWater.text.toString()
                val step = etSteps.text.toString()

                val resultInfo = ResultModel(UsersModel(args.personalInfo.nameSurname,args.personalInfo.email,
                    args.personalInfo.phone), age.toInt(), height.toFloat() ,weight.toInt(), water , step.toInt())

                val action = CustomFragmentDirections.customToResults(resultInfo)
                findNavController().navigate(action)

            }

        }
    }
}