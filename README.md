
# Project Title

A brief description of what this project does and who it's for

Step 1 - Add into project level gradle file

~~~ 
dependencyResolutionManagement {
    
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    
    repositories {
    
        mavenCentral()
    
        maven { url 'https://jitpack.io' }
    }
}
~~~

Step 2- Add into module level gradle file
~~~
dependencies {
    implementation 'com.github.Atvantiq:JaspalToast:v1.1.0'
}
~~~
