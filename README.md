JavaFX+RoboVM Sample
====================

IntelliJからScean Builder起動
----------------------------

- IntelliJが対応してるみたい

> SceneBuilder 2.0をIntelliJ IDEAのUIエディタに統合したため、.fxmlファイルを編集するのにIntelliJ IDEAを離れる必要がなくなりました(この機能を使うにはIntelliJ IDEAをJava 8で起動する必要があります)

> http://blog.jetbrains.com/jp/2014/06/27/466


- Java VMの起動を 1.6*から1.8にした

> 参考
> YosemiteでJetBrains IDEを動かす
> http://samuraism.com/2014/10/17/2555

- OracleからJavaFX Scene Builderダウンロードした

> JavaFX Scene Builder Archive
> http://www.oracle.com/technetwork/java/javase/downloads/javafxscenebuilder-1x-archive-2199384.html

- src/main/resources に置くと new FXMLLoader().load(getClass().getResource("/main.fxml")で見える

- JavaFXの場所をIntelliJに教える
  * Languages & Frameworks >
  * JavaFX >
  * Path to SceneBuilder >
  * /Applications/JavaFX Scene Builder 1.1.app/

- FXMLファイルを右クリック Open In Scene Builder

- FXMLとControllerの復習

> Migration from Swing to JavaFX
> http://www.slideshare.net/skrb/migration-from-swing-to-javafx


