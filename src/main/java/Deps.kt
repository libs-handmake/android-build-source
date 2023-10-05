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
    const val SDP_COMPOSE = "com.github.Kaaveh:sdp-compose:${DepVers.SDP_COMPOSE_VER}"
    const val LIFECYCLE_VM = "androidx.lifecycle:lifecycle-viewmodel-ktx:${DepVers.LIFECYCLE_VER}"
    const val LIFECYCLE_LIVE_DATA =
        "androidx.lifecycle:lifecycle-livedata-ktx:${DepVers.LIFECYCLE_VER}"
    const val LIFECYCLE_RUN_TIME =
        "androidx.lifecycle:lifecycle-runtime-ktx:${DepVers.LIFECYCLE_VER}"
    const val LIFECYCLE_PROCESS = "androidx.lifecycle:lifecycle-process:${DepVers.LIFECYCLE_VER}"
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
    const val RECYCLER_VIEW = "androidx.recyclerview:recyclerview:${DepVers.RECYCLER_VIEW_VER}"
    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${DepVers.FRAGMENT_VERSION}"
    const val ROUNDED_IMAGEVIEW = "com.makeramen:roundedimageview:${DepVers.ROUNDED_IMAGE_VERSION}"
    const val FLEXBOX_LAYOUT = "com.google.android.flexbox:flexbox:${DepVers.FLEXBOX_VER}"
    const val MEDIA = "androidx.media:media:${DepVers.MEDIA_VER}"
    const val APP_LOVIN = "com.applovin:applovin-sdk:${DepVers.APP_LOVIN_VER}"
    const val GOOGLE_PLAY_SERVICE =
        "com.google.android.gms:play-services-location:${DepVers.GOOGLE_PLAY_SERVICE_VER}"
    const val GOOGLE_ADS_IDENTIFIER =
        "com.google.android.gms:play-services-ads-identifier:${DepVers.GOOGLE_ADS_IDENTIFIER}"

    const val FIREBASE_BOM = "com.google.firebase:firebase-bom:${DepVers.FIREBASE_BOM_VER}"
    const val FIREBASE_ANALYTICS = "com.google.firebase:firebase-analytics-ktx"
    const val FIREBASE_CRASHLYTIC = "com.google.firebase:firebase-crashlytics-ktx"
    const val FIREBASE_CRASHLYTIC_NDK = "com.google.firebase:firebase-crashlytics-ndk"
    const val FIREBASE_REMOTE_CONFIG = "com.google.firebase:firebase-config-ktx"
    const val ADMOB = "com.google.android.gms:play-services-ads:${DepVers.ADMOB_VER}"
    const val SHIMMER_LAYOUT = "com.facebook.shimmer:shimmer:${DepVers.SHIMMER_VER}"
    const val FLAG_KIT = "com.github.murgupluoglu:flagkit-android:${DepVers.FLAG_KIT_VER}"

    val CAMERAX_REQUIREMENT_LIBS = arrayOf(
        "androidx.camera:camera-core:${DepVers.CAMERAX_VER}",
        "androidx.camera:camera-camera2:${DepVers.CAMERAX_VER}",
        "androidx.camera:camera-lifecycle:${DepVers.CAMERAX_VER}",
        "androidx.camera:camera-view:${DepVers.CAMERAX_VER}",
        "androidx.camera:camera-video:${DepVers.CAMERAX_VER}",
        "androidx.camera:camera-extensions:${DepVers.CAMERAX_VER}"
    )

    val EXO_PLAYER_LIBS_3 = arrayOf(
        "androidx.media3:media3-exoplayer:${DepVers.EXO_PLAYER_3_VER}",
        "androidx.media3:media3-exoplayer-dash:${DepVers.EXO_PLAYER_3_VER}",
        "androidx.media3:media3-ui:${DepVers.EXO_PLAYER_3_VER}"
    )
    val EXO_PLAYER_LIBS_2 = arrayOf(
        "com.google.android.exoplayer:exoplayer-core:${DepVers.EXO_PLAYER_2_VER}",
        "com.google.android.exoplayer:exoplayer-dash:${DepVers.EXO_PLAYER_2_VER}",
        "com.google.android.exoplayer:exoplayer-ui:${DepVers.EXO_PLAYER_2_VER}"
    )

    val ADJUST_SDK_LIBS = arrayOf(
        "com.adjust.sdk:adjust-android:${DepVers.ADJUST_SDK_VER}",
        "com.android.installreferrer:installreferrer:2.2",
        "com.google.android.gms:play-services-appset:16.0.2",
        "com.adjust.sdk:adjust-android-webbridge:${DepVers.ADJUST_SDK_VER}"
    )

    const val TENSORFLOW_AUDIO_TASK =
        "org.tensorflow:tensorflow-lite-task-audio:${DepVers.TENSOR_FLOW_AUDIO_TASK}"

    const val COMPOSE_LOTTIES = "com.airbnb.android:lottie-compose:${DepVers.LOTTIE_VER}"
    const val GLIDE_COMPOSE = "com.github.bumptech.glide:compose:${DepVers.GLIDE_COMPOSE}"
    const val SHIMMER_COMPOSE = "com.valentinilk.shimmer:compose-shimmer:${DepVers.SHIMMER_COMPOSE}"
    const val HILT_NAV_COMPOSE =
        "androidx.hilt:hilt-navigation-compose:${DepVers.HILT_NAV_COMPOSE_VER}"
    const val IRONSOURCE_ADAPTER =
        "com.google.ads.mediation:ironsource:${AdmobDepsVer.IRON_SOURCE_VERS}"
    const val PANGLE_ADAPTER = "com.google.ads.mediation:pangle:${AdmobDepsVer.PANGLE_VERS}"
    const val META_NETWORK = "com.google.ads.mediation:facebook:${AdmobDepsVer.META_VERS}"
}

