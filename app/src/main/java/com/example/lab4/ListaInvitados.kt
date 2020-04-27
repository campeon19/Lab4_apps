package com.example.lab4

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.lab4.databinding.FragmentListaInvitadosBinding

/**
 * A simple [Fragment] subclass.
 */
class ListaInvitados : Fragment() {
private lateinit var binding: FragmentListaInvitadosBinding
    private lateinit var lista: Lista
    private var invitados = 5
    private var confirmados = 0
    private var interador = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentListaInvitadosBinding>(inflater, R.layout.fragment_lista_invitados, container, false)
        loop()
        return binding.root
    }


    fun loop(){

        when(interador){
            0 -> lista = Lista("Pedro Lopez", "3759-4558", "pedro.lopez25@gmail.com")
            1 -> lista = Lista("Alberto Hernandez", "3887-8798", "alberto.hern.1990@gmail.com")
            2 -> lista = Lista("Maria Rodriguez", "6887-9523", "rodriguezmaria38@gmail.com")
            3 -> lista = Lista("Luisa Gallegos", "4280-2135", "gallegosluisa@gmail.com")
            4 -> lista = Lista("Edward Paiz", "3862-1544", "edward1985.paiz@outlook.com")
            5 -> lista = Lista("Jose Luis Perez", "4798-5591", "joseluis95@yopmail.com")
        }
        binding.lista = lista

        binding.registradoButton.setOnClickListener{
            if(interador < 5){
                confirmados ++
                interador ++
                loop()
            } else if(interador == 5){
                confirmados ++
                view?.findNavController()?.navigate(R.id.action_listaInvitados2_to_resultados)
            }
        binding.noRegistradoButton.setOnClickListener{
            if(interador < 5){
                interador ++
                loop()
            } else if(interador == 5){
                view?.findNavController()?.navigate(R.id.action_listaInvitados2_to_resultados)
            }
        }
        }

    }

}


