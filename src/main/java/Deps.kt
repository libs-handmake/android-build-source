object Deps {
    const val KTX_CORE = "androidx.core:core-ktx:${DepVers.KTX_CORE_VER}"
    const val APPCOMPAT = "androidx.appcompat:appcompat:${DepVers.APPCOMPAT_VER}"
    const val MATERIAL = "com.google.android.material:material:${DepVers.MATERIAL_VER}"
    const val CONSTRAINT_LAYOUT =
        "androidx.constraintlayout:constraintlayout:${DepVers.CONSTRAINT_LAYOUT_VER}"
    const val JUNIT_TEST = "junit:junit:${DepVers.JUNIT_TEST_VER}"
    const val JUNIT_TEST_EXT = "androidx.test.ext:junit:${DepVers.JUNIT_TEST_EXT_VER}"
    const val EPRESSO_CORE = "androidx.test.espresso:espresso-core:${DepVers.EPRESSO_CORE}"
    const val HILT = "com.google.dagger:hilt-android:${PluginsVer.HILT_VER}"
    const val HILT_COMPILER = "com.google.dagger:hilt-compiler:${PluginsVer.HILT_VER}"
    const val GSON = "com.google.code.gson:gson:${DepVers.GSON_VER}"
    const val EVENT_BUS = "org.greenrobot:eventbus:${DepVers.EVENTBUS_VER}"
    const val SDP = "com.intuit.sdp:sdp-android:${DepVers.SDP_VER}"
    const val SSP = "com.intuit.ssp:ssp-android:${DepVers.SDP_VER}"
    const val LIFECYCLE_VM = "androidx.lifecycle:lifecycle-viewmodel-ktx:${DepVers.LIFECYCLE_VER}"
    const val LIFECYCLE_LIVE_DATA =
        "androidx.lifecycle:lifecycle-livedata-ktx:${DepVers.LIFECYCLE_VER}"
    const val LIFECYCLE_RUN_TIME =
        "androidx.lifecycle:lifecycle-runtime-ktx:${DepVers.LIFECYCLE_VER}"
    const val LIFECYCLE_VM_STATE =
        "androidx.lifecycle:lifecycle-viewmodel-savedstate:${DepVers.LIFECYCLE_VER}"
    const val LIFECYCLE_JAVA_COMMON =
        "androidx.lifecycle:lifecycle-common-java8:${DepVers.LIFECYCLE_VER}"
    const val GLIDE = "com.github.bumptech.glide:glide:${DepVers.GLIDE_VER}"
    const val GLIDE_COMPILER = "com.github.bumptech.glide:compiler:${DepVers.GLIDE_VER}"
    const val LOTTIES = "com.airbnb.android:lottie:${DepVers.LOTTIE_VER}"
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${DepVers.RETROFIT_VER}"
    const val RETROFIT_GSON_CONVERTER =
        "com.squareup.retrofit2:converter-gson:${DepVers.RETROFIT_VER}"
    const val RETROFIT_SCALAR_CONVERTER =
        "com.squareup.retrofit2:converter-scalars:${DepVers.RETROFIT_VER}"
    const val ROOM_RUNTIME = "androidx.room:room-runtime:${DepVers.ROOM_VER}"
    const val ROOM_KTX = "androidx.room:room-ktx:${DepVers.ROOM_VER}"
    const val ROOM_COMPILER = "androidx.room:room-compiler:${DepVers.ROOM_VER}"
    const val CIRCLE_IMAGE_VIEW = "de.hdodenhof:circleimageview:${DepVers.CIRCLE_IMAGEVIEW_VER}"
    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${DepVers.FRAGMENT_VERSION}"
    const val ROUNDED_IMAGEVIEW = "com.makeramen:roundedimageview:${DepVers.ROUNDED_IMAGE_VERSION}"
    const val FLEXBOX_LAYOUT = "com.google.android.flexbox:flexbox:${DepVers.FLEXBOX_VER}"

    val CAMERAX_REQUIREMENT_LIBS = arrayOf(
        "androidx.camera:camera-core:${DepVers.CAMERAX_VER}",
        "androidx.camera:camera-camera2:${DepVers.CAMERAX_VER}",
        "androidx.camera:camera-lifecycle:${DepVers.CAMERAX_VER}",
        "androidx.camera:camera-view:${DepVers.CAMERAX_VER}"
    )

    val EXO_PLAYER_LIBS = arrayOf(
        "androidx.media3:media3-exoplayer:${DepVers.EXO_PLAYER_VER}",
        "androidx.media3:media3-exoplayer-dash:${DepVers.EXO_PLAYER_VER}",
        "androidx.media3:media3-ui:${DepVers.EXO_PLAYER_VER}"
    )
}

object DepVers {
    const val KTX_CORE_VER = "1.10.1"
    const val APPCOMPAT_VER = "1.6.1"
    const val MATERIAL_VER = "1.9.0"
    const val CONSTRAINT_LAYOUT_VER = "2.1.4"
    const val JUNIT_TEST_VER = "4.13.2"
    const val JUNIT_TEST_EXT_VER = "1.1.5"
    const val EPRESSO_CORE = "3.5.1"
    const val GSON_VER = "2.10"
    const val EVENTBUS_VER = "3.3.1"
    const val SDP_VER = "1.1.0"
    const val LIFECYCLE_VER = "2.5.1"
    const val GLIDE_VER = "4.15.1"
    const val LOTTIE_VER = "5.2.0"
    const val RETROFIT_VER = "2.9.0"
    const val ROOM_VER = "2.5.0"
    const val CIRCLE_IMAGEVIEW_VER = "3.1.0"
    const val FRAGMENT_VERSION = "1.5.5"
    const val ROUNDED_IMAGE_VERSION = "2.3.0"
    const val FLEXBOX_VER = "3.0.0"
    const val CAMERAX_VER = "1.3.0-alpha07"
    const val EXO_PLAYER_VER = "1.0.2"
}