object DepVers {
    const val KTX_CORE_VER = "1.10.1"
    const val APPCOMPAT_VER = "1.6.1"
    const val MATERIAL_VER = "1.9.0"
    const val CONSTRAINT_LAYOUT_VER = "2.1.4"
    const val JUNIT_TEST_VER = "4.13.2"
    const val JUNIT_TEST_EXT_VER = "1.1.5"
    const val EPRESSO_CORE = "3.5.1"
    const val GSON_VER = "2.10.1"
    const val EVENTBUS_VER = "3.3.1"
    const val SDP_VER = "1.1.0"
    const val SDP_COMPOSE_VER = "1.1.0"
    const val LIFECYCLE_VER = "2.6.2"
    const val GLIDE_VER = "4.16.0"
    const val LOTTIE_VER = "6.1.0"
    const val RETROFIT_VER = "2.9.0"
    const val ROOM_VER = "2.5.2"
    const val CIRCLE_IMAGEVIEW_VER = "3.1.0"
    const val RECYCLER_VIEW_VER = "1.3.1"
    const val FRAGMENT_VERSION = "1.6.1"
    const val ROUNDED_IMAGE_VERSION = "2.3.0"
    const val FLEXBOX_VER = "3.0.0"
    const val CAMERAX_VER = "1.3.0-alpha05"
    const val EXO_PLAYER_3_VER = "1.1.1"
    const val EXO_PLAYER_2_VER = "2.19.1"
    const val MEDIA_VER = "1.6.0"
    const val APP_LOVIN_VER = "+"
    const val GOOGLE_PLAY_SERVICE_VER = "21.0.1"
    const val GOOGLE_ADS_IDENTIFIER = "18.0.1"
    const val FIREBASE_BOM_VER = "32.2.3"
    const val ADMOB_VER = "22.4.0"
    const val SHIMMER_VER = "0.5.0"
    const val FLAG_KIT_VER = "1.0.2"
    const val NAVIAGATION_VER = "2.7.2"
    const val ADJUST_SDK_VER = "4.34.0"
    const val TENSOR_FLOW_AUDIO_TASK = "0.4.4"
    const val HILT_NAV_COMPOSE_VER = "1.0.0"
    const val GLIDE_COMPOSE = "1.0.0-alpha.5"
    const val SHIMMER_COMPOSE = "1.0.5"
    const val MINTEGRAL_VERS = "16.4.91.0"
    const val IRON_SOURCE_VERS = "7.4.0.0"
    const val PANGLE_VERS = "5.3.0.6.0"
    const val META_VERS = "6.16.0.0"
}