object Versions{
    var kotlin = "1.3.50"
    var appcompat = "1.1.0"
    var core_ktx = "1.1.0"
    var constraint_layout = "1.1.3"
    var junit = "4.12"
    var test_ext = "1.1.1"
    var espresso_core = "3.2.0"
    var build_gradle = "3.5.1"
}

object Deps{
    var kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    var appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    var core_ktx = "androidx.core:core-ktx:${Versions.core_ktx}"
    var constraint_layout = "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"
    var tools_build_gradle = "com.android.tools.build:gradle:${Versions.build_gradle}"
    var kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

object Tests{
    var junit = "junit:junit:${Versions.junit}"
    var test_ext = "androidx.test.ext:junit:${Versions.test_ext}"
    var test_espresso = "androidx.test.espresso:espresso-core:${Versions.espresso_core}"
}