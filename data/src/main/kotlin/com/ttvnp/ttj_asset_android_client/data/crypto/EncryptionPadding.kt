package com.ttvnp.ttj_asset_android_client.data.crypto

enum class EncryptionPadding(val rawValue: String) {

    NONE("NoPadding"),
    PKCS7("PKCS7Padding"),
    RSA_PKCS1("PKCS1Padding"),
    RSA_OAEP("OAEPPadding"),
}