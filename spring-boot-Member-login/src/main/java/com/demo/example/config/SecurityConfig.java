package com.demo.example.config;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			/*
			 * 開始自訂授權規則
			 */
			.authorizeRequests()
			/*
			 * 「/users」這個API及其底下的所有GET請求，需通過身份驗證才可存取。
			 */
			.antMatchers(HttpMethod.GET, "/user").authenticated()
			/*
			 * 其餘API的所有GET請求，允許所有呼叫方存取
			 */
			.antMatchers(HttpMethod.GET).permitAll()
			/*
			 * 「/users」這個API的POST請求，允許所有呼叫方存取
			 */
			.antMatchers(HttpMethod.POST, "/users").permitAll()
			/*其餘的所有API，需通過身份驗證才可存取。
			 * 使用「anyRequest」方法，會對剩下的API定義規則，所以才放在最後一個。
			 * 此處規定只有通過驗證的呼叫方才可存取，否則會收到HTTP 403（Forbidden）的狀態碼。
			 */
			.anyRequest().authenticated()
			.and()
			/*
			 * 關閉對CSRF（跨站請求偽造）攻擊的防護。
			 * 這樣Security機制才不會拒絕外部直接對API發出的請求，如Postman與前端。
			 */
			.csrf().disable()
			/*
			 * 啟用內建的登入畫面
			 */
			.formLogin();
	}
}
