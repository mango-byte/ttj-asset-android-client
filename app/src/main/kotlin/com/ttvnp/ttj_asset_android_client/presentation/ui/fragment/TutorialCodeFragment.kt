package com.ttvnp.ttj_asset_android_client.presentation.ui.fragment

import android.os.Bundle
import android.support.design.widget.TextInputEditText
import android.support.design.widget.TextInputLayout
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import com.ttvnp.ttj_asset_android_client.R
import com.ttvnp.ttj_asset_android_client.domain.model.RegisterEmailResultModel

class TutorialCodeFragment : Fragment() {

    companion object {
        fun getInstance() : TutorialCodeFragment {
            return TutorialCodeFragment()
        }
    }

    var submitButtonClickHandler: View.OnClickListener? = null

    private lateinit var textInputLayoutTutorialVerificationCode: TextInputLayout
    private lateinit var textTutorialVerificationCode: TextInputEditText
    private lateinit var layoutPasswordOnImport: LinearLayout
    private lateinit var textInputLayoutTutorialPasswordOnImport: TextInputLayout
    private lateinit var textTutorialPasswordOnImport: TextInputEditText

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ) : View {
        val view = inflater.inflate(R.layout.fragment_tutorial_code, container, false)
        view.findViewById<Button>(R.id.button_tutorial_verification_code_submit).setOnClickListener(submitButtonClickHandler)
        textInputLayoutTutorialVerificationCode = view.findViewById(R.id.text_input_layout_tutorial_verification_code)
        textTutorialVerificationCode = view.findViewById(R.id.text_tutorial_verification_code)
        layoutPasswordOnImport = view.findViewById(R.id.layout_password_on_import)
        textInputLayoutTutorialPasswordOnImport = view.findViewById(R.id.text_input_layout_tutorial_password_on_import)
        textTutorialPasswordOnImport = view.findViewById(R.id.text_tutorial_password_on_import)
        return view
    }

    fun getVerificationCode(): String {
        return textTutorialVerificationCode.text?.toString()?:""
    }

    fun getPasswordOnImport(): String {
        return textTutorialPasswordOnImport.text?.toString()?:""
    }

    fun showCodeValidationError(errorMessage: String) {
        textInputLayoutTutorialVerificationCode.isErrorEnabled = true
        textInputLayoutTutorialVerificationCode.error = errorMessage
    }

    fun showPasswordValidationError(errorMessage: String) {
        textInputLayoutTutorialPasswordOnImport.isErrorEnabled = true
        textInputLayoutTutorialPasswordOnImport.error = errorMessage
    }

    fun setModel(model: RegisterEmailResultModel) {
        if (model.isEmailInUse) {
            layoutPasswordOnImport.visibility = View.VISIBLE
        } else {
            layoutPasswordOnImport.visibility = View.GONE
        }
    }
}