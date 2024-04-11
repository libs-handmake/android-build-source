package core_configs

import Deps
import org.gradle.kotlin.dsl.DependencyHandlerScope

fun DependencyHandlerScope.coreAppImplementations() {
    "implementation"(Deps.KTX_CORE)
    "implementation"(Deps.APPCOMPAT)
    "implementation"(Deps.MATERIAL)
    "implementation"(Deps.CONSTRAINT_LAYOUT)
    "testImplementation"(Deps.JUNIT_TEST)
    "androidTestImplementation"(Deps.JUNIT_TEST_EXT)
    "androidTestImplementation"(Deps.EPRESSO_CORE)
    "implementation"(Deps.RECYCLER_VIEW)
    "implementation"(Deps.GSON)
}

fun DependencyHandlerScope.jetpackComponentImplementation() {
    "implementation"(Deps.SDP)
    "implementation"(Deps.SSP)
    "implementation"(Deps.CIRCLE_IMAGE_VIEW)
    "implementation"(Deps.RECYCLER_VIEW)
    "implementation"(Deps.HILT)
    "kapt"(Deps.HILT_COMPILER)
    "implementation"(Deps.GLIDE)
    "kapt"(Deps.GLIDE_COMPILER)
    "implementation"(Deps.LIFECYCLE_VM)

    "implementation"(Deps.LIFECYCLE_VM)
    "implementation"(Deps.LIFECYCLE_LIVE_DATA)
    "implementation"(Deps.LIFECYCLE_RUN_TIME)
    "implementation"(Deps.LIFECYCLE_VM_STATE)
    "kapt"(Deps.LIFECYCLE_JAVA_COMMON)
    "implementation"(Deps.LIFECYCLE_JAVA_COMMON)
    "implementation"(Deps.FRAGMENT_KTX)
    "implementation"(Deps.ACTIVITY)
    "implementation"(Deps.ACTIVITY_KTX)
    "implementation"(Deps.ROUNDED_IMAGEVIEW)
}