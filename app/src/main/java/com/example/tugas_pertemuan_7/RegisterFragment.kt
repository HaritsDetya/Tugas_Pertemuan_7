package com.example.tugas_pertemuan_7

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import com.example.tugas_pertemuan_7.databinding.FragmentRegisterBinding
import com.google.android.material.textfield.TextInputEditText

class RegisterFragment : Fragment() {
    private lateinit var binding: FragmentRegisterBinding

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PASS = "extra_pass"
    }
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(inflater, container, false)
        val view = binding.root
        val usernameInput = binding.usernameInput
        val emailInput = binding.emailInput
        val passwordInput = binding.passwordInput
        val register = binding.register

        register.setOnClickListener {
            val intentToRegisterFragment =
                Intent(requireContext(), HomeActivity::class.java)
            intentToRegisterFragment.putExtra(EXTRA_NAME, usernameInput.text.toString())
            intentToRegisterFragment.putExtra(EXTRA_EMAIL, emailInput.text.toString())
            intentToRegisterFragment.putExtra(EXTRA_PASS, passwordInput.text.toString())
            startActivity(intentToRegisterFragment)
        }
        return view
    }
}