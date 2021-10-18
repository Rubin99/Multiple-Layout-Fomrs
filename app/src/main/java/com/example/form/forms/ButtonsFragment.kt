package com.example.form.forms

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.form.R
import com.example.form.inflate

class ButtonsFragment : Fragment() {

    private lateinit var linearButton: Button
    private lateinit var constraintButton: Button
    private lateinit var relativeButton: Button

    private var myView: View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (myView == null) {
            myView = container?.inflate(R.layout.fragment_buttons)
        }
        return myView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        linearButton = view.findViewById<Button>(R.id.linearBtn)
        linearButton.setOnClickListener {
            val intent = Intent(this.context, LinearlayoutFormActivity::class.java)
            startActivity(intent)
            Toast.makeText(activity,"Linear Layout", Toast.LENGTH_SHORT).show()
        }

        constraintButton = view.findViewById<Button>(R.id.constraintBtn)
        constraintButton.setOnClickListener {
            val intent = Intent(this.context, ConstraintLayoutFormActivity::class.java)
            startActivity(intent)
            Toast.makeText(activity,"Constraint Layout", Toast.LENGTH_SHORT).show()

        }

        relativeButton = view.findViewById<Button>(R.id.relativeBtn)
        relativeButton.setOnClickListener {
            val intent = Intent(this.context, RelativeLayoutFormActivity::class.java)
            startActivity(intent)
            Toast.makeText(activity,"Relative Layout", Toast.LENGTH_SHORT).show()

        }
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ButtonsFragment().apply {

                }
            }
    }

