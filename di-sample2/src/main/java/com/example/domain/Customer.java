package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * ドメイン・オブジェクト
 * 
 * 「@AllArgsConstructor」アノテーションで、全フィールドを引数に持つコンストラクタを生成
 * 「@NoArgsConstructor」アノテーションで、デフォルトコンストラクタを生成
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;
}
