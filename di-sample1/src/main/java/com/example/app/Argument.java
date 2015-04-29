package com.example.app;

import lombok.Data;

/*
 * 「@Data」アノテーションを付与すると、
 *  Lombokの機能によりコンパイル時に以下のメソッドが生成される。
 * 
 * ・各フィールドの「setter/getter」
 *   ※ フィールドがfinal修飾子が付与されている場合は、「setter」は作成されず
 *    aとbを引数にもつコンストラクタが生成される
 * ・「toStringメソッド」
 * ・「equalsメソッド」
 * ・「hashCodeメソッド」
 */

@Data 
public class Argument {
	private final int a;
	private final int b;
}
