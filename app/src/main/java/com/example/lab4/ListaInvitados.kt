package com.example.lab4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.lab4.databinding.FragmentListaInvitadosBinding

/**
 * A simple [Fragment] subclass.
 */
class ListaInvitados : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentListaInvitadosBinding>(inflater, R.layout.fragment_lista_invitados, container, false)


        return binding.root
    }

}
