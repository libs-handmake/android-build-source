package compose_config

import DepVers
import Deps
import org.gradle.kotlin.dsl.DependencyHandlerScope

fun DependencyHandlerScope.composeImplementations() {
    val composeBom = platform("androidx.compose:compose-bom:2024.06.00")
    "implementation"(composeBom)
    "androidTestImplementation"(composeBom)

    "implementation"("androidx.compose.ui:ui-graphics")
    // Choose one of the following:
    // Material Design 3
    "implementation"("androidx.compose.material3:material3")
    "implementation"("androidx.compose.material3:material3-android:1.2.1")
    // or skip Material Design and build directly on top of foundational components
    "implementation"("androidx.compose.foundation:foundation")
    // or only import the main APIs for the underlying toolkit systems,
    // such as input and measurement/layout
    "implementation"("androidx.compose.ui:ui")
    // Android Studio Preview support
    "implementation"("androidx.compose.ui:ui-tooling-preview")
    "debugImplementation"("androidx.compose.ui:ui-tooling")
    // UI Tests
    "androidTestImplementation"("androidx.compose.ui:ui-test-junit4")
    "debugImplementation"("androidx.compose.ui:ui-test-manifest")
    // Optional - Included automatically by material, only add when you need
    // the icons but not the material library (e.g. when using Material3 or a
    // custom design system based on Foundation)
    "implementation"("androidx.compose.material:material-icons-core")
    // Optional - Add full set of material icons
    "implementation"("androidx.compose.material:material-icons-extended")
    // Optional - Add window size utils
    "implementation"("androidx.compose.material3:material3-window-size-class")

    // Optional - Integration with activities
    "implementation"("androidx.activity:activity-compose:1.9.1")
    // Optional - Integration with ViewModels
    "implementation"("androidx.lifecycle:lifecycle-viewmodel-compose:${DepVers.LIFECYCLE_VER}")
    "implementation"("androidx.lifecycle:lifecycle-runtime-compose:${DepVers.LIFECYCLE_VER}")
    // Optional - Integration with LiveData
    "implementation"("androidx.compose.runtime:runtime-livedata")
    "implementation"("androidx.navigation:navigation-compose:${DepVers.NAVIAGATION_VER}")
    //sdp support
    "implementation"(Deps.SDP_COMPOSE)
    //other support
    "implementation"(Deps.HILT_NAV_COMPOSE)
    "implementation"(Deps.GLIDE_COMPOSE)
    "implementation"(Deps.CONSTRAINT_LAYOUT_COMPOSE)

}