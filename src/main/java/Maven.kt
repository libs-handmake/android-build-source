import org.gradle.api.artifacts.dsl.RepositoryHandler
import org.gradle.kotlin.dsl.maven

fun RepositoryHandler.ironSource() =
    maven("https://android-sdk.is.com")

fun RepositoryHandler.mintegral() =
    maven("https://dl-maven-android.mintegral.com/repository/mbridge_android_sdk_oversea")

fun RepositoryHandler.jitpackIO() = maven("https://jitpack.io")

fun RepositoryHandler.appLovin() = maven("https://artifacts.applovin.com/android")
