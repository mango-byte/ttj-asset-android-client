package com.ttvnp.ttj_asset_android_client.domain.model

class UserModel(
        val emailAddress: String = "",
        val profileImageID: Long = 0L,
        val profileImageURL: String = "",
        val firstName: String = "",
        val middleName: String = "",
        val lastName: String = "",
        val address: String = "",
        val dateOfBirth: String = "",
        val genderType: Int = 0,
        val cellphoneNumberNationalCode: String = "",
        val cellphoneNumber: String = "",
        val isDocument1ImageURL: String = "",
        val isDocument2ImageURL: String = "",
        val isEmailVerified: Boolean = false,
        val isIdentified: Boolean = false,
        val identificationStatus: Int = 0
) : BaseModel()
