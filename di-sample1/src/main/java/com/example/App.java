package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.app.Argument;
import com.example.app.ArgumentResolver;
import com.example.app.Calculator;

/*
 * 「@ComponentScan」アノテーションが付与すると、
 * このクラスのパッケージ以下を走査して、以下のアノテーションが付いているJavaクラスを検出してDIコンテナに登録する
 * ・@Component
 * 
 * ・@Controller
 *   Spring MVCのコントローラーであることを示す
 *
 * ・@Service
 *   「サービス・クラス」である事を示す
 *
 * ・@Repository
 *   「リポジトリ・クラス」である事を示す
 * 
 * 「@Component」が付与されたクラス
 * AddCalculator.java
 * ScannerArgumentResolver.java
 */

/*
 * 「CommandLineRunner」インターフェースを実装すると、
 * AppクラスにDIコンテナがインジェクションできるようになる
 */

/*
 * @SpringBootApplicationアノテーションは1.2から追加されたもので、
 * @EnableAutoConfiguration + @ComponentScan + @Configurationを1つにまとめたもの
 */

//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
public class App implements CommandLineRunner {

	/*
	 * 「@Autowired」アノテーションを付与すると、
	 * 「DIコンテナ」が「インジェクション」すべき「フィールド」であることを示す。
	 * 
	 * 「@Autowired」アノテーションを付与したクラスが「DIコンテナ」で管理されると、
	 * 「@Autowired」アノテーションを付与された「フィールド」に合致する型のオブジェクトを探してインジェクションする。
	 * この機能を「オート・ワイヤリング」と呼ぶ。
	 */
	
	@Autowired
	ArgumentResolver argumentResolver;
	@Autowired
	Calculator calculator;

	@Override
	public void run(String... strings) throws Exception {
		System.out.print("Enter 2 numbers like 'a b' : ");
		Argument argument = argumentResolver.resolve(System.in);
		int result = calculator.calc(argument.getA(), argument.getB());
		System.out.println("result = " + result);
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}