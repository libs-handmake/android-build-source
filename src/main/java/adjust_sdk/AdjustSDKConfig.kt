package adjust_sdk

import org.gradle.kotlin.dsl.DependencyHandlerScope

fun DependencyHandlerScope.implementationAdjustSDK() {
    for (dep in Deps.ADJUST_SDK_LIBS) {
        "implementation"(dep)
    }
}