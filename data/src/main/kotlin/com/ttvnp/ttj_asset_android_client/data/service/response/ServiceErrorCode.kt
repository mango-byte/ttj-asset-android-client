package com.ttvnp.ttj_asset_android_client.data.service.response

enum class ServiceErrorCode(val rawValue: Int) {
    NO_ERROR(0),

    ERROR_UNKNOWN(1),
    ERROR_CANNOT_CONNECT_TO_SERVER(2),
    ERROR_AUTHENTICATION(3),
    ERROR_LOCKED_OUT(4),

    ERROR_INVALID_TOKEN(10),
    ERROR_INVALID_USER_AGENT(11),
    ERROR_DATA_NOT_FOUND(12),
    ERROR_INVALID_INPUT(13),
    ERROR_ILLEGAL_DATA_STATE(14),

    ERROR_INVALID_EMAIL_ADDRESS_FORMAT(101),
    ERROR_INVALID_VERIFICATION_CODE(102),
    ERROR_INVALID_PASSWORD_ON_IMPORT(103),
    ERROR_UPLOAD_PROFILE_IMAGE_FILE_TOO_LARGE(104),
    ERROR_UPLOAD_PROFILE_IMAGE_FILE_EXTENSION(105),
    ERROR_INVALID_USER_FIRST_NAME(106),
    ERROR_INVALID_USER_MIDDLE_NAME(107),
    ERROR_INVALID_USER_LAST_NAME(108),
    ERROR_INVALID_USER_ADDRESS(109),
    ERROR_TOO_MUCH_AMOUNT(110),
}