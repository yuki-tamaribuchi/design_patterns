[Software design pattern](https://en.wikipedia.org/wiki/Software_design_pattern)


# Creational Patterns

## Abstract factory

[https://ja.wikipedia.org/wiki/Abstract_Factory_%E3%83%91%E3%82%BF%E3%83%BC%E3%83%B3](https://ja.wikipedia.org/wiki/Abstract_Factory_%E3%83%91%E3%82%BF%E3%83%BC%E3%83%B3)

関連するインスタンス群を生成するためのAPIを集約することで、複数のモジュール群の再利用を効率化する。

実装例では、Abstract FactoryであるCarFactoryが、Concrete FactoryであるINDIACarFactoryのbuildCarを呼び出す。
buildCarメソッドでは、Car型クラスを継承した各国のCarクラスのインスタンスを作成する。locationを切り替えることでCarクラスを変えられる。
ユーザはCarFactoryのbuildCarメソッドを呼び出すだけでcarインスタンスを取得することができる。