package firebase_configs

import Deps
import org.gradle.kotlin.dsl.DependencyHandlerScope

fun DependencyHandlerScope.firebaseCoreImplementation() {
    "implementation"(platform(Deps.FIREBASE_BOM))
    "implementation"(Deps.FIREBASE_ANALYTICS)
    "implementation"(Deps.FIREBASE_REMOTE_CONFIG)
}