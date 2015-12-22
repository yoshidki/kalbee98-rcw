■プロジェクト説明
レシピ管理プログラム


■プロジェクト構成

(root)
├ README.txt - 本書
└ src - コード格納フォルダ

■実行方法

1. src フォルダに移動

2. 次のコマンドでプログラムをビルド
> javac -encoding utf-8 Recipe.java 

3. 実行
> java Recipe {レシピファイル}

■レシピファイルフォーマット
文字コード: UTF-8
レシピタイトル:一行に一つずつ

<例>recipe-data.txt
オムライス
親子丼
杏仁豆腐

以上
