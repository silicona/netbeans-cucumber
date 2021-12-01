# Readme

## Ejecutar test
  - Ejecutar todas las suites: contra-botón sobre root y `Test`
  - Ejecutar una suite: contraboton sobre el archivo y `Test file`

  - Ejecutar `mvn test`desde root - No se actualiza?

### Env

Archivo test/resources/cucumber-properties de configuracion de cucumber

Archivo opcional test/resources/junit-platform.propieties

## Appium
Confirmar variables `JAVA_HOME` y `ANDROID_HOME`:
  - Mac:
    - Confirmar la instalacion de Java JDK: Ejecutar en terminal `javac -version`
    - Obtener la ruta del JDK: Ejecutar `/usr/libexec/java_home -V`
      - Esto devuelve las rutas de todos los JDK instalados
    - Definir JAVA_HOME: Ejecutar `export JAVA_HOME="/Library/Java/JavaVirtualMachines/jdk-14.0.1.jdk/Contents/Home"
    - Puede que sea erroneo: Definir JAVA_HOME: Ejecutar `export PATH=$PATH:$JAVA_HOME="/Library/Java/JavaVirtualMachines/jdk-14.0.1.jdk/Contents/Home"
    - O definir en Appium / configuracion
    - ANDROID_HOME: You can find Android Home url from Android Studio > Preferences System Settings > Android SDK > Android SDK Location textbox
 SDK Folder (ANDROID_HOME): /Users/nadies/Library/Android/sdk
JDK Location: /Applications/Android Studio.app/Contents/jre/jdk/Contents/Home

[cucumber Env](https://cucumber.io/docs/cucumber/environment-variables)
[blog original](https://enmilocalfunciona.io/creacion-test-automatizado-con-cucumber-java-selenium-y-appium)
[Suite cucumber Appium](https://github.com/cristinalopezgj/CucumberSeleniumAppiumProject)

https://github.com/boobalaninfo/javaworkspace