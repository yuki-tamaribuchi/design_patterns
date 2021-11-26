[Software design pattern](https://en.wikipedia.org/wiki/Software_design_pattern)


# Creational Patterns

## Abstract factory

[https://ja.wikipedia.org/wiki/Abstract_Factory_%E3%83%91%E3%82%BF%E3%83%BC%E3%83%B3](https://ja.wikipedia.org/wiki/Abstract_Factory_%E3%83%91%E3%82%BF%E3%83%BC%E3%83%B3)

関連するインスタンス群を生成するためのAPIを集約することで、複数のモジュール群の再利用を効率化する。

実装例では、Abstract FactoryであるCarFactoryが、Concrete FactoryであるINDIACarFactoryのbuildCarを呼び出す。
buildCarメソッドでは、Car型クラスを継承した各国のCarクラスのインスタンスを作成する。locationを切り替えることでCarクラスを変えられる。
ユーザはCarFactoryのbuildCarメソッドを呼び出すだけでcarインスタンスを取得することができる。



## Builder

[https://ja.wikipedia.org/wiki/Builder_%E3%83%91%E3%82%BF%E3%83%BC%E3%83%B3](https://ja.wikipedia.org/wiki/Builder_%E3%83%91%E3%82%BF%E3%83%BC%E3%83%B3)

オブジェクトの生成過程を抽象化することで、動的なオブジェクトの生成を可能にする

実装例では、HouseBuilderインターフェイスを継承し、IglooHouseBuilderクラスとTipiHouseBuilderクラスを作成し具体的なメソッドを実装。
IglooHouseBuilderのインスタンスを作成し、CivilEngineerクラスに引数として渡し、engineerインスタンスを作成。CivilEngineerクラスの引数は汎化されたHouseBuilder型なので、HouseBuilderを継承しているクラスであれば受け取ることができる（？）。
constructHouseメソッドでhouseBuilderインスタンスのbuild*メソッドを呼び出している。