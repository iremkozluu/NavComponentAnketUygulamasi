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
import com.ikozlu.anketapp.databinding.FragmentResultsBinding


class ResultsFragment : Fragment(R.layout.fragment_results) {

    private val binding by viewBinding(FragmentResultsBinding::bind)
    private val args by navArgs<ResultsFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding){
            tvResultName.text = "Ad Soyad: ${args.results.user.nameSurname}"
            tvResultEmail.text = "e-Mail: ${args.results.user.email}"
            tvResultNumber.text = "Telefon No: ${args.results.user.phone}"
            tvResultAge.text = "Yaşınız: ${args.results.age}"
            tvResultHeight.text = "Boyunuz: ${args.results.height}"
            tvResultWeight.text = "Kilonuz: ${args.results.weight}"
            tvResultWater.text = "İçilen su miktarı (LT): ${args.results.water}"
            tvResultStep.text = "Günlük atılan adım sayısı: ${args.results.step}"




            icBack.setOnClickListener {

                    findNavController().navigateUp()

                }
            }



        }
    }
