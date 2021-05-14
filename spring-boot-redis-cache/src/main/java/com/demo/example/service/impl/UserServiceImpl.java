package com.demo.example.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.demo.example.beans.APPUser;
import com.demo.example.repository.AppUserRepository;
import com.demo.example.service.UserService;

@Service
@CacheConfig(cacheNames = "userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private AppUserRepository userDao;

	/**
	 * cacheNames 與 value 定義一样，若設置了 value 的值，cacheNames 配置就無效。<br>
	 * 使用 keyGenerator ，注意是否在config中定義好。
	 */
	@Override
//    @Cacheable(value = "getAllUsers")
	@Cacheable(value = "getAllUsers", keyGenerator = "wiselyKeyGenerator")
	public List<APPUser> getAllUsers() {
		return userDao.findAll();
	}

	/**
	 * 執行時,將清除value = getAllUsers cache 【cacheNames = "userService"】 也可指定清除的key
	 * 【@CacheEvict(value="abc")】
	 */
	@CacheEvict(value = "getAllUsers", allEntries = true)
	public void clearAllUserCache() {

	}

	/**
	 * key ="#p0" 表示已第一個參數作為key
	 */
	@Override
	@Cacheable(value = "redis", key = "#p0")
	public APPUser findById(Integer pId) {
		Optional<APPUser> _User = userDao.findById(pId);
		System.out.println("從資料庫查找完.....");
		return Optional.ofNullable(_User).get().orElse(null);
	}

	@CacheEvict(value = "user", key = "#p0")
	public void clear(Integer pId) {

	}

	@Override
	public Iterable<APPUser> inseruser(APPUser aPPUser) {
		userDao.save(aPPUser);
		
		return userDao.findAll();
	}
}